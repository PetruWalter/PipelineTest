import org.modelcatalogue.spreadsheet.builder.poi.PoiSpreadsheetBuilder

/*pipeline {
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
}*/

stage('Excel-Datei erstellen') {
    steps {
        // Hier führen Sie Ihr Groovy-Skript aus, um die Excel-Datei zu erstellen
        sh 'groovy dein-skript.groovy'
    }
}
post {
    success {
        // Hier archivieren Sie die Excel-Datei, damit sie später heruntergeladen werden kann
        archiveArtifacts artifacts: 'Beispiel.xlsx', allowEmptyArchive: true
    }
}

