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

'Personalizar contacto'
Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.TextView - Ver perfil'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.ImageButton (1)'), 0)

Mobile.clearText(findTestObject('Parte1/Recuperar_cuenta/CPN26/android.widget.EditText - android once'), 0)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.EditText (1)'), 'Nombre de prueba', 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.Button - Aceptar'), 0)

//Mobile.hideKeyboard()

Mobile.tap(findTestObject('Parte1/Recuperar_cuenta/CPN26/android.widget.ImageButton (2)'), 0)

Mobile.clearText(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.EditText - android11bshsjsjs'), 
    0)

Mobile.setText(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.EditText (2)'), 'personalizado456', 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Parte1/Recuperar_cuenta/CPN26/android.widget.Button - Aceptar'), 0)

Mobile.tap(findTestObject('Parte1/Recuperar_cuenta/CPN26/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.Button'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.ImageButton (5)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN26/android.widget.FrameLayout (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

