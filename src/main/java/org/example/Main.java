package org.example;

import org.example.exceptions.DivisionByZeroException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----------------------------------------");
        System.out.println("- Welcome to The Scientific Calculator -");
        System.out.println("----------------------------------------");
        int operation = 0;
        char ch;
        do {
            System.out.println("-         Calculator Functions         -");
            System.out.println("- 1. Addition                          -");
            System.out.println("- 2. Multiplication                    -");
            System.out.println("- 3. Division                          -");
            System.out.println("- 4. Square Root                       -");
            System.out.println("- 5. Factorial                         -");
            System.out.println("- 6. Natural Logarithm (base e)        -");
            System.out.println("- 7. Power                             -");
            System.out.println("- ------------------------------------ -");
            System.out.print("- Please enter your Choice : ");
            operation = Integer.parseInt(br.readLine());
            Calculator calculator = new Calculator();
            double result = 0;
            boolean success = true;
            switch (operation) {
                case 1: {
                    System.out.println("- Addition Operation selected          -");
                    System.out.println("- ------------------------------------ -");
                    System.out.print("- Enter the first operand : ");
                    int n1 = Integer.parseInt(br.readLine());
                    System.out.print("- Enter the second operand : ");
                    int n2 = Integer.parseInt(br.readLine());
                    result = calculator.add(n1, n2);
                    break;
                }
                case 2: {
                    System.out.println("- Multiplication Operation selected    -");
                    System.out.println("- ------------------------------------ -");
                    System.out.print("- Enter the first operand : ");
                    int n1 = Integer.parseInt(br.readLine());
                    System.out.print("- Enter the second operand : ");
                    int n2 = Integer.parseInt(br.readLine());
                    result = calculator.multiply(n1, n2);
                    break;
                }
                case 3: {
                    System.out.println("- Division Operation selected          -");
                    System.out.println("- ------------------------------------ -");
                    System.out.print("- Enter the first operand : ");
                    int n1 = Integer.parseInt(br.readLine());
                    System.out.print("- Enter the second operand : ");
                    int n2 = Integer.parseInt(br.readLine());
                    try {
                        result = calculator.divide(n1, n2);
                    } catch (DivisionByZeroException e) {
                        System.out.println("- Division By Zero is not allowed");
                        success = false;
                    }
                    break;
                }
                case 4: {
                    System.out.println("- Square Root Operation selected       -");
                    System.out.println("- ------------------------------------ -");
                    System.out.print("- Enter the operand : ");
                    double n = Double.parseDouble(br.readLine());
                    try {
                        result = calculator.squareRoot(n);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        success = false;
                    }
                    break;
                }
                case 5: {
                    System.out.println("- Factorial Operation selected       -");
                    System.out.println("- ------------------------------------ -");
                    System.out.print("- Enter the operand : ");
                    int n = Integer.parseInt(br.readLine());
                    try {
                        result = calculator.factorial(n);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        success = false;
                    }
                    break;
                }
                case 7: {
                    System.out.println("- Power Operation selected       -");
                    System.out.println("- ------------------------------------ -");
                    System.out.print("- Enter the first operand : ");
                    int n1 = Integer.parseInt(br.readLine());
                    System.out.print("- Enter the second operand : ");
                    int n2 = Integer.parseInt(br.readLine());
                    result = calculator.power(n1, n2);
                    break;
                }
            }
            if ( success ) {
                System.out.println("- The output is ::: " + result);
            }
            System.out.println("- ------------------------------------ -");
            System.out.print("- Do you want to continue (y/n) ? : ");
            ch = br.readLine().charAt(0);
        } while (ch != 'n');
        System.out.println("---------------------- -----------------");
        System.out.println("-  Thank you for using the calculator  -");
        System.out.println("----------------------------------------");
    }
}
