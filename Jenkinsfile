pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B clean compile'
            }
        }

        stage('Testes Unitarios') {
            steps {
                sh 'mvn -B verify'
            }

            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Analise Estatica') {
            steps {
                sh 'mvn -B checkstyle:check'
            }
        }

        stage('Deploy Staging') {
            when {
                expression {
                    env.GIT_BRANCH == 'origin/develop'
                }
            }

            steps {
                sh 'mvn -B package -DskipTests'
                echo 'Deploy em staging concluido (simulado)'
            }
        }
    }

    post {
        success {
            echo 'Pipeline concluido com sucesso'
        }

        failure {
            echo 'Notificacao de falha: o pipeline quebrou, confira o log do build'
        }
    }
}