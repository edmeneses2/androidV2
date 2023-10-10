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

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN27/android.widget.FrameLayout'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN27/android.widget.ImageButton'), 0)

Mobile.clearText(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN27/android.widget.EditText - Disponible prueba edicin total de caracteres'), 
    0)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN27/android.widget.EditText - Ingresa un estado'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN27/android.widget.EditText - Ingresa un estado (1)'), 
    'Estado de prueba personalizado  123456789 ............', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN27/android.widget.Button'), 0)

Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Parte1/Recuperar_cuenta/CPN27/android.widget.ImageButton (1)'), 1)

Mobile.tap(findTestObject('Parte1/Recuperar_cuenta/CPN27/android.widget.FrameLayout (1)'), 1)

