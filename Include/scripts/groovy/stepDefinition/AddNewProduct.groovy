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



public class AddNewProduct {

	@When("User click plus button")
	public void user_click_plus_button() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Click Plus Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input product name")
	public void user_input_product_name() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Nama Produk'), [('namaProduk') : 'bla_'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input product price")
	public void user_input_product_price() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Harga Produk'), [('hargaProduk') : '10000'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select product category")
	public void user_select_product_category() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Select Kategori'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input product address")
	public void user_input_product_address() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Lokasi'), [('lokasi') : 'Jakarta'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input product description")
	public void user_input_product_description() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Deskripsi'), [('deskripsi') : 'blablaja'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input product photo")
	public void user_input_product_photo() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Photo Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click terbitkan button")
	public void user_click_terbitkan_button() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Click Terbitkan Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User has successfully login")
	public void user_has_successfully_login() {
		WebUI.callTestCase(findTestCase('Step Definition/Login/User Login - Success_1'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input alphabet product price")
	public void user_input_alphabet_product_price() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Harga Produk'), [('hargaProduk') : 'abcd'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input product alphanumeric description")
	public void user_input_product_alphanumeric_description() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Deskripsi'), [('deskripsi') : 'bla123'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User should be navigated to the login page and should login")
	public void user_should_be_navigated_to_the_login_page_and_should_login() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Verify Content Should Login Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User empty product name")
	public void user_empty_product_name() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Delete Input Nama Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User add new product was unsuccessful")
	public void user_add_new_product_was_unsuccessful() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Verify Content Add New Product Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User empty product price")
	public void user_empty_product_price() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Delete Input Harga Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User empty product description")
	public void user_empty_product_description() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Delete Input Deskripsi'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User add new product was successful")
	public void user_add_new_product_was_successful() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Success Add New Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}