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

Mobile.waitForElementPresent(findTestObject('Object Repository/Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.TextView - Registrar'), 
    0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.Button - Cancelar'), 0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.Button - Confirmar (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.TextView - Recuperacin de cuenta'), 
    0)

Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.ImageButton (2)'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.TextView - Configuracin de cuenta'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.ImageButton (2)'), 0)
Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Object Repository/Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.TextView - Cuenta (1)'), 
    0)

//Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.FrameLayout (6)'), 
//    0)
Mobile.pressBack()

//Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.FrameLayout (7)'), 
 //   0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Parte2/Ajustes cuenta/Cuenta/Recuperar Cuenta/android.widget.TextView - NapoleoN'), 
    0)

