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



class regisApp {

	def randomInteger(int length) {

		String chars = "0123456789"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return sb.toString();
	}

	@Given("User successfully uses the application on the device")
	public void user_successfully_uses_the_application_on_the_device() {

		Mobile.startApplication('apk/BinarMobile.apk', true);
	}

	@When("Open the app")
	public void open_the_app() {
	}

	@And("Tap Account button")
	public void tap_Account_button() {

		WebUI.callTestCase(findTestCase('Pages/Landing Page/Tap Button Account'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Tap the Masuk button")
	public void tap_the_Masuk_button() {

		WebUI.callTestCase(findTestCase('Pages/Account Page/Tap Button Masuk Before Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Tap Daftar button")
	public void tap_Daftar_button() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Tap Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input valid Nama field")
	public void input_valid_Nama_field() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Nama Field Regis'), [('nameFieldRegis') : 'Sans'], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Given("User leave the name field")
	public void user_leave_the_name_field() {
		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Nama Field Regis'), [('nameFieldRegis') : ''], FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("User leave the email field")
	public void user_leave_the_email_field() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Nama Field Regis'), [('nameFieldRegis') : ''], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input valid Email field")
	public void input_valid_Email_field() {

		String randomInt = this.randomInteger(5)
		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Email Field Regis'), [('emailFieldRegis') : 'ValidEmail' + randomInt+ '@gmail.com'],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Input invalid Email format")
	public void input_invalid_Email_format() {
		
		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Email Field Regis'), [('emailFieldRegis') : 'InvalidEmail'],
		FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input Email has been registered")
	public void input_Email_has_been_registered() {
		
		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Email Field Regis'), [('emailFieldRegis') : 'BuyerPlatinum1@gmail.com'],
			FailureHandling.STOP_ON_FAILURE)
	}
	
	@Given("User leave Email field")
	public void user_leave_Email_field() {
		
		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Email Field Regis'), [('emailFieldRegis') : ''],
			FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("Input valid Password field more than or equals to 6 digit")
	public void input_valid_Password_field_more_than_or_equals_to_6_digit() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Password Field Regis'), [('passwordFieldRegis') : '123456'],
		FailureHandling.STOP_ON_FAILURE)
	}
	
	@Given("User input password field less then 6 digit")
	public void user_input_password_field_less_then_6_digit() {
		
		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Password Field Regis'), [('passwordFieldRegis') : '123'],
			FailureHandling.STOP_ON_FAILURE)
	}
	
	@Given("User leave Password field")
	public void user_leave_Password_field() {
		
		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Password Field Regis'), [('passwordFieldRegis') : ''],
			FailureHandling.STOP_ON_FAILURE)
		
	}

	@And("Input valid Nomor HP field")
	public void input_valid_Nomor_HP_field() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Nomor HP Field Regis'), [('nomorHpFieldRegis') : '08123536373'],
		FailureHandling.STOP_ON_FAILURE)
	}
	
	@Given("User leave Nomor Hp field")
	public void user_leave_Nomor_Hp_field() {
		
		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Nomor HP Field Regis'), [('nomorHpFieldRegis') : ''],
			FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input valid Kota field")
	public void input_valid_Kota_field() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Kota Field Regis'), [('kotaFieldRegis') : 'Malang'], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User leave Kota field")
	public void user_leave_Kota_field() {
		
		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Kota Field Regis'), [('kotaFieldRegis') : ''], FailureHandling.STOP_ON_FAILURE)
	}
	
	
	@And("Input valid Alamat field")
	public void input_valid_Alamat_field() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Alamat Field Regis'), [('alamatFieldRegis') : 'Lowokwaru'],
		FailureHandling.STOP_ON_FAILURE)
	}
	
	@Given("User leave Alamat field")
	public void user_leave_Alamat_field() {
		
		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Alamat Field Regis'), [('alamatFieldRegis') : ''],
		FailureHandling.STOP_ON_FAILURE)
	}

	@And("Tap Daftar Regis button")
	public void tap_Daftar_Regis_button() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Tap Daftar Button Regis'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User account is register and success log in the application")
	public void user_account_is_register_and_success_log_in_the_application() {

		WebUI.callTestCase(findTestCase('Pages/Homepage/Verify Element Akun Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User cannot register and warning message pop up appear")
	public void user_cannot_register_and_warning_message_pop_up_appear() {
		
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Register Page/objectDaftarButton'), 0)
		
	}
	
	@Then("User cannot register and warning message Email tidak valid appear")
	public void user_cannot_register_and_warning_message_Email_tidak_valid_appear() {
		
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Register Page/emailTidakValid'), 0)
		String actualErrorInvalidEmail = Mobile.getText(findTestObject('Secondhand App/Error Register Page/emailTidakValid'), 0)
		if(actualErrorInvalidEmail == 'Email tidak valid') {
			Mobile.comment('Warning Message Valid: ' + actualErrorInvalidEmail)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}
	
	
	@Then("User cannot register and warning message Password harus lebih dari 6 karakter appear")
	public void user_cannot_register_and_warning_message_Password_harus_lebih_dari_6_karakter_appear() {
		
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Register Page/passwordKurang'), 0)
		String actualPasswordKurang = Mobile.getText(findTestObject('Secondhand App/Error Register Page/passwordKurang'), 0)
		if(actualPasswordKurang == 'Password harus lebih dari 6 karakter') {
			Mobile.comment('Warning Message Valid: ' + actualPasswordKurang)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}
	
	@Then("User cannot register and warning message Nama tidak boleh kosong")
	public void user_cannot_register_and_warning_message_Nama_tidak_boleh_kosong() {
		
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Register Page/namaKosong'), 0)
		String actualNamaKosong = Mobile.getText(findTestObject('Secondhand App/Error Register Page/namaKosong'), 0)
		if(actualNamaKosong == 'Nama tidak boleh kosong') {
			Mobile.comment('Warning Message Valid: ' + actualNamaKosong)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}
	
	@Then("User cannot register and warning message Email tidak boleh kosong")
	public void user_cannot_register_and_warning_message_Email_tidak_boleh_kosong() {
		
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Register Page/emailKosong'), 0)
		String actualEmailKosong = Mobile.getText(findTestObject('Secondhand App/Error Register Page/emailKosong'), 0)
		if(actualEmailKosong == 'Email tidak boleh kosong') {
			Mobile.comment('Warning Message Valid: ' + actualEmailKosong)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}
	
	@Then("User cannot register and warning message Password tidak boleh kosong")
	public void user_cannot_register_and_warning_message_Password_tidak_boleh_kosong() {
		
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Register Page/passwordKosong'), 0)
		String actualPasswordKosong = Mobile.getText(findTestObject('Secondhand App/Error Register Page/passwordKosong'), 0)
		if(actualPasswordKosong == 'Password tidak boleh kosong') {
			Mobile.comment('Warning Message Valid: ' + actualPasswordKosong)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}
	
	@Then("User cannot register and warning message Nomor telepon tidak boleh kosong")
	public void user_cannot_register_and_warning_message_Nomor_telepon_tidak_boleh_kosong() {
		
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Register Page/noHpKosong'), 0)
		String actualNoHpKosong = Mobile.getText(findTestObject('Secondhand App/Error Register Page/noHpKosong'), 0)
		if(actualNoHpKosong == 'Nomor telepon tidak boleh kosong') {
			Mobile.comment('Warning Message Valid: ' + actualNoHpKosong)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}
	
	@Then("User cannot register and warning message Kota tidak boleh kosong")
	public void user_cannot_register_and_warning_message_Kota_tidak_boleh_kosong() {
		
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Register Page/kotaKosong'), 0)
		String actualKotaKosong = Mobile.getText(findTestObject('Secondhand App/Error Register Page/kotaKosong'), 0)
		if(actualKotaKosong == 'Kota tidak boleh kosong') {
			Mobile.comment('Warning Message Valid: ' + actualKotaKosong)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}
	
	@Then("User cannot register and warning message Alamat tidak boleh kosong")
	public void user_cannot_register_and_warning_message_Alamat_tidak_boleh_kosong() {
		
		Mobile.verifyElementExist(findTestObject('Secondhand App/Error Register Page/alamatKosong'), 0)
		String actualAlamatKosong = Mobile.getText(findTestObject('Secondhand App/Error Register Page/alamatKosong'), 0)
		if(actualAlamatKosong == 'Alamat tidak boleh kosong') {
			Mobile.comment('Warning Message Valid: ' + actualAlamatKosong)
		}else {
			Mobile.comment('Warning Message Tidak Valid')
		}
	}
	
	
}