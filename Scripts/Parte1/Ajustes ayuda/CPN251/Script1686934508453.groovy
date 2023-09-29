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

Mobile.verifyElementVisible(findTestObject('Object Repository/Parte1/Ajustes ayuda/CPN251/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Parte1/Ajustes ayuda/CPN251/android.widget.TextView - Reportar un problema'), 1)

Mobile.tap(findTestObject('Object Repository/Parte1/Ajustes ayuda/CPN251/android.widget.TextView - Comentario'), 1)

Mobile.tap(findTestObject('Object Repository/Parte1/Ajustes ayuda/CPN251/android.widget.EditText - Mensaje'), 1)

Mobile.setText(findTestObject('Object Repository/Parte1/Ajustes ayuda/CPN251/android.widget.EditText - Mensaje (1)'), 'Comentario de prueba para App NN CHAT', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Parte1/Ajustes ayuda/CPN251/android.widget.Button - Enviar'), 1)

Mobile.verifyElementText(findTestObject('Object Repository/Parte1/Ajustes ayuda/CPN251/android.widget.TextView - T solicitud ha sido envida satisfactoriamente'), 
    'Tú solicitud ha sido envida satisfactoriamente')

Mobile.tap(findTestObject('Object Repository/Parte1/Ajustes ayuda/CPN251/android.widget.Button - OK'), 1)

