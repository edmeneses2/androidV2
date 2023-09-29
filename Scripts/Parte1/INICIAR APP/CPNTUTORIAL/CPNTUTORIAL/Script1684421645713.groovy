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

Mobile.startApplication('C:\\Users\\Testing\\Desktop\\katalon\\Apk actualizada Android 13\\NapoleoN.apk', true)

//Mobile.startApplication('C:\\Users\\Testing\\Desktop\\katalon\\APK SERVIDOR NUEVO\\NapoleoN.apk', true)
Mobile.verifyElementText(findTestObject('Object Repository/Parte1/INICIAR APP/CPNTUTORIAL/android.widget.FrameLayout (1)'), 
    '')

Mobile.tap(findTestObject('Object Repository/Parte1/INICIAR APP/CPNTUTORIAL/android.widget.TextView - Omitir'), 1)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.startApplication('C:\\Users\\Testing\\Desktop\\katalon\\Apk actualizada Android 13\\NapoleoN.apk', true)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.toggleWifi('ON', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte1/INICIAR APP/CPNTUTORIAL/android.widget.TextView - Siguiente'), 1)

Mobile.verifyElementText(findTestObject('Parte1/INICIAR APP/CPNTUTORIAL/android.widget.FrameLayout'), '')

Mobile.tap(findTestObject('Object Repository/Parte1/INICIAR APP/CPNTUTORIAL/android.widget.TextView - Siguiente (1)'), 500)

Mobile.verifyElementText(findTestObject('Parte1/INICIAR APP/CPNTUTORIAL/android.widget.FrameLayout'), '')

Mobile.tap(findTestObject('Parte1/INICIAR APP/CPNTUTORIAL/android.widget.TextView - Siguiente (1)'), 500)

Mobile.tap(findTestObject('Parte1/INICIAR APP/CPNTUTORIAL/android.widget.TextView - Siguiente (1)'), 100)

Mobile.verifyElementText(findTestObject('Parte1/INICIAR APP/CPNTUTORIAL/android.widget.FrameLayout'), '')

Mobile.tap(findTestObject('Parte1/INICIAR APP/CPNTUTORIAL/android.widget.TextView - Siguiente (1)'), 1)

Mobile.verifyElementText(findTestObject('Parte1/INICIAR APP/CPNTUTORIAL/android.widget.FrameLayout'), '')

Mobile.tap(findTestObject('Object Repository/Parte1/INICIAR APP/CPNTUTORIAL/android.widget.TextView - Empezar'), 100)

