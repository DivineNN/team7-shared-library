def call(String repoUrl){
    pipeline {
       agent any
       stages {
           stage("Steeve-Tools initialization") {
               steps {
                   sh 'ls'
                   sh 'java -version'
               }
           }
           stage("Steeve-Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("Steeve-to-test-maven") {
               steps {
                   sh 'lsblk'
               }
           }
           stage('build'){
            steps{
                echo "demo uber app"
            }
           }
       }
}
}
