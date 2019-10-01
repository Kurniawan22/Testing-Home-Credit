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

Mobile.startApplication('D:\\Apk Android\\home credit.apk', true)

Mobile.tap(findTestObject('Register/android.widget.TextView0 - Sudah punya akun Log In Sekarang'), 0)

Mobile.tap(findTestObject('Register/android.widget.TextView0 - Belum punya akun Daftar sekarang'), 0)

Mobile.tap(findTestObject('Register/android.widget.TextView0 - Tanggal Lahir'), 0)

Mobile.tap(findTestObject('Register/android.widget.Button0 - OK'), 0)

Mobile.setText(findTestObject('Register/android.widget.EditText0 - Masukkan No. Handphone Anda'), '85234538634', 0)

Mobile.setText(findTestObject('Register/android.widget.EditText0 - Tentukan Kode PIN (4 Digit)'), '123456', 0)

Mobile.setText(findTestObject('Register/android.widget.EditText0 - Konfirmasi Kode PIN'), '123456', 0)

Mobile.tap(findTestObject('Register/android.widget.Button0 - LANJUTKAN'), 0)

Mobile.tap(findTestObject('Register/android.widget.TextView0 - Saya Setuju'), 0)

Mobile.setText(findTestObject('Register/android.widget.EditText0'), '1234', 0)

Mobile.tap(findTestObject('Register/android.widget.Button0 - DAFTAR'), 0)

Mobile.closeApplication()

