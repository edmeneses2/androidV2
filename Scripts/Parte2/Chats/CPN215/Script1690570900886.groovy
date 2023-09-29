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

Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Chats/CPN215/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Chats/CPN215/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Chats/CPN215/android.widget.LinearLayout (1)'), 0)

'opcion tomar foto'
Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Chats/CPN215/android.widget.LinearLayout (2)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'capturar camara'
Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Chats/CPN215/android.widget.ImageButton'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'icono de girar'
Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Chats/CPN215/android.widget.LinearLayout (3)'), 0)

'icono de 90grados'
Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Chats/CPN215/android.widget.ImageView (1)'), 0)

'check verde'
Mobile.tap(findTestObject('Parte2/Ajustes cuenta/Chats/android.widget.Button'), 0)

Mobile.pressBack()

'atras'
Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Chats/CPN215/android.widget.ImageButton (1)'), 0)

'chats'
Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Chats/CPN215/android.widget.FrameLayout (2)'), 0)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

