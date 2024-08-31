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



public class Profile {


	@Given("User open application")
	public void user_open_application() {
		Mobile.startApplication('Apk/secondhand.apk', true)
	}

	@Then ("User close application")
	public void user_close_application() {
		Mobile.closeApplication()
	}

	@When("User has successfully logged in")
	public void user_has_successfully_logged_in() {
		WebUI.callTestCase(findTestCase('Step Definition/Login/User Login - Success_'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click pen profile button")
	public void user_click_pen_profile_button() {
		WebUI.callTestCase(findTestCase('SecondHand/List Account/Click Pen Profile Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should be navigated to the Account Information page")
	public void user_should_be_navigated_to_the_Account_Information_page() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Verify Content Profile Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input name")
	public void user_input_name() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Input Nama'), [('nama') : 'BEE_'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click simpan button")
	public void user_click_simpan_button() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Click Simpan Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User gets a notification that it was successful")
	public void user_gets_a_notification_that_it_was_successful() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Success Notification'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input photo profile")
	public void user_input_photo_profile() {
		WebUI.callTestCase(findTestCase('SecondHand/Profile/Input Photo Profile'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}