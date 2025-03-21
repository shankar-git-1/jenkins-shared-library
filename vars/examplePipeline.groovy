// vars/examplePipeline.groovy
def call(Map config = [:]) {
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    script {
                        echo "Checking out code from ${config.repoUrl}"
                        git branch: config.branch, url: config.repoUrl
                    }
                }
            }
            stage('Build') {
                steps {
                    script {
                        echo "Building the project..."
                    }
                }
            }
            stage('Test') {
                steps {
                    script {
                        echo "Running tests..."
                    }
                }
            }
            stage('Deploy') {
                steps {
                    script {
                        echo "Deploying the application..."
                    }
                }
            }
        }
    }
}
