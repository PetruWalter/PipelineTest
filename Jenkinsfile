//import org.modelcatalogue.spreadsheet.builder.poi.PoiSpreadsheetBuilder

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

            }
        }
    }
}



pipeline {
    agent any

    stages {
        stage('Groovy Skript ausführen') {
            steps {
                script {
                    // Hier den Pfad zur Groovy-Datei in Ihrem Projekt einfügen
                    def groovyScriptPath = 'C:\Users\petru\Desktop\ExcelTest'

                    // Shell-Befehl, um das Groovy-Skript auszuführen
                    sh "groovy ${groovyScriptPath}"
                }
            }
        }
    }
}
