package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class notifApp {

	@Given("User as a seller success login")
	public void user_as_a_seller_success_login() {

		Mobile.startApplication('apk/BinarMobile.apk', true);
		Mobile.verifyElementExist(findTestObject('Secondhand App/Landing Page/buttonNotif'), 0)
		Mobile.tap(findTestObject('Secondhand App/Landing Page/buttonNotif'), 0)
		Mobile.tap(findTestObject('Secondhand App/Validasi Login Page/buttonMasuk1'), 0)
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Email'), [('setemail') : 'SansTestKa11@gmail.com'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login Page/Set Password'), [('setpassword') : '123456'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('SecondHand/Login/Click Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Secondhand App/Notifikasi/textNotifikasi'), 0)
	}

	//	@Then("User as a seller success add new product")
	//	public void user_as_a_seller_success_add_new_product() {
	//		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Click Plus Button'), [:], FailureHandling.STOP_ON_FAILURE)
	//		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Nama Produk'), [('namaProduk') : 'bla_'], FailureHandling.STOP_ON_FAILURE)
	//		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Harga Produk'), [('hargaProduk') : '10000'], FailureHandling.STOP_ON_FAILURE)
	//		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Select Kategori'), [:], FailureHandling.STOP_ON_FAILURE)
	//		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Lokasi'), [('lokasi') : 'Jakarta'], FailureHandling.STOP_ON_FAILURE)
	//		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Deskripsi'), [('deskripsi') : 'blablaja'], FailureHandling.STOP_ON_FAILURE)
	//	}

	@Given("User is on landing page")
	public void user_is_on_landing_page() {
		Mobile.startApplication('apk/BinarMobile.apk', true);
		Mobile.verifyElementExist(findTestObject('Secondhand App/Landing Page/buttonNotif'), 0)
	}
	
	@When("User tap notification navbar")
	public void user_tap_notification_navbar() {
		Mobile.tap(findTestObject('Secondhand App/Landing Page/buttonNotif'), 0)
	}
	
	@When("User success login")
	public void user_success_login() {
		Mobile.tap(findTestObject('Secondhand App/Validasi Login Page/buttonMasuk1'), 0)
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Email'), [('setemail') : 'SansTestKa11@gmail.com'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login Page/Set Password'), [('setpassword') : '123456'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('SecondHand/Login/Click Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Secondhand App/Notifikasi/textNotifikasi'), 0)
	}
	
	@When("User seller success login")
	public void user_seller_success_login() {
		Mobile.tap(findTestObject('Secondhand App/Validasi Login Page/buttonMasuk1'), 0)
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Email'), [('setemail') : 'SansTestKa11@gmail.com'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login Page/Set Password'), [('setpassword') : '123456'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('SecondHand/Login/Click Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Secondhand App/Notifikasi/textNotifikasi'), 0)
	}
	
	@When("User buyer success login")
	public void user_buyer_success_login() {
		Mobile.tap(findTestObject('Secondhand App/Validasi Login Page/buttonMasuk1'), 0)
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Email'), [('setemail') : 'BuyerPlatinum1@gmail.com'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login Page/Set Password'), [('setpassword') : '123456'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('SecondHand/Login/Click Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Secondhand App/Notifikasi/textNotifikasi'), 0)
	}
	
	@Then("User can see the redmark there is new nootification")
	public void user_can_see_the_redmark_there_is_new_nootification() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Notifikasi/redmarkNotif'), 0)
	}
	
	@Then("User can see the product success published")
	public void user_can_see_the_product_success_published() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Notifikasi/textBerhasilDiterbitkan'), 0)
	}
	
	@Then("User can see notification the buyer make offer of the product")
	public void user_can_see_notification_the_buyer_make_offer_of_the_product() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Notifikasi/textPenawaranProd'), 0)
	}
	
	@Then("User can see notification about seller accepted the product offered")
	public void user_can_see_notification_about_seller_accepted_the_product_offered() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Notifikasi/textPenawaranDiterima'), 0)
	}
	
	@Then("User can see notification about seller rejected the product offered")
	public void user_can_see_notification_about_seller_rejected_the_product_offered() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Notifikasi/textPenawaranDitolak'), 0)
	}
	
	@Then("User can see akun page")
	public void user_can_see_akun_page() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Akun Page/textEmailUser'), 0)
	}
	
	@Then("User can see transaksi page")
	public void user_can_see_transaksi_page() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Transaksi/textTransaksi'), 0)
	}
	
	@Then("User can see beranda page")
	public void user_can_see_beranda_page() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Beranda/textTelusuriKategori'), 0)
	}
	
	@Then("User tap akun button in the navbar")
	public void user_tap_akun_button_in_the_navbar() {
		Mobile.tap(findTestObject('Secondhand App/Landing Page/buttonAkun'), 0)
	}
	
	@Then("User tap transaksi button in the navbar")
	public void user_tap_transaksi_button_in_the_navbar() {
		Mobile.tap(findTestObject('Secondhand App/Landing Page/buttonTransaksi'), 0)
	}
	
	@Then("User tap beranda button in the navbar")
	public void user_tap_beranda_button_in_the_navbar() {
		Mobile.tap(findTestObject('Secondhand App/Landing Page/buttonBeranda'), 0)
	}
	
	
}