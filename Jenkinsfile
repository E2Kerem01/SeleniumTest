pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
               
                bat "git clone https://github.com/E2Kerem01/TrendyolSeleniumTest"
                bat "mvn clean -f TrendyolSeleniumTest"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f TrendyolSeleniumTest"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f TrendyolSeleniumTest0"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f TrendyolSeleniumTest"
            }
        }
    }
}
