pipeline {

    agent {
        docker {
            image 'maven:3.8.7-eclipse-temurin-11'
            args '-v /root/.m2:/root/.m2'
        }
    }

    stages {
        stage("CI :: Build") {
            steps {
                sh 'mvn build -DskipTests'
            }
        }
        stage("CI :: Unit Test") {
            steps {
                sh 'mvn test'
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