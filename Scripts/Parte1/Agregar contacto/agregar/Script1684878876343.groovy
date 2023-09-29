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

Mobile.delay(6, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Parte1/agregar/android.widget.FrameLayout (2)'), 0)

Mobile.tap(findTestObject('Parte1/agregar/android.widget.ImageView (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Parte1/agregar/android.widget.EditText - Busca por apodo'), 'elpromax11', 
    1)

Mobile.tap(findTestObject('Object Repository/Parte1/agregar/android.widget.Button - AGREGAR'), 1)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Parte1/agregar/android.widget.Button'), 1)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/agregar/android.widget.ImageButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Parte1/agregar/androidx.recyclerview.widget.RecyclerView'), 
    0)

Mobile.tap(findTestObject('Parte1/agregar/android.view.ViewGroup (2)'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/agregar/android.widget.ImageButton (1)'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

'Se presenta una falla al momento de dar clic es decir recibe 2 clics para poder avanzar, se agrega el tap de abajo mientras se corrige'
Mobile.tap(findTestObject('Parte1/agregar/android.widget.FrameLayout'), 1)

Mobile.tapAndHold(findTestObject('Parte1/agregar/android.view.ViewGroup (1)'), 3, 1)

Mobile.tap(findTestObject('Object Repository/Parte1/agregar/android.widget.LinearLayout'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/agregar/android.widget.Button - Aceptar'), 1)

'Se agrega el tap de abajo por que se presenta la misma falla de los 2 taps'
Mobile.tap(findTestObject('Object Repository/Parte1/agregar/android.widget.FrameLayout (1)'), 1)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

