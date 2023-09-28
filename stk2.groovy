pipeline {
    agent any
    tools {
       maven 'maven'
    }
    triggers{
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                echo 'test 19.09.2023'
            }
        }
        stage('test') {
            steps {
                bat "mvn install"
            }
        }
        stage('Excel erstellen'){
            steps{
                echo 'PetruTester'

                // Fügen Sie hier den Groovy-Code zur Erstellung der Excel-Datei hinzu
                // Der Groovy-Code sollte direkt in dieser Stage stehen, nachdem Sie die erforderlichen Schritte definiert haben.
            }
        }

        stage('Groovy Skript ausführen') {
            steps {
                script {
                    // Hier den Pfad zur Groovy-Datei in Ihrem Projekt einfügen
                    def groovyScriptPath = 'C:\\Users\\petru\\Desktop\\ExcelTest'

                    // Shell-Befehl, um das Groovy-Skript auszuführen
                    sh "groovy ${groovyScriptPath}"
                }
            }
        }
    }
}
