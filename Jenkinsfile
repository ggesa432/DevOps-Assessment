pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the latest code from GitHub
                git branch: 'main', url: 'https://github.com/ggesa432/DevOps-Assessment.git'
            }
        }

        stage('Build') {
            steps {
                // Run the build command (adjust according to your project needs)
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run tests (adjust according to your project needs)
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Deployment steps (adjust this section based on your deployment strategy)
                echo 'Deploying the application...'
                // Example deployment command (modify as needed)
                // sh './deploy.sh' or other deployment scripts/commands
            }
        }
    }

    post {
        success {
            echo 'Build and deployment completed successfully!'
        }
        failure {
            echo 'Build failed.'
        }
    }
}

