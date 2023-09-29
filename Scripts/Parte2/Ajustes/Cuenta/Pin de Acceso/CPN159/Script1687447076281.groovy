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

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Pin de Acceso/android.widget.FrameLayout (1)'), 0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Pin de Acceso/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Pin de Acceso/android.widget.LinearLayout (1)'), 0)

Mobile.setText(findTestObject('Parte2/Ajustes cuenta/Cuenta/Pin de Acceso/android.widget.EditText - Pin de acceso antiguo'), 
    '0000', 0)

Mobile.setText(findTestObject('Parte2/Ajustes cuenta/Cuenta/Pin de Acceso/android.widget.EditText - Nuevo pin de acceso'), 
    '1234', 0)

Mobile.setText(findTestObject('Parte2/Ajustes cuenta/Cuenta/Pin de Acceso/android.widget.EditText - Confirmar nuevo pin de acceso'), 
    '4321', 0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Pin de Acceso/android.widget.Button - Editar'), 0)

Mobile.verifyElementText(findTestObject('Parte2/Ajustes cuenta/Cuenta/Pin de Acceso/android.widget.TextView - El pin de acceso no coincide'), 
    'El pin de acceso no coincide')

Mobile.verifyElementText(findTestObject('Parte2/Ajustes cuenta/Cuenta/Pin de Acceso/android.widget.TextView - El pin de acceso no coincide (1)'), 
    'El pin de acceso no coincide')

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Pin de Acceso/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Pin de Acceso/android.widget.LinearLayout (1)'), 0)

