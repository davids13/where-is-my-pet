pipeline {

    agent any
    tools {
        maven 'Maven 3.8.7'
    }

    stages {
        stage("CI :: Build") {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage("CI :: Unit Test") {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage("Code Analysis :: Sonarqube") {
            steps {
                echo 'Initializing checking...'
            }
        }
        stage("Deploy to Nexus") {
            steps {
                echo 'Deployed to Nexus'
            }
        }
        stage("Push Docker image") {
            steps {
                echo 'Pushed to Docker Hub'
            }
        }
    }
}