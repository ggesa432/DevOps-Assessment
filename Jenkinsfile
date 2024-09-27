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
                // Run the build command 
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run tests 
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Deployment steps 
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

