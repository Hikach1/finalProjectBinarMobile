package regisApp
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


	//	def startApp() {
	//		Mobile.startApplication('apk/BinarMobile.apk', true);
	//		//WebUI.maximizeWindow();
	//		//WebUI.navigateToUrl(GlobalVariable.sauceDemo);
	//	}
	//
	//	def closeApp() {
	//		Mobile.closeApplication();
	//	}


	@Given("User successfully uses the application on the device")
	public void user_successfully_uses_the_application_on_the_device() {

		Mobile.startApplication('apk/BinarMobile.apk', true);
		//WebUI.maximizeWindow();
		//WebUI.navigateToUrl(GlobalVariable.sauceDemo);
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

		WebUI.callTestCase(findTestCase('Pages/Login Page/Tap Button Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input valid Nama field")
	public void input_valid_Nama_field() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Nama Field Regis'), [('nameFieldRegis') : 'Sans'], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input valid Email field")
	public void input_valid_Email_field() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Email Field Regis'), [('emailFieldRegis') : 'SansTestKa14@gmail.com'],
		FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input valid Password field more than or equals to 6 digit")
	public void input_valid_Password_field_more_than_or_equals_to_6_digit() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Password Field Regis'), [('passwordFieldRegis') : '123456'],
		FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input valid Nomor HP field")
	public void input_valid_Nomor_HP_field() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Nomor HP Field Regis'), [('nomorHpFieldRegis') : '08123536373'],
		FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input valid Kota field")
	public void input_valid_Kota_field() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Kota Field Regis'), [('kotaFieldRegis') : 'Malang'], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input valid Alamat field")
	public void input_valid_Alamat_field() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Alamat Field Regis'), [('alamatFieldRegis') : 'Lowokwaru'],
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
}