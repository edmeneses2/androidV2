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

Mobile.tap(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.TextView - Iniciar sesin'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.TextView - Recuperar Cuenta'), 
    0)

Mobile.verifyElementText(findTestObject('Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.TextView - Recuperar Cuenta'), 
    'Recuperar Cuenta')

Mobile.tap(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.EditText - Apodo'), 
    1)

Mobile.setText(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.EditText - Apodo (1)'), 
    'EDWIN_1324', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.Button - Recuperar'), 
    100)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.RadioGroup'), 100)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.Button - Siguiente'), 
    100)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.Button - Siguiente (1)'), 
    100)

Mobile.tap(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.RadioGroup (1)'), 
    100)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.Button - Siguiente (1)'), 100)

Mobile.tap(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.RadioButton - No eleg esta pregunta'), 
    100)

Mobile.tap(findTestObject('Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.Button - Siguiente (1)'), 100)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.RadioGroup'), 100)

Mobile.tap(findTestObject('Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.Button - Siguiente (1)'), 100)

Mobile.tap(findTestObject('Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.RadioGroup'), 100)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.Button - Finalizar'), 
    100)

Mobile.verifyElementVisible(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/androidx.appcompat.widget.LinearLayoutCompat'), 
    100)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.Button - Cerrar'), 
    100)

Mobile.tap(findTestObject('Object Repository/Parte1/INICIA_SESION_APODO_EXISTENTE/CPN21/android.widget.ImageButton'), 100)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

