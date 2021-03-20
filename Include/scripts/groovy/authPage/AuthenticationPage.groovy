package authPage
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

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

import com.kms.katalon.core.util.KeywordUtil
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable
import io.cucumber.tagexpressions.TagExpressionParser.True
import org.openqa.selenium.Keys as Keys


class AuthenticationPage {

	@Given("I want to open website URL")
	def openWeb() {
		WebUI.openBrowser(null)
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.authPageUrl)
	}

	@Then("I fill my email address with my (.*)")
	email(String fName){

		Date now = new Date()
		Calendar c = Calendar.getInstance()
		DateFormat birthFormat = new SimpleDateFormat('ddMMYY')
		c.setTime(now)
		c.add(Calendar.YEAR, -30)
		Date birthDay = c.getTime()
		String birthDates = birthFormat.format(birthDay)
		GlobalVariable.birthDate = birthDates

		String mail = fName +"."+ birthDates + '.' + customKey.Helper.getRandomInteger(0, 10000) +"@mailtest.com"
		WebUI.setText(findTestObject('Object Repository/authPage/input_Email create'), mail)

		GlobalVariable.mail = mail
	}

	@Then("I click create an account button")
	def createAcc(){
		WebUI.click(findTestObject('Object Repository/authPage/bt_Create an account'))
	}
	
	@Then("I fill my email address")
	def emailLogin(){
		WebUI.setText(findTestObject('Object Repository/authPage/input_Email login'), GlobalVariable.mail)
		WebUI.comment(GlobalVariable.mail)
	}
	
	@Then("I fill my password")
	def fillPwd(){
		WebUI.setText(findTestObject('Object Repository/authPage/input_Password login'), GlobalVariable.pwd)
		WebUI.comment(GlobalVariable.pwd)
	}
	@Then("I want to click sign in")
	def signIn(){
		WebUI.click(findTestObject('Object Repository/authPage/bt_Sign in'))
	}
	

}