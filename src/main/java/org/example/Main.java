package org.example;

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
            System.out.println("- 5. Power                             -");
            System.out.println("- 6. Natural Logarithm (base e)        -");
            System.out.println("- 7. Division                          -");
            System.out.println("- ------------------------------------ -");
            System.out.print("- Please enter your Choice : ");
            operation = Integer.parseInt(br.readLine());
            Calculator calculator = new Calculator();
            int result = 0;
            switch (operation) {
                case 1: {
                    System.out.println("- Addition Operation selected          -");
                    System.out.println("- ------------------------------------ -");
                    System.out.print("- Enter the first operand : ");
                    int n1 = Integer.parseInt(br.readLine());
                    System.out.print("- Enter the second operand : ");
                    int n2 = Integer.parseInt(br.readLine());
                    result = calculator.add(n1, n2);
                }
            }
            System.out.println("- The output is ::: " + result);
            System.out.println("- ------------------------------------ -");
            System.out.print("Do you want to continue (y/n) ? : ");
            ch = br.readLine().charAt(0);
        } while (ch != 'n');
        System.out.println("---------------------- -----------------");
        System.out.println("-  Thank you for using the calculator  -");
        System.out.println("----------------------------------------");
    }
}
