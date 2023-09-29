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

Mobile.waitForElementPresent(findTestObject('Object Repository/Parte1/Envio de mensajes/CPN105/android.widget.ScrollView'), 
    0)

'1'
Mobile.tap(findTestObject('Object Repository/Parte1/Envio de mensajes/CPN105/android.view.ViewGroup'), 0)

'seleccionar adjuntos'
Mobile.tap(findTestObject('Object Repository/Parte1/Envio de mensajes/CPN105/android.widget.ImageButton'), 100)

'Ubicacion'
Mobile.tap(findTestObject('Object Repository/Parte1/Envio de mensajes/CPN105/android.widget.LinearLayout'), 100)

'enviar'
Mobile.tap(findTestObject('Object Repository/Parte1/Envio de mensajes/CPN105/android.widget.ImageButton (1)'), 100)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'5'
Mobile.tap(findTestObject('Parte1/Envio de mensajes/CPN105/android.widget.ImageButton'), 100)

'6'
Mobile.tap(findTestObject('Parte1/Envio de mensajes/CPN105/android.widget.LinearLayout'), 100)

Mobile.tap(findTestObject('Object Repository/Parte1/Envio de mensajes/CPN105/android.widget.Button'), 0)

'8'
Mobile.setText(findTestObject('Object Repository/Parte1/Envio de mensajes/CPN105/android.widget.EditText - NapoleoN'), 'Valenci', 
    0)

'9'
Mobile.tap(findTestObject('Parte1/Envio de mensajes/CPN105/android.view.ViewGroup (1)'), 0)

'enviar'
Mobile.tap(findTestObject('Parte1/Envio de mensajes/CPN105/android.widget.ImageButton (1)'), 100)

'seleccionar adjuntos'
Mobile.tap(findTestObject('Object Repository/Parte1/Envio de mensajes/CPN105/android.widget.ImageButton'), 100)

'Ubicacion'
Mobile.tap(findTestObject('Object Repository/Parte1/Envio de mensajes/CPN105/android.widget.LinearLayout'), 100)

'2'
Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

'7'
Mobile.tap(findTestObject('Parte1/Envio de mensajes/CPN105/android.widget.Button'), 100)

'11'
Mobile.setText(findTestObject('Parte1/Envio de mensajes/CPN105/android.widget.EditText - NapoleoN'), 'ikonos', 0)

'12'
Mobile.tap(findTestObject('Parte1/Envio de mensajes/CPN105/android.view.ViewGroup (1)'), 0)

'13'
Mobile.tap(findTestObject('Object Repository/Parte1/Envio de mensajes/CPN105/android.widget.ImageButton (2)'), 100)

'14'
Mobile.tap(findTestObject('Object Repository/Parte1/Envio de mensajes/CPN105/android.widget.ImageButton (3)'), 100)

