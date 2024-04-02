pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'simple-application:latest'
    }

    stages {
        stage('Build') {
            steps {
                // Build the Spring Boot application
                bat 'mvnw clean package' // Use 'bat' instead of 'sh' for Windows
            }
        }

        stage('Build Docker Image') {
            steps {
                // Build the Docker image
                script {
                    docker.build DOCKER_IMAGE
                }
            }
        }

        stage('Deploy Docker Image') {
            steps {
                // Run the Docker container
                script {
                    docker.image(DOCKER_IMAGE).withRun('-p 8099:8080') { c ->
                        echo "Container ${c.id} is running on port 8099"
                    }
                }
            }
        }

        stage('Cleanup') {
            steps {
                // Clean up Docker images
                script {
                    docker.image(DOCKER_IMAGE).remove()
                }
            }
        }
    }
}
    }
}
