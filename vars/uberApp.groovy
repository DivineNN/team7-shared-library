def call(string repoUrl){
    pipeline {
       agent any
       stages {
           stage("Tools initialization") {
               steps {
                   sh 'ls'
                   sh 'java -version'
               }
           }
           stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("to-test-maven") {
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
