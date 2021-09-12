pipeline {
    agent any
    stages {
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
