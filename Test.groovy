import groovy.util.GroovyScriptEngine

// Pfad zur Excel-Datei im Repository
def excelFilePath = 'C:\\Users\\petru\\Desktop\\ExcelTest'

// Groovy-Code, um Excel zu steuern
def excelScript = """
// Hier Ihren Excel-Code einfügen, z.B. Excel öffnen, Daten lesen/schreiben, etc.
"""

def engine = new GroovyScriptEngine('.')
def script = engine.createScript(excelScript)
script.run()

