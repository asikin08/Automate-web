import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Store/Menu'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Store/Slider'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Store/Content of slider'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Store/Thmbnail of best seller'))

WebUI.mouseOver(findTestObject('Page_My Store/img_Best Sellers_replace-2x img-responsive'))

WebUI.click(findTestObject('Page_My Store/span_More'))

WebUI.delay(6)

WebUI.click(findTestObject('Page_My Store/Add to cart'))

WebUI.delay(6)

WebUI.click(findTestObject('Page_Faded Short Sleeve T-shirts - My Store/i_Proceed to checkout_icon-chevron-right right'))

WebUI.verifyElementVisible(findTestObject('Page_Order - My Store/span_01 Summary'))

WebUI.verifyElementVisible(findTestObject('Page_Order - My Store/02 Sign in'))

WebUI.verifyElementVisible(findTestObject('Page_Login - My Store/03 Address'))

WebUI.verifyElementVisible(findTestObject('Page_Login - My Store/04 Shipping'))

WebUI.verifyElementVisible(findTestObject('Page_Login - My Store/05 Payment'))

WebUI.closeBrowser()

