pipeline {
    agent any
    environment {
        DOCKERHUB_CREDENTIALS=credentials('dockerhub')
        DOCKERHUB_USERNAME='nishthapaul'
        SCANNER_HOME=tool 'sonar-scanner'
    }
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

          stage ("SonarQube Analysis") {
                  steps {
                        dir('Backend') {
                            withSonarQubeEnv('sonar-server') {
                                sh ''' $SCANNER_HOME/bin/sonar-scanner \
                                -Dsonar.projectName=Calculator \
                                -Dsonar.java.binaries=. \
                                -Dsonar.sources=/src/main/java \
                                -Dsonar.sourceEncoding=UTF-8 \
                                -Dsonar.language=java \
                                -Dsonar.projectKey=Calculator '''
                                }
                         }
                   }
            }

          stage ("Run tests") {
                steps {
                    sh 'mvn test'
                }
          }

          stage ("Create Docker Image") {
                steps {
                    sh 'docker build -t nishthapaul/calculator-app .'
                }
          }

          stage ("Push docker image") {
                steps {
                    script {
                        sh 'docker login -u $DOCKERHUB_USERNAME -p $DOCKERHUB_CREDENTIALS'
                        sh 'docker push nishthapaul/calculator-app'
                    }
                }
          }

          stage ("Run Ansible Playbook") {
                  steps {
                      sh 'ansible-playbook -i inventory deploy.yml'
                  }
            }
    }

    post {
        success {
            jacoco()
        }
        failure {
            script {
                def jenkinsBuildUrl = "http://localhost:8080/job/${env.JOB_NAME}/${env.BUILD_NUMBER}/console"
                mail bcc: '', cc: '', from: '', replyTo: '', to: 'paulnishtha19@gmail.com', subject: "Pipeline failed in Jenkins: ${env.JOB_NAME} - #${env.BUILD_NUMBER}", body: "Check console output at ${jenkinsBuildUrl} to view the results."
            }
        }
    }
}
