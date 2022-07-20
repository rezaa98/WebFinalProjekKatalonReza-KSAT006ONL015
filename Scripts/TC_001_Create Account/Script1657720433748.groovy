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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Object Repository/Page_Kotakoki  Welcome to my Website/span_Register Now'))

WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Username_user_login-297'), 'reza.maulana2')

WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_E-mail Address_user_email-297'), 'reza.maulana2@bfi.co.id')

WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Phone Number_phone_number-297'), '081122334455')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Password_user_password-297'), 
    '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Confirm Password_confirm_user_password-297'), 
    '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Address_Relative_adress-297'), 'jl . Melati')

WebUI.click(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Only fill in if you are not human_um-_fc91b5'))

