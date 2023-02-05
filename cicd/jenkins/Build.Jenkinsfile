pipeline {

    agent any

    stages {
        stage("CI :: Build") {
            steps {
                'sh mvn build'
            }
        }
        stage("CI :: Unit Test") {
            steps {
                'sh mvn test'
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