pipeline {

    agent any

    stages {

        stage ('Build') {
            steps {
                withMaven(maven: 'maven_3_6_3') {
                    bat 'mvn clean package'
                }
            }
        }

        stage ('Deploy') {
            steps {

                withCredentials([[$class          : 'UsernamePasswordMultiBinding',
                                  credentialsId   : 'PCF_LOGIN',
                                  usernameVariable: 'dsiva427@gmail.com',
                                  passwordVariable: 'Sivaapssdc427#']]) {

                    bat 'C:/Progra~1/Cloud*/cf login -a http://api.run.pivotal.io -u dsiva427@gmail.com -p Sivaapssdc427#'
                    bat 'C:/Progra~1/Cloud*/cf push'
                }
            }

        }

    }

}