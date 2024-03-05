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

WebUI.openBrowser('https://kasirdemo.belajarqa.com', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('RegisterPage/h2_hai, kasirAja'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('RegisterPage/a_ingin mencoba, daftar'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('RegisterPage/input_nama toko_name'), 'Toko Berkah', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('RegisterPage/input_email_email'), 'tokoku@mailsec.com', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('RegisterPage/input_password_password'), 'pass1234', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('RegisterPage/button_daftar'), FailureHandling.OPTIONAL)

WebUI.closeBrowser(FailureHandling.OPTIONAL)

