package customKey
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import internal.GlobalVariable

public class Helper {

	@Keyword
	public static String getRandomCharSequence(int length) {
		StringBuilder builder = new StringBuilder();
		Random rnd = new Random();
		String possibleChars = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"
		while (builder.length() < length) {
			int index = (int)(rnd.nextFloat() * possibleChars.length());
			builder.append(possibleChars.charAt(index));
		}
		return builder.toString();
	}
	@Keyword
	public static String getRandomNumSequence(int length) {
		StringBuilder builder = new StringBuilder();
		Random rnd = new Random();
		String possibleChars = "1234567890"
		while (builder.length() < length) {
			int index = (int)(rnd.nextFloat() * possibleChars.length());
			builder.append(possibleChars.charAt(index));
		}
		return builder.toString();
	}
	
	@Keyword
	public static int getRandomInteger(int lowerBound, int upperBound) {
		return new Random().nextInt(upperBound - lowerBound + 1) + lowerBound;
	}
	
	@Keyword
	public static void selectRandomOption(TestObject testObject, int timeout) {
		WebElement element = WebUiCommonHelper.findWebElement(testObject, timeout);
		Select select = new Select(element);
		select.selectByIndex(new Random().nextInt(select.getOptions() - 1));
	}
}

