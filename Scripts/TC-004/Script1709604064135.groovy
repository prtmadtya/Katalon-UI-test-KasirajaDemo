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

WebUI.verifyElementPresent(findTestObject('AddProduct_Page/h2_hai, kasirAja'), 4)

WebUI.setText(findTestObject('AddProduct_Page/input_email_email'), 'tokoku@mailsec.com')

WebUI.setText(findTestObject('AddProduct_Page/input_password_password'), 'pass1234')

WebUI.click(findTestObject('AddProduct_Page/button_login'))

WebUI.click(findTestObject('AddProduct_Page/div_produk'))

WebUI.verifyElementPresent(findTestObject('AddProduct_Page/h2_dashboard   produk    baru'), 4)

WebUI.click(findTestObject('AddProduct_Page/a_tambah'))

WebUI.setText(findTestObject('AddProduct_Page/input_nama_nama'), 'Daging ayam')

WebUI.setText(findTestObject('AddProduct_Page/input_deskripsi_deskripsi'), 'daging ayam fillet')

WebUI.setText(findTestObject('AddProduct_Page/input_harga beli_harga beli'), '16000')

WebUI.setText(findTestObject('AddProduct_Page/input_harga jual_harga jual'), '20000')

WebUI.setText(findTestObject('AddProduct_Page/input_stok_stok'), '40')

WebUI.click(findTestObject('AddProduct_Page/div_kategori_chakra-input__right-addon css-7nrq'))

WebUI.setText(findTestObject('AddProduct_Page/input__chakra-input css-2s2hk4'), 'Bahan Pokok')

WebUI.click(findTestObject('AddProduct_Page/td_Bahan Pokok'))

WebUI.click(findTestObject('AddProduct_Page/button_simpan'))

WebUI.closeBrowser()

