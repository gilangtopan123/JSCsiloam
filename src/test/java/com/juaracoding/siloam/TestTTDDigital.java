//package com.juaracoding.siloam;
//
//import com.juaracoding.siloam.pages.LoginPage;
//import com.juaracoding.siloam.pages.SalesPages;
//import com.juaracoding.siloam.utils.Constants;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//import io.cucumber.java.bs.A;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.messages.types.Hook;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//import java.net.PasswordAuthentication;
//
//public class TestTTDDigital{
//    public static WebDriver driver;
//    public static LoginPage loginpage = new LoginPage();
//    public static SalesPages salespage = new SalesPages();
//
//    public static ExtentTest extentTest;
//
//    public TestTTDDigital() {
//        driver = Hooks.driver;
//        extentTest = Hooks.extentTest;
//    }
//
//    //--------------------------------INPUT TTD DIGITAL---------------------------------------------
//    //--------------------------null nama------------------------
//    @Given("User sudah membuka alamat url login input data dan upload dokumen")
//    public void user_sudah_membuka_alamat_url_login_input_data_dan_upload_dokumen() {
//
//        driver.get(Constants.URL);
//        Hooks.delay(2);
//        loginpage.loginSales("D6200927", "1997-10-23");
//        //nobpjs harus diganti setiap kali run test
//        salespage.inputData("test", "6433565048973", "1212121212121212", "jljl", "abcde", "jauh");
//        salespage.uploadDokumen(salespage.fileJpg, salespage.fileJpg, salespage.fileJpg);
//        extentTest.log(LogStatus.PASS, "User sudah membuka alamat url login input data dan upload dokumen");
//    }
//
//    @When("User edit nama menjadi null")
//    public void user_edit_nama_menjadi_null() {
//        salespage.clickBtnEdit();
//        salespage.editHapusNama();
//        extentTest.log(LogStatus.PASS, "User edit nama menjadi null");
//    }
//
//    @And("User click simpan data")
//    public void user_click_simpan_data() {
//        Hooks.delay(1);
//        salespage.simpanDataEdit();
//        extentTest.log(LogStatus.PASS, "User click simpan data");
//    }
//
//    @Then("User mendapatkan info data berhasil disimpan")
//    public void user_mendapatkan_info_data_berhasil_disimpan() {
//        Hooks.delay(2);
//        String txtDataBerhasilDisimpan = salespage.getTxtDataBerhasilDisimpan();
//        Assert.assertTrue(txtDataBerhasilDisimpan.contains("Data"));
//        extentTest.log(LogStatus.PASS, "User mendapatkan info data berhasil disimpan");
//    }
//
//
//
//    //------------------------------bpjs-------------
//    @When("User edit nomor bpjs kurang dari 13 digit")
//    public void User_edit_nomor_bpjs_kurang_dari_13_digit(){
//        salespage.clickBtnEdit();
//        salespage.editHapusbpjskurang13();
//        extentTest.log(LogStatus.PASS,"User edit nomor bpjs kurang dari 13 digit");
//    }
//    @Then("User mendapatkan message nomor bpjs kurang dari 13 digit")
//    public void User_mendapatkan_message_nomor_bpjs_kurang_dari_13_digit() {
//        Assert.assertEquals(salespage.getTxtBpjs(), "");
//        extentTest.log(LogStatus.PASS, "User mendapatkan message nomor bpjs kurang dari 13 digit");
//    }
//    @When("User edit nomor bpjs menjadi null")
//    public void User_edit_nomor_bpjs_menjadi_null() {
//        salespage.clickBtnEdit();
//        salespage.editHapusbpjs();
//        extentTest.log(LogStatus.PASS, "User edit nomor bpjs menjadi null");
//    }
//
//    @Then("User mendapatkan message Please fill the fields nomor bpjs")
//    public void User_mendapatkan_message_Please_fill_the_fields_nomor_bpjs() {
//        Assert.assertEquals(salespage.getTxtBpjs(), "");
//        extentTest.log(LogStatus.PASS, "User mendapatkan message Please fill the fields nomor bpjs");
//    }
//
//    //----------------------No KTP-------------------------
//    @When("User edit nomor ktp kurang dari 16 digit")
//    public void User_edit_nomor_ktp_kurang_dari_16_digit(){
//        salespage.clickBtnEdit();
//        salespage.editHapusktpkurang16();
//        extentTest.log(LogStatus.PASS,"User edit nomor ktp kurang dari 16 digit");
//    }
//    @Then("User mendapatkan message nomor ktp kurang dari 16 digit")
//    public void User_mendapatkan_message_nomor_ktp_kurang_dari_16_digit() {
//        Assert.assertEquals(salespage.getTxtNoKTP(), "");
//        extentTest.log(LogStatus.PASS, "User mendapatkan message nomor ktp kurang dari 16 digit");
//    }
//
//
//    @When("User edit nomor ktp menjadi null")
//    public void User_edit_nomor_ktp_menjadi_null() {
//        salespage.clickBtnEdit();
//        salespage.editHapusNoKTP();
//        extentTest.log(LogStatus.PASS, "User edit nomor ktp null");
//    }
//
//    @Then("User mendapatkan message Please fill the fields nomor ktp")
//    public void User_mendapatkan_message_Please_fill_the_fields_nomor_ktp() {
//        Assert.assertEquals(salespage.getTxtNoKTP(), "");
//        extentTest.log(LogStatus.PASS,"User mendapatkan message Please fill the fields nomor ktp");
//    }
//
//    //-----------------------alamat--------------------
//    @When("User edit alamat menjadi null")
//    public void User_edit_alamat_menjadi_null() {
//        salespage.clickBtnEdit();
//        salespage.editHapusAlamat();
//        extentTest.log(LogStatus.PASS, "User edit alamat menjadi null");
//    }
//
//    @Then("User mendapatkan message Please fill the fields alamat")
//    public void User_mendapatkan_message_Please_fill_the_fields_alamat() {
//        Hooks.delay(1);
//        Assert.assertEquals(salespage.getTxtAddressMessage(),"Field Alamat Harus Diisi!");
//        extentTest.log(LogStatus.PASS,"User mendapatkan message Please fill the fields alamat");
//    }
//
//    //----------------------ddown kota ktp-----------------
//    @When("User edit kota ktp")
//    public void User_edit_kota_ktp() {
//        salespage.editPilihKota();
//        extentTest.log(LogStatus.PASS,"User edit kota ktp");
//    }
//
//    //------------------------faskes awal----------------------
//    @When("User edit faskes awal menjadi null")
//    public void User_edit_faskes_awal_menjadi_null() {
//        salespage.clickBtnEdit();
//        salespage.editHapusFaskesAwal();
//        extentTest.log(LogStatus.PASS, "User edit faskes awal menjadi null");
//    }
//
//    @Then("User mendapatkan message Please fill the fields faskes awal")
//    public void User_mendapatkan_message_Please_fill_the_fields_faskes_awal() {
//        Hooks.delay(1);
//        Assert.assertEquals(salespage.getTxtFaskesAsalMessage(), "Field Faskes Asal Harus Diisi!");
//        extentTest.log(LogStatus.PASS,"User mendapatkan message Please fill the fields faskes awal");
//    }
//
//    //----------------------------faskes tujuan berbeda dari kota ktp-------------
//    @When("User edit faskes tujuan berbeda dari kota ktp")
//    public void User_edit_faskes_tujuan_berbeda_dari_kota_ktp(){
//        salespage.clickBtnEdit();
//        salespage.pilihFaskesTujuanBeda();
//        extentTest.log(LogStatus.PASS,"User edit faskes tujuan berbeda dari kota ktp");
//    }
//    @And("User mengisi alasan null")
//    public void User_mengisi_alasan_null(){
//        salespage.editHapusAlasan();
//        extentTest.log(LogStatus.PASS,"User mengisi alasan null");
//    }
//    @And("User mengisi alasan")
//    public void User_mengisi_alasan(){
//        salespage.inputAlasan("alasan");
//        extentTest.log(LogStatus.PASS,"User mengisi alasan");
//    }
//    @Then("User mendapatkan message Please fill the fields alasan")
//    public void User_mendapatkan_message_Please_fill_the_fields_alasan(){
//        Hooks.delay(1);
//        Assert.assertEquals(salespage.getTxtFieldAlasanMessage(),"Field Alasan Harus Diisi");
//        extentTest.log(LogStatus.PASS,"User mendapatkan message Please fill the fields alasan");
//    }
//    //-----------------------------faskes tujuan sama dari kota ktp---------------------
//    @When("User edit faskes tujuan sama dari kota ktp")
//    public void user_edit_faskes_tujuan_sama_dari_kota_ktp(){
//        salespage.clickBtnEdit();
//        salespage.pilihFaskesTujuan();
//        extentTest.log(LogStatus.PASS,"User edit faskes tujuan sama dari kota ktp");
//    }
//
//
//    // -----------------------------------edit foto-------------------------------------
//    @When("User menekan tombol x di foto before")
//    public void user_menekan_tombol_x_di_foto_before(){
//        Hooks.delay(1);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");
//        salespage.hapusGambarBefore();
//        extentTest.log(LogStatus.PASS,"User menekan tombol x di foto before");
//    }
//    @When("User menekan tombol x di foto after")
//    public void user_menekan_tombol_x_di_foto_after(){
//        Hooks.delay(1);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");
//        salespage.hapusGambarAfter();
//        extentTest.log(LogStatus.PASS,"User menekan tombol x di foto after");
//    }
//
//    @When("User menekan tombol x di foto TTD")
//    public void user_menekan_tombol_x_di_foto_TTD(){
//        Hooks.delay(1);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");
//        salespage.hapusGambarTTD();
//        extentTest.log(LogStatus.PASS,"User menekan tombol x di foto TTD");
//    }
//
//    @When("User mengganti foto before")
//    public void user_mengganti_foto_before(){
//        salespage.gantiGambarBefore(salespage.fileJpg);
//        extentTest.log(LogStatus.PASS,"User menambahkan foto before");
//    }
//    @When("User mengganti foto after")
//    public void user_mengganti_foto_after(){
//        salespage.gantiGambarAfter(salespage.fileJpg);
//        extentTest.log(LogStatus.PASS,"User mengganti foto after");
//    }
//
//    @When("User mengganti foto TTD")
//    public void user_mengganti_foto_TTD(){
//        salespage.gantiGambarTTD(salespage.fileJpg);
//        extentTest.log(LogStatus.PASS,"User mengganti foto TTD");
//    }
//
//    @When("User scroll ke tombol submit")
//    public void user_scroll_ke_tombol_submit(){
//        salespage.scrollToSubmit();
//        extentTest.log(LogStatus.PASS,"User scroll ke tombol submit");
//    }
//    @And("User menekan tombol submit")
//    public void user_menekan_tombol_submit(){
//        salespage.submitTTD();
//        extentTest.log(LogStatus.PASS,"User menekan tombol submit");
//    }
//    @Then("User menuju ke menu input")
//    public void user_menuju_ke_menu_input(){
//        salespage.getTxtMenuInput();
//        extentTest.log(LogStatus.PASS,"User menuju ke menu input");
//    }
//
//    @Then("User mendapatkan message dokumen lengkap")
//    public void user_mendapatkan_message_dokumen_lengkap(){
//        Hooks.delay(1);
//        String txtDokumenLengkap = salespage.getTxtDokumenLengkap();
//        Assert.assertTrue(txtDokumenLengkap.contains("dokumen"));
//    }
//    @Then("User mendapatkan message dokumen tidak lengkap")
//    public void user_mendapatkan_message_dokumen_tidak_lengkap(){
//        Hooks.delay(1);
//        String txtDokumenTidakLengkap = salespage.getTxtDokumenTidakLengkap();
//        Assert.assertTrue(txtDokumenTidakLengkap.contains("DOKUMEN"));
//        extentTest.log(LogStatus.PASS,"User mendapatkan message dokumen tidak lengkap");
//    }
//
//}