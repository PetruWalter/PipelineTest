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


pipeline {
    agent any

    stages {
        stage('Excel-Datei erstellen') {
            steps {
                script {
                    // Füge die erforderlichen Apache POI-Abhängigkeiten hinzu
                    @Grab(group='org.apache.poi', module='poi', version='5.0.0')
                    @Grab(group='org.apache.poi', module='poi-ooxml', version='5.0.0')

                    import org.apache.poi.ss.usermodel.*
                    import org.apache.poi.xssf.usermodel.XSSFWorkbook

                    // Erstelle eine neue Arbeitsmappe (Workbook)
                    Workbook workbook = new XSSFWorkbook()

                    // Erstelle ein neues Arbeitsblatt (Sheet)
                    Sheet sheet = workbook.createSheet("Tabelle1")

                    // Erstelle eine Kopfzeile
                    Row headerRow = sheet.createRow(0)
                    headerRow.createCell(0).setCellValue("Name")
                    headerRow.createCell(1).setCellValue("Alter")
                    headerRow.createCell(2).setCellValue("Beruf")

                    // Füge Datenzeilen hinzu
                    Row dataRow1 = sheet.createRow(1)
                    dataRow1.createCell(0).setCellValue("Max Mustermann")
                    dataRow1.createCell(1).setCellValue(30)
                    dataRow1.createCell(2).setCellValue("Ingenieur")

                    Row dataRow2 = sheet.createRow(2)
                    dataRow2.createCell(0).setCellValue("Erika Musterfrau")
                    dataRow2.createCell(1).setCellValue(28)
                    dataRow2.createCell(2).setCellValue("Lehrer") 

                    // Speichere die Arbeitsmappe in einer Datei
                    FileOutputStream fileOut = new FileOutputStream("Beispiel.xlsx")
                    workbook.write(fileOut)
                    fileOut.close()

                    println("Die Excel-Datei wurde erfolgreich erstellt.")
                }
            }
        }
    }
}
