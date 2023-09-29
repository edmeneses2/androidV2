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

Mobile.clearText(findTestObject('Object Repository/Parte1/Crear_cuenta/CPN15/android.widget.EditText - angello16'), 0)

Mobile.tap(findTestObject('Object Repository/Parte1/Crear_cuenta/CPN15/android.widget.EditText - Apodo'), 0)

Mobile.setText(findTestObject('Object Repository/Parte1/Crear_cuenta/CPN15/android.widget.EditText - P000'), 'LIBRE02', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Parte1/Crear_cuenta/CPN15/android.widget.TextView - El apodo te servir para identificarse en NapoleoN Chat, no lo podrs cambiar despes'), 
    'El apodo te servirá para identificarse en NapoleoN Chat, no lo podrás cambiar despúes')

Mobile.clearText(findTestObject('Object Repository/Parte1/Crear_cuenta/CPN15/android.widget.EditText - Opcional'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Parte1/Crear_cuenta/CPN15/android.widget.Button - Siguiente'), 0)

