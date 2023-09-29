import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.Button - Registrar (1)'), 0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.TextView - Elige una pregunta'), 
    0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.TextView - Cul es el mes de nacimiento de tu padre'), 
    0)

Mobile.setText(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.EditText - Respuesta'), 'test1', 
    0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.Button - Siguiente (1)'), 0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.TextView - Elige una pregunta'), 
    0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.TextView - Cul es la marca de tu computador'), 
    0)

Mobile.setText(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.EditText - Respuesta (1)'), 
    'test2', 0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.Button - Siguiente (1)'), 0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.TextView - Elige una pregunta (1)'), 
    0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.TextView - Cul es tu profesin'), 
    0)

Mobile.setText(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.EditText - Respuesta (1)'), 
    'test3', 0)

Mobile.scrollToText('Finalizar', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.Button - Finalizar'), 0)

Mobile.verifyElementText(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.Button - Editar'), 
    'Editar')

