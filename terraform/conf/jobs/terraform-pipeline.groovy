#!groovy

pipeline {
    agent any
    options {
        buildDiscarder(logRotator(numToKeepStr: '100'))
        ansiColor('xterm')
    }
    stages {
        stage('git clone') {
            steps {
                git branch: "${params.BRANCH}",
                    credentialsId: 'jenkins',
                    url: 'git@github.com:KelBornn/terraform-project.git'
            }
        }
    }
}
