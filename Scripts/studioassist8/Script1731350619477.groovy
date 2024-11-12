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

// Test Case 3: Verify password reset functionality
// Description: This test verifies that a user can reset their password by using the "Forgot Password" feature and entering a valid email address.
// Expected Result: The system should send a password reset link to the user's email and display a confirmation message.

// Click on the "Forgot Password" link
WebUI.click(findTestObject('Page_Login/btn_ForgotPassword'))

// Enter a valid email address in the email field
WebUI.setText(findTestObject('Page_ForgotPassword/input_Email'), 'testuser@example.com')

// Click on the "Reset Password" button
WebUI.click(findTestObject('Page_ForgotPassword/btn_ResetPassword'))

// Verify that the confirmation message is displayed
WebUI.verifyElementVisible(findTestObject('Page_ForgotPassword/msg_ConfirmationMessage'))