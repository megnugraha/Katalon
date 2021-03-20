package accountCreationPage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.Calendar as Calendar
import java.beans.NameGenerator
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.main.CustomKeywordDelegatingMetaClass
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.util.regex.Matcher
import java.util.regex.Pattern
import com.kms.katalon.core.util.KeywordUtil
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable
import io.cucumber.tagexpressions.TagExpressionParser.True
import org.openqa.selenium.Keys as Keys

public class accCreation {
	
	@Then("I fill first (.*) and last name")
	def createPage_name(String fName){
		WebUI.verifyTextPresent(WebUI.getText(findTestObject('Object Repository/Account Creation Page/Your personal information')), false)
		WebUI.click(findTestObject('Object Repository/Account Creation Page/radio_Mr'))
		WebUI.setText(findTestObject('Object Repository/Account Creation Page/input_firstname'), fName)
		String lName = customKey.Helper.getRandomCharSequence(10)
		WebUI.setText(findTestObject('Object Repository/Account Creation Page/input_lastname'), lName)
		GlobalVariable.lastName= lName
		
//		customKey.Helper.'NameGenerator.randomString'(10)

	}
	
	@Then("I want to verify my email is correct")
	def checkEmail(){
		WebUI.comment(GlobalVariable.mail)
		WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Account Creation Page/input_email'), 'value', GlobalVariable.mail, 1)
	}
	
	@Then("I want to set my password")
	def setPwd(){
		String pwd = customKey.Helper.getRandomCharSequence(20) +  customKey.Helper.getRandomNumSequence(5)
		GlobalVariable.pwd = pwd
		
		WebUI.setText(findTestObject('Object Repository/Account Creation Page/input_pwd'), pwd)
	}
	
	@Then("I want to set my birthdate")
	def birth(){
		String bDate = GlobalVariable.birthDate
		Date date = Date.parse('ddMMyy',bDate)
		String bulan = date.format('MMMM')
		WebUI.comment(bulan)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Account Creation Page/select_birthMonth'), bulan+' ', true)
		
		String tahun = date.format('YYYY')
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Account Creation Page/select_birthYear'), tahun+'  ', false)
		
		String tanggal = date.format('d')
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Account Creation Page/select_birthDate'), tanggal+'  ', false)
	}
	
	@Then("I want to receive special offer from partner")
	def checkOffer(){
		WebUI.check(findTestObject('Object Repository/Account Creation Page/checkbox_Sign up for our newsletter'))
	}
	
	@Then("I want to set (.*) as name in Address section")
	def verifName(String fName){
		WebUI.setText(findTestObject('Object Repository/Account Creation Page/input_firstname address'), fName)
		WebUI.comment(GlobalVariable.lastName)
		WebUI.setText(findTestObject('Object Repository/Account Creation Page/input_lastname address'), GlobalVariable.lastName)
	}
	
	@Then("I want to fill address info")
	def addressInfo(){
		WebUI.setText(findTestObject('Object Repository/Account Creation Page/input_Company'), customKey.Helper.getRandomCharSequence(12))
		WebUI.setText(findTestObject('Object Repository/Account Creation Page/input_address'), customKey.Helper.getRandomCharSequence(40))
		WebUI.setText(findTestObject('Object Repository/Account Creation Page/input_address2'), customKey.Helper.getRandomCharSequence(13))
		WebUI.setText(findTestObject('Object Repository/Account Creation Page/input_city'), customKey.Helper.getRandomCharSequence(6))
		
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Account Creation Page/select_state'), customKey.Helper.getRandomInteger(0, 50))
		
		
		WebUI.setText(findTestObject('Object Repository/Account Creation Page/input_postcode'), customKey.Helper.getRandomNumSequence(5))
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Account Creation Page/select_country'), 'United States', false)
		
		WebUI.setText(findTestObject('Object Repository/Account Creation Page/input_address alias'), 'address 1')
	}
	
	@Then("I want to set my mobile")
	def mobilePhone(){
		WebUI.setText(findTestObject('Object Repository/Account Creation Page/input_phoneMobile'), '08'+customKey.Helper.getRandomNumSequence(10))
	}
	
	@Then("I click on register")
	def register()
	{
		WebUI.click(findTestObject('Object Repository/Account Creation Page/bt_Register'))
		
	}
	
	@Then("I want to verify my registration or login success")
	def verifyRegister(){
		WebUI.verifyTextPresent('Welcome to your account. Here you can manage all of your personal information and orders.', false)
		
	}
}