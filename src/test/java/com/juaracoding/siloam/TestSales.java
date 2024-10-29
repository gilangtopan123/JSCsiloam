package com.juaracoding.siloam;

import com.beust.ah.A;
import com.juaracoding.siloam.pages.LoginPage;
import com.juaracoding.siloam.pages.SalesPages;
import com.juaracoding.siloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestSales {
    public static WebDriver driver;
    public static LoginPage loginpage = new LoginPage();
    public static SalesPages salespage = new SalesPages();

    public static ExtentTest extentTest;
    public TestSales(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("User sudah login dan berada di home sales")
    public void user_sudah_login_dan_berada_di_home_sales(){
        loginpage.loginSales("D6200927","1997-10-23");
        extentTest.log(LogStatus.PASS,"User sudah login dan berada di home");
    }
    @When("User click menu input")
    public void user_click_menu_input(){
        salespage.menuInput();
        extentTest.log(LogStatus.PASS,"User click menu input");
    }
    @And("User input nama valid")
    public void user_input_nama_valid(){
        salespage.inputName("Testttt");
        extentTest.log(LogStatus.PASS,"User input nama valid");
    }
    @And("User input no bpjs valid")
    public void user_input_no_bpjs_valid(){
        salespage.inputBpjs("1234235678972");
        extentTest.log(LogStatus.PASS,"User input no bpjs valid");
    }
    @And("User input no bpjs yang sudah terdaftar")
    public void user_input_no_bpjs_yang_sudah_terdaftar(){
        salespage.inputBpjs("1234565678990");
        extentTest.log(LogStatus.PASS,"User input no bpjs yang sudah terdaftar");
    }

    @And("User input no ktp valid")
    public void user_input_no_ktp_valid(){
        salespage.inputKtp("1212121212121212");
        extentTest.log(LogStatus.PASS,"User input no ktp valid");
    }
    @And("User input alamat valid")
    public void user_input_alamat_valid(){
        salespage.inputAddress("jl jalan aja");
        extentTest.log(LogStatus.PASS,"User input alamat valid");
    }
    @And("User input Kota ktp valid")
    public void user_input_Kota_ktp_valid(){
        salespage.pilihKota();
        extentTest.log(LogStatus.PASS,"User input Kota ktp valid");
    }
    @And("User input faskes awal")
    public void user_input_faskes_awal(){
        salespage.inputFaskesAwal("aaaaaaa");
        extentTest.log(LogStatus.PASS,"User input faskes awal");
    }
    @And("User input faskes tujuan")
    public void user_input_faskes_tujuan(){
        salespage.pilihFaskesTujuan();
        extentTest.log(LogStatus.PASS,"User input faskes tujuan");
    }
    @And("User input faskes tujuan berbeda")
    public void user_input_faskes_tujuan_berbeda(){
        salespage.pilihFaskesTujuanBeda();
        extentTest.log(LogStatus.PASS,"User input faskes tujuan berbeda");
    }
    @And("User input alasan")
    public void user_input_alasan(){
        salespage.inputAlasan("abcde");
        extentTest.log(LogStatus.PASS,"User input alasan");
    }
    @And("User click button simpan data")
    public void user_click_button_simpan_data(){
        salespage.btnSubmit();
        extentTest.log(LogStatus.PASS,"User click button simpan data");
    }
    @And("User input nama null")
    public void user_input_nama_null(){
        salespage.inputName("");
        extentTest.log(LogStatus.PASS,"User input nama null");
    }
    @And("User input no bpjs null")
    public void user_input_no_bpjs_null(){
        salespage.inputBpjs("");
        extentTest.log(LogStatus.PASS,"User input no bpjs null");
    }
    @And("User input no bpjs kurang dari 13 digit")
    public void user_input_no_bpjs_kurang_dari_13_digit(){
        salespage.inputBpjs("122332323");
        extentTest.log(LogStatus.PASS,"User input no bpjs kurang dari 13 digit");
    }
    @And("User input no bpjs dengan huruf")
    public void user_input_no_bpjs_dengan_huruf(){
        salespage.inputBpjs("a");
        extentTest.log(LogStatus.PASS,"User input no bpjs dengan huruf");
    }
    @And("User input no ktp null")
    public void user_input_no_ktp_null(){
        salespage.inputKtp("");
        extentTest.log(LogStatus.PASS,"User input no ktp null");
    }
    @And("User input no ktp kurang dari 16 digit")
    public void user_input_no_ktp_kurang_dari_16_digit(){
        salespage.inputKtp("1234566");
        extentTest.log(LogStatus.PASS,"User input no ktp kurang dari 16 digit");
    }
    @And("User input no ktp menggunakan karakter huruf")
    public void user_input_no_ktp_menggunakan_karakter_huruf(){
        salespage.inputKtp("a");
        extentTest.log(LogStatus.PASS,"User input no ktp menggunakan karakter huruf");
    }
    @And("User input alamat null")
    public void user_input_alamat_null(){
        salespage.inputAddress("");
        extentTest.log(LogStatus.PASS,"User input alamat null");
    }
    @And("User input faskes awal null")
    public void user_input_faskes_awal_null(){
        salespage.inputFaskesAwal("");
        extentTest.log(LogStatus.PASS,"User input faskes awal null");
    }
    @And("User input alasan null")
    public void user_input_alasan_null(){
        salespage.inputAlasan("");
        extentTest.log(LogStatus.PASS,"User input alasan null");
    }
    @Then("User mendapatkan message bpjs already exist")
    public void user_mendapatkan_message_bpjs_already_exist(){
        Assert.assertEquals(salespage.getTxtBpjsAlreadyExist(),"The Nomor BPJS already exist.");
        extentTest.log(LogStatus.PASS,"User mendapatkan message bpjs already exist");
    }

    @Then("User mendapatkan message field alasan harus diisi")
    public void User_mendapatkan_message_field_alasan_harus_diisi(){
//        String txtAlasanWajibDiisi = salespage.getTxtFieldAlasanMessage();
//        Assert.assertTrue(txtAlasanWajibDiisi.contains("Alasan"));
        Hooks.delay(1);
        Assert.assertEquals(salespage.getTxtFieldAlasanMessage(),"Field Alasan Harus Diisi!");
        extentTest.log(LogStatus.PASS,"User mendapatkan message field alasan harus diisi");
    }
    @Then("User diarahkan ke halaman upload dokumen")
    public void user_diarahkan_ke_halaman_upload_dokumen(){
        Hooks.delay(1);
        String txtSuccessSave = salespage.getTxtSuccessSave();
        Assert.assertTrue(txtSuccessSave.contains("Data"));
        extentTest.log(LogStatus.PASS,"User diarahkan ke halaman upload dokumen");
    }
    @Then("User mendapatkan message Please fill the fields nama")
    public void user_mendapatkan_message_Please_fill_the_fields_nama(){
        Assert.assertEquals(salespage.getTxtNama(),"true");
        extentTest.log(LogStatus.PASS,"User mendapatkan message Please fill the fields nama");
    }
    @Then("User mendapatkan message Please fill the fields di no ktp")
    public void user_mendapatkan_message_Please_fill_the_fields_di_no_ktp(){
        Assert.assertEquals(salespage.getTxtNoKTP(),"true");
        extentTest.log(LogStatus.PASS,"User mendapatkan message Please fill the fields di no ktp");
    }
    @Then("User mendapatkan message Please fill the fields di no bpjs")
    public void user_mendapatkan_message_Please_fill_the_fields_di_no_bpjs(){
        Assert.assertEquals(salespage.getTxtBpjs(),"true");
        extentTest.log(LogStatus.PASS,"User mendapatkan message Please fill the fields di no bpjs");
    }
    @Then("User mendapatkan message Please fill the fields di faskes awal")
    public void user_mendapatkan_message_Please_fill_the_fields_di_faskes_awal(){
        Assert.assertEquals(salespage.getTxtFaskesAwal(),"true");
        extentTest.log(LogStatus.PASS,"User mendapatkan message Please fill the fields di faskes awal");
    }

    @Then("User mendapatkan message Please match the requested format di bpjs")
    public void user_mendapatkan_message_Please_match_the_requested_format_di_bpjs(){
        Assert.assertEquals(salespage.getTxtBpjs(),"true");
        extentTest.log(LogStatus.PASS,"User mendapatkan message Please match the requested format di bpjs");
    }
    @Then("User mendapatkan message Please match the requested format di ktp")
    public void user_mendapatkan_message_Please_match_the_requested_format_di_ktp(){
        Assert.assertEquals(salespage.getTxtNoKTP(),"true");
        extentTest.log(LogStatus.PASS,"User mendapatkan message Please match the requested format di ktp");
    }
    @Then("input user bpjs akan terhapus")
    public void input_user_bpjs_akan_terhapus(){
        Assert.assertEquals(salespage.getTxtBpjs(),"true");
        extentTest.log(LogStatus.PASS,"input user akan terhapus");
    }
    @Then("input user KTP akan terhapus")
    public void input_user_KTP_akan_terhapus(){
        Assert.assertEquals(salespage.getTxtNoKTP(),"true");
        extentTest.log(LogStatus.PASS,"input user KTP akan terhapus");
    }
    @Then("User mendapat message kota ktp harus diisi")
    public void user_mendapat_message_kota_ktp_harus_diisi(){
        salespage.getTxtCity();
        Assert.assertEquals(salespage.getTxtCity(),"true");
        extentTest.log(LogStatus.PASS,"User mendapatkan message Please fill the fields di kota ktp");
    }
    @Then("User mendapat message faskes tujuan harus diisi")
    public void user_mendapat_message_faskes_tujuan_harus_diisi(){
        Assert.assertEquals(salespage.getTxtFaskesTujuan(),"true");
        extentTest.log(LogStatus.PASS,"User mendapat message faskes tujuan harus diisi");
    }


}
