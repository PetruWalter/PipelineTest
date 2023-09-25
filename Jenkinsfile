import org.modelcatalogue.spreadsheet.builder.poi.PoiSpreadsheetBuilder

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
                File file = new File('spreadsheet.xlsx')

                PoiSpreadsheetBuilder.INSTANCE.build {                                                  // <1>
                    sheet('Sample') {                                                                   // <2>
                        row {                                                                           // <3>
                            cell 'A'                                                                    // <4>
                            cell 'B'
                            cell 'C'
                        }
                        row {
                            cell 1
                            cell 2
                            cell 3
                        }
                    }
                } writeTo file 

            }
        }
    }
}

