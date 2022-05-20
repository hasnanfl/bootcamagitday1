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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://devb2c.astraotoparts.co.id/')

WebUI.click(findTestObject('Object Repository/Test Random/Page_AOP/button_Aktifkan lain kali saja'))

WebUI.click(findTestObject('Object Repository/Test Random/Page_AOP/img_Bisnis_sc-1hxhqap-2 jOfcLH'))

WebUI.click(findTestObject('Object Repository/Test Random/Page_AOP/div_All rights reserved_sc-22dkih-2 htMicR'))

WebUI.click(findTestObject('Object Repository/Test Random/Page_AOP/div_Semua LayananSuku CadangLayanan Bengkel_998253'))

WebUI.click(findTestObject('Object Repository/Test Random/Page_AOP/img_Suku Cadang_sc-1hxhqap-2 kuQdpn'))

WebUI.click(findTestObject('Object Repository/Test Random/Page_AOP/button_Motor'))

WebUI.click(findTestObject('Object Repository/Test Random/Page_AOP/img_Stok tersedia_sc-dfsrp1-17 dGwcMx'))

WebUI.click(findTestObject('Object Repository/Test Random/Page_AOP/span_Baca Selengkapnya'))

WebUI.closeBrowser()

