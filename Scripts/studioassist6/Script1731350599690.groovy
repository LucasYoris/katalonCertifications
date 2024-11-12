import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Test Case 1: Verify user login with valid credentials
// Description: This test verifies that a user can successfully log in when providing a valid username and password.
// Expected Result: The system should grant access and display the dashboard or main page.

// Open the browser and navigate to the application URL
WebUI.openBrowser('')
WebUI.navigateToUrl('http://www.example.com')

// Enter valid username and password
WebUI.setText(findTestObject('Page_Login/input_Username'), 'valid_username')
WebUI.setEncryptedText(findTestObject('Page_Login/input_Password'), 'valid_password')

// Click on the login button
WebUI.click(findTestObject('Page_Login/button_Login'))

// Verify that the dashboard or main page is displayed after successful login
WebUI.verifyElementVisible(findTestObject('Page_Dashboard/div_MainPage'))