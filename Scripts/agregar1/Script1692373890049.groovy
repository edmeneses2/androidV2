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

Mobile.tap(findTestObject('Object Repository/agregar1/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Parte1/agregar/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/agregar1/android.widget.EditText - Busca por apodo'), 0)

Mobile.setText(findTestObject('agregar1/android.widget.EditText - Busca por apodo'), 'edwin_1324', 0)

Mobile.tap(findTestObject('Object Repository/agregar1/android.widget.Button - AGREGAR'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('agregar1/android.widget.Button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/agregar1/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/agregar1/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/agregar1/android.widget.ImageButton (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('agregar1/android.view.ViewGroup'), 3, 1)

Mobile.tap(findTestObject('Object Repository/agregar1/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/agregar1/android.widget.Button - Aceptar'), 0)

Mobile.tap(findTestObject('Object Repository/agregar1/android.widget.FrameLayout (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/agregar1/android.widget.FrameLayout (2)'), 0)

