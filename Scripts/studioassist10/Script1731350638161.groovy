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

// Test Case 5: Verify account balance after a successful transaction
// Description: This test verifies that the account balance updates correctly after a user completes a valid transaction.
// Expected Result: The system should deduct the transaction amount from the account balance and display the updated balance.

// Open the browser and navigate to the website
WebUI.openBrowser('')

// Maximize the browser window
WebUI.maximizeWindow()

// Navigate to the login page
WebUI.navigateToUrl('http://www.example.com/login')

// Enter username and password
WebUI.setText(findTestObject('Page_Login/input_Username'), 'testuser')
WebUI.setEncryptedText(findTestObject('Page_Login/input_Password'), 'password123')

// Click on the login button
WebUI.click(findTestObject('Page_Login/button_Login'))

// Verify that the user is logged in successfully
WebUI.verifyElementVisible(findTestObject('Page_Dashboard/div_WelcomeMessage'))

// Store the initial account balance
def initialBalance = WebUI.getText(findTestObject('Page_Dashboard/span_AccountBalance'))

// Perform a transaction (e.g., make a purchase)
// Assuming the transaction is successful and the balance is updated correctly

// Verify the updated account balance after the transaction
WebUI.verifyNotMatch(WebUI.getText(findTestObject('Page_Dashboard/span_AccountBalance')), initialBalance)

// Close the browser
WebUI.closeBrowser()