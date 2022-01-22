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

'When User launches the application'
Mobile.startApplication('C:\\Users\\shash\\Downloads\\selendroid-test-app-0.17.0.apk', true)

//Mobile.tap(findTestObject('User Profile/LandingPage/android.widget.Button - OK'), 0)

CustomKeywords.'page.CommonPages.tapOnSelendroidTestAppOKButton'()

Mobile.tap(findTestObject('Object Repository/User Profile/ChromePage/android.widget.ImageButton'), 0)

Mobile.setText(findTestObject('Object Repository/User Profile/ChromePage/android.widget.EditText - Enter your name here'), 
    'Shashank', 0)

Mobile.tap(findTestObject('Object Repository/User Profile/ChromePage/android.widget.Spinner - Volvo'), 0)

Mobile.tap(findTestObject('Object Repository/User Profile/ChromePage/android.widget.CheckedTextView - Audi'), 0)

Mobile.tap(findTestObject('Object Repository/User Profile/ChromePage/android.widget.Button - Send me your name'), 0)

Mobile.getText(findTestObject('Object Repository/User Profile/ChromePage/android.view.View - Shashank'), 0)

Mobile.closeApplication()

