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

// Test Case 2: Verify user login with invalid credentials
// Description: This test checks that the system denies access when an incorrect username or password is entered.
// Expected Result: The system should display an "Invalid credentials" error message and prevent access.

// Open the browser and navigate to the login page
WebUI.openBrowser('')
WebUI.navigateToUrl('http://www.example.com/login')

// Enter invalid username and password
WebUI.setText(findTestObject('Page_Login/input_Username'), 'invalid_username')
WebUI.setText(findTestObject('Page_Login/input_Password'), 'invalid_password')

// Click on the login button
WebUI.click(findTestObject('Page_Login/button_Login'))

// Verify that the "Invalid credentials" error message is displayed
WebUI.verifyElementVisible(findTestObject('Page_Login/text_InvalidCredentialsErrorMessage'))