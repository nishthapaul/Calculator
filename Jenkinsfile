pipeline {
    agent any
    stages {
          stage ("Clone Git") {
                steps {
                    git branch: 'main', url: 'https://github.com/nishthapaul/Calculator.git'
                }
          }

          stage ("Build via Maven") {
                steps {
                    sh 'mvn clean install'
                }
          }

          stage ("Run tests") {
                steps {
                    sh 'mvn test'
                }
          }
    }
}