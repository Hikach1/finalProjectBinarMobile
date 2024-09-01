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

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows




public class Login {

	//Script login Salsa

	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		WebUI.callTestCase(findTestCase('SecondHand/Homepage/Verify Content Homepage Before Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click icon profile button")
	public void user_click_icon_profile_button() {
		WebUI.callTestCase(findTestCase('SecondHand/Login/Click Icon Profile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click masuk login button")
	public void user_click_masuk_login_button() {
		WebUI.callTestCase(findTestCase('SecondHand/Login/Click Masuk Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should be navigated to the login page")
	public void user_should_be_navigated_to_the_login_page() {
		WebUI.callTestCase(findTestCase('SecondHand/Login/Verify Content Login Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input email")
	public void user_input_email() {
		WebUI.callTestCase(findTestCase('SecondHand/Login/Input Email'), [('email') : 'hikachi@gmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input password")
	public void user_input_password() {
		WebUI.callTestCase(findTestCase('SecondHand/Login/Input Password'), [('password') : 'hikachi123'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click masuk button")
	public void user_click_masuk_button() {
		WebUI.callTestCase(findTestCase('SecondHand/Login/Click Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User has successfully logged in direct")
	public void user_has_successfully_logged_in_direct() {
		WebUI.callTestCase(findTestCase('SecondHand/Homepage/Verify Content Homepage After Login Direct'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//Script Login Sances

	@Given("User succesfully launch in landing page")
	public void user_succesfully_launch_in_landing_page() {
		Mobile.startApplication('apk/BinarMobile.apk', true);
		Mobile.verifyElementExist(findTestObject('Secondhand App/Landing Page/buttonAccount'), 0)
	}

	@When("User click button akun on navbar")
	public void user_click_button_akun_on_navbar() {
		Mobile.tap(findTestObject('Secondhand App/Landing Page/buttonAccount'), 0)

	}

	@And("User click masuk button on login validation page")
	public void user_click_masuk_button_on_login_validation_page() {
		Mobile.tap(findTestObject('Secondhand App/Validasi Login Page/buttonMasuk1'), 0)
	}

	@And("User input valid email {string}")
	public void user_input_valid_email(String setemail) {
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Email'), [('setemail') : setemail], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input valid password {string}")
	public void user_input_valid_password(String setpassword) {
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Password'), [('setpassword') :setpassword], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User succesfully login and can see the akun page")
	public void user_succesfully_login_and_can_see_the_akun_page() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Akun Page/textEmailUser'), 0)
	}

	@When("User click button transaksi on navbar")
	public void user_click_button_transaksi_on_navbar() {
		Mobile.tap(findTestObject('Secondhand App/Landing Page/buttonTransaksi'), 0)
	}

	@Then("User succesfully login and can see the transaksi page")
	public void user_succesfully_login_and_can_see_the_transaksi_page() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Transaksi/textTransaksi'), 0)
	}

	@When("User click button tambah produk on navbar")
	public void user_click_button_tambah_produk_on_navbar() {
		Mobile.tap(findTestObject('Secondhand App/Landing Page/buttonTambah'), 0)
	}

	@Then("User succesfully login and can see the form tambah produk page")
	public void user_succesfully_login_and_can_see_the_form_tambah_produk_page() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Tambah Produk Page/textTambahProduk'), 0)
	}

	@When("User click button notifikasi on navbar")
	public void user_click_button_notifikasi_on_navbar() {
		Mobile.tap(findTestObject('Secondhand App/Landing Page/buttonNotif'), 0)
	}

	@Then("User succesfully login and can see the notifikasi page")
	public void user_succesfully_login_and_can_see_the_notifikasi_page() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Notifikasi/textNotifikasi'), 0)
	}

	@And("User input invalid email {string}")
	public void user_input_invalid_email(String setemail) {
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Email'), [('setemail') : setemail], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input invalid password {string}")
	public void user_input_invalid_password(String setpassword) {
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Password'), [('setpassword') :setpassword], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User cannot login and warning message email tidak valid appear")
	public void user_cannot_login_and_warning_message_email_tidak_valid_appear() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Message/errorInvalidEmail'), 0)
		String actualErrormessage = Mobile.getText(findTestObject('Secondhand App/Error Message/errorInvalidEmail'), 0)
		if(actualErrormessage == 'Email tidak valid') {
			Mobile.comment('Warning Message Valid: ' + actualErrormessage)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}

	@Then("User cannot login and warning message password harus lebih dari 6 karakter appear")
	public void user_cannot_login_and_warning_message_password_harus_lebih_dari_6_karakter_appear() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Message/errorPasswordless'), 0)
		String actualErrorPassLess = Mobile.getText(findTestObject('Secondhand App/Error Message/errorPasswordLess'), 0)
		if(actualErrorPassLess == 'Password harus lebih dari 6 karakter') {
			Mobile.comment('Warning Message Valid: ' + actualErrorPassLess)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}

	@Then("User cannot login and warning message appear")
	public void user_cannot_login_and_warning_message_appear() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Message/errorInvalidEmail'), 0)
		String actualErrormessage = Mobile.getText(findTestObject('Secondhand App/Error Message/errorInvalidEmail'), 0)
		if(actualErrormessage == 'Email tidak valid') {
			Mobile.comment('Warning Message Valid: ' + actualErrormessage)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}

	@Given("User doesn't fill in the email field {string}")
	public void user_doesn_t_fill_in_the_email_field(String setemail) {
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Email'), [('setemail') : setemail], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User doesn't fill in the password field {string}")
	public void user_doesn_t_fill_in_the_password_field(String setpassword) {
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Password'), [('setpassword') :setpassword], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User cannot login and warning message email tidak boleh kosong appear")
	public void user_cannot_login_and_warning_message_email_tidak_boleh_kosong_appear() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Message/errorInvalidEmail'), 0)
		String actualErrormessage = Mobile.getText(findTestObject('Secondhand App/Error Message/errorInvalidEmail'), 0)
		if(actualErrormessage == 'Email tidak boleh kosong') {
			Mobile.comment('Warning Message Valid: ' + actualErrormessage)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}

	@Then("User cannot login and warning message password tidak boleh kosong appear")
	public void user_cannot_login_and_warning_message_password_tidak_boleh_kosong_appear() {

		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Message/errorEmptyPassword'), 0)
		String actualErrorEmptyPass = Mobile.getText(findTestObject('Secondhand App/Error Message/errorEmptyPassword'), 0)
		if(actualErrorEmptyPass == 'Password tidak boleh kosong') {
			Mobile.comment('Warning Message Valid: ' + actualErrorEmptyPass)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}

	@Then("User cannot login and warning pop up appear")
	public void user_cannot_login_and_warning_pop_up_appear() {
		Mobile.verifyElementExist(findTestObject('Secondhand App/Login Page/textMasukLogin'), 0)
	}

	@And("User input incorrect email {string}")
	public void user_input_incorrect_email(String setemail) {
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Email'), [('setemail') : setemail], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input incorrect password {string}")
	public void user_input_incorrect_password(String setpassword) {
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Password'), [('setpassword') :setpassword], FailureHandling.STOP_ON_FAILURE)
	}
}