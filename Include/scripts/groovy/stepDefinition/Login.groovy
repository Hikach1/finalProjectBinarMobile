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
}