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



public class productOffer {

	@When("User click homepage icon")
	public void user_click_homepage_icon() {
		WebUI.callTestCase(findTestCase('SecondHand/Homepage/Click Beranda'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input searchbar")
	public void user_input_searchbar() {
		WebUI.callTestCase(findTestCase('SecondHand/Product Offer/Input Sapi Search Bar'), [('namaProdukSearch') : 'Sapi_1'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click result searchbar")
	public void user_click_result_searchbar() {
		WebUI.callTestCase(findTestCase('SecondHand/Product Offer/Click Result Sapi Search Bar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click nego")
	public void user_click_nego() {
		WebUI.callTestCase(findTestCase('SecondHand/Product Offer/Click Nego'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should be navigated to cart popup page")
	public void user_should_be_navigated_to_cart_popup_page() {
		WebUI.callTestCase(findTestCase('SecondHand/Product Offer/Verify Content Cart Popup Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}