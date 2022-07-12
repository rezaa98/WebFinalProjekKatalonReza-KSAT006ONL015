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

WebUI.navigateToUrl(GlobalVariable.WebsiteName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/Login/btn_Go to login'), 0)

WebUI.click(findTestObject('Object Repository/Login/btn_Go to login'))

WebUI.waitForElementPresent(findTestObject('Login/Page_Login  Kotakoki/input_Username or E-mail'), 0)

WebUI.clearText(findTestObject('Login/Page_Login  Kotakoki/input_Username or E-mail'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Login  Kotakoki/input_Username or E-mail'), username)

WebUI.waitForElementPresent(findTestObject('Login/Page_Login  Kotakoki/input_Password'), 0)

WebUI.clearText(findTestObject('Login/Page_Login  Kotakoki/input_Password'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Login  Kotakoki/input_Password'), password)

WebUI.click(findTestObject('Object Repository/Login/Page_Login  Kotakoki/btn_Submit login'), FailureHandling.STOP_ON_FAILURE)

userProfile = ((GlobalVariable.MyAccountUrl + username.toLowerCase()) + '/')

WebUI.navigateToUrl(userProfile)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('MyAccount/span_Go to my account'), 0, FailureHandling.OPTIONAL)

WebUI.navigateToUrl(GlobalVariable.LoginUrl)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('MyAccount/span_Go to my account'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('MyAccount/span_Go to my account'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MyAccount/span_Go to my account'))

