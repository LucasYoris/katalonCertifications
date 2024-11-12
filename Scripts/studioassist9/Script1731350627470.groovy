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

// Test Case 4: Verify that a new user can register successfully
// Description: This test checks that a new user can complete the registration process when providing all required information correctly.
// Expected Result: The system should create a new account and redirect the user to a welcome page or dashboard.

// Open the browser and navigate to the registration page
WebUI.openBrowser('')
WebUI.navigateToUrl('http://www.example.com/register')

// Fill in the registration form with valid information
WebUI.setText(findTestObject('Page_Register/input_FirstName'), 'John')
WebUI.setText(findTestObject('Page_Register/input_LastName'), 'Doe')
WebUI.setText(findTestObject('Page_Register/input_Email'), 'johndoe@example.com')
WebUI.setText(findTestObject('Page_Register/input_Password'), 'P@ssw0rd')
WebUI.setText(findTestObject('Page_Register/input_ConfirmPassword'), 'P@ssw0rd')

// Click on the Register button
WebUI.click(findTestObject('Page_Register/button_Register'))

// Verify that the user is redirected to the welcome page or dashboard
WebUI.verifyElementVisible(findTestObject('Page_Welcome/h1_WelcomeMessage'))