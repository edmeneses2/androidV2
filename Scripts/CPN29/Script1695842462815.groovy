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
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository

'Recuperacion de contactos'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Parte1/Recuperar_cuenta/CPN29/android.widget.FrameLayout'), 0)

TestObject lista = findTestObject('Object Repository/Parte1/Recuperar_cuenta/CPN29/androidx.recyclerview.widget.RecyclerView')

//Mobile.swipe(0, 0, 0, 0)
int startX = 14 // Posición X inicial

int startY = 1211 // Posición Y inicial

int endX = 0 // Posición X final (la misma que la inicial)

int endY = 155 // Posición Y final (menor que la inicial)

for (int i = 0; i < 3; i++) {
    // Realiza el desplazamiento
    Mobile.swipe(startX, startY, endX, endY)

    Mobile.delay(3)

    Mobile.waitForElementPresent(findTestObject('Parte1/Recuperar_cuenta/CPN29/androidx.recyclerview.widget.RecyclerView'), 
        0)
}

Mobile.delay(2)

Mobile.tap(findTestObject('Parte1/Recuperar_cuenta/CPN29/android.widget.FrameLayout (1)'), 0)

Mobile.delay(1)

