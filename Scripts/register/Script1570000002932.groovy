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

Mobile.startApplication('D:\\Apk Android\\id_co_myhomecredit_3.2.0_07_18_2019.apk', true)

Mobile.delay(5)

Mobile.tap(findTestObject('regiter-v2/android.widget.TextView0 - Sudah punya akun Log In Sekarang'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('regiter-v2/android.widget.TextView0 - Belum punya akun Daftar sekarang'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('regiter-v2/android.widget.TextView0 - Tanggal Lahir'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('regiter-v2/android.widget.Button0 - OK'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('regiter-v2/android.widget.EditText0 - Masukkan No. Handphone Anda'), '85664307216', 0)

Mobile.delay(5)

Mobile.setText(findTestObject('regiter-v2/android.widget.EditText0 - Tentukan Kode PIN (4 Digit)'), '1234', 0)

Mobile.delay(5)

Mobile.setText(findTestObject('regiter-v2/android.widget.EditText0 - Konfirmasi Kode PIN'), '1234', 0)

Mobile.delay(5)

Mobile.tap(findTestObject('regiter-v2/android.widget.Button0 - LANJUTKAN'), 0)

Mobile.delay(5)

Mobile.scrollToText('Apabila aplikasi untuk fasilitas pembiayaan saya termasuk, akan tetapi tidak terbatas pada, fasilitas pembiayaan multiguna, disetujui oleh Home Credit')


Mobile.delay(5)

Mobile.tap(findTestObject('regiter-v2/android.widget.TextView0 - Saya Setuju'), 0)

Mobile.delay(5)

TestObject notification = findTestObject('Object Repository/First Notification Item')
Mobile.tap(notification, 10)

TestObject otp = findTextObject('Object Repository/OTP Text')
String otpText = Mobile.getText(otp, 10)

print otpText

Mobile.setText(findTestObject('regiter-v2/android.widget.EditText0'), otpText, 0)

Mobile.delay(5)

Mobile.tap(findTestObject('regiter-v2/android.widget.Button0 - DAFTAR'), 0)

Mobile.delay(5)

Mobile.closeApplication()

