def call(String repoUrl){
    pipeline {
       agent any
       stages {
           stage("Divine-Tools initialization") {
               steps {
                   sh 'ls'
                   sh 'java -version'
               }
           }
           stage("Divine-Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("Divine-to-test-maven") {
               steps {
                   sh 'lsblk'
               }
           }
       }
}
}
