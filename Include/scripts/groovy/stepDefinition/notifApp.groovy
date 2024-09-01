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
		Mobile.verifyElementExist(findTestObject('Secondhand App/Landing Page/buttonAccount'), 0)
		Mobile.tap(findTestObject('Secondhand App/Landing Page/buttonAccount'), 0)
		Mobile.tap(findTestObject('Secondhand App/Validasi Login Page/buttonMasuk1'), 0)
		Mobile.callTestCase(findTestCase('Pages/Login Page/Set Email'), [('setemail') : 'SansTestKa11@gmail.com'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login Page/Set Password'), [('setpassword') : '123456'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('SecondHand/Login/Click Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Secondhand App/Akun Page/textEmailUser'), 0)
	}
	
	@Then("User as a seller success add new product")
	public void user_as_a_seller_success_add_new_product() {
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Click Plus Button'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Nama Produk'), [('namaProduk') : 'bla_'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Harga Produk'), [('hargaProduk') : '10000'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Select Kategori'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Lokasi'), [('lokasi') : 'Jakarta'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('SecondHand/Add New Product/Input Deskripsi'), [('deskripsi') : 'blablaja'], FailureHandling.STOP_ON_FAILURE)
	}
	
}