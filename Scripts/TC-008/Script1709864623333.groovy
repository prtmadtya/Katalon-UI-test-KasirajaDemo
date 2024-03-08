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

WebUI.navigateToUrl('https://kasirdemo.belajarqa.com')

WebUI.verifyElementPresent(findTestObject('AddPembelian_page/h2_hai, kasirAja'), 3)

WebUI.setText(findTestObject('AddPembelian_page/input_email_email'), 'tokoku@mailsec.com')

WebUI.setText(findTestObject('AddPembelian_page/input_password_password'), 'pass1234')

WebUI.click(findTestObject('AddPembelian_page/button_login'))

WebUI.click(findTestObject('addPenjualan_page/div_penjualan'))

WebUI.verifyElementPresent(findTestObject('addPenjualan_page/div_dashboard   penjualan'), 3)

WebUI.click(findTestObject('addPenjualan_page/a_tambah'))

//WebUI.click(findTestObject('addPenjualan_page/button_produk'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/addPenjualan_page/header_produk'), 3)

//WebUI.click(findTestObject('addPenjualan_page/td_Daging ayam'))

WebUI.click(findTestObject('addPenjualan_page/button_Bayar'))

WebUI.closeBrowser()

