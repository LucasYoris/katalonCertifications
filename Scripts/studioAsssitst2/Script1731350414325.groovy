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

//go to saucedemo.com
//do login putting username and pasword
//add items to the cart
//close browser
// Navigates to the URL "https://www.saucedemo.com"
WebUI.navigateToUrl('https://www.saucedemo.com')

// Enters the username and password in the login form
WebUI.setText(findTestObject('input_username'), 'your_username')
WebUI.setText(findTestObject('input_password'), 'your_password')

// Clicks on the login button
WebUI.click(findTestObject('button_login'))

// Adds items to the cart
WebUI.click(findTestObject('button_add_to_cart', [('item_name') : 'Sauce Labs Backpack']))
WebUI.click(findTestObject('button_add_to_cart', [('item_name') : 'Sauce Labs Bolt T-Shirt']))

// Closes the browser
WebUI.closeBrowser()