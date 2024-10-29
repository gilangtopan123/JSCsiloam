package com.juaracoding.siloam;

import com.juaracoding.siloam.pages.SalesPages;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class TestUploadSales {
    public static WebDriver driver;
    public static SalesPages salespage = new SalesPages();

    public static ExtentTest extentTest;

    public TestUploadSales() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Scenario: User upload document valid (setiap run test ubah no bpjs)
    @When("User sudah input data dan click next")
    public void user_sudah_input_data_dan_click_next() {
        salespage.inputData("tester", "4145999110321", "1262121212121212", "Jakarta", "Awal", "Jauh");
        extentTest.log(LogStatus.PASS, "User sudah input data dan click next");
    }

    @When("User upload foto faskes awal")
    public void user_upload_foto_faskes_awal() {
        salespage.uploadFaskesAwal(salespage.fileJPG);
        extentTest.log(LogStatus.PASS, "User upload foto faskes awal");
    }

    @When("User upload foto faskes tujuan")
    public void user_upload_foto_faskes_tujuan() {
        Hooks.delay(2);
        salespage.uploadFaskesTujuan(salespage.fileJPG);
        extentTest.log(LogStatus.PASS, "User upload foto faskes tujuan");
    }

    @When("User upload foto TTD digital")
    public void user_upload_foto_ttd_digital() {
        Hooks.delay(2);
        salespage.uploadTtdDigital(salespage.fileJPG);
        extentTest.log(LogStatus.PASS, "User upload foto TTD digital");

    }

    @Then("Menampilkan message dokumen sudah lengkap")
    public void menampilkan_message_dokumen_sudah_lengkap() {
        Assert.assertEquals(salespage.alertDokumenLengkap(), "Terima kasih dokumen anda sudah lengkap !");
        extentTest.log(LogStatus.PASS, "Menampilkan message dokumen sudah lengkap");

    }

    @Then("User click button next dan diarahkan ke tab TTD digital")
    public void user_click_button_next_dan_diarahkan_ke_tab_ttd_digital() {
        salespage.setBtnSelanjutnya();
        driver.switchTo().alert().accept();
        Assert.assertEquals(salespage.txtTtdDigital(), "TTD Digital  ");
        extentTest.log(LogStatus.PASS, "User click button next dan diarahkan ke tab TTD digital");
    }

    // Scenario: Upload dokumen invalid : tidak memasukan foto
    @When("User sudah input1 data dan click next")
    public void user_sudah_input1_data_dan_click_next() {
        salespage.inputData("tester", "4441999524444", "1212121212121212", "Jakarta", "Awal", "Jauh");
        extentTest.log(LogStatus.PASS, "User sudah input data dan click next");
    }

    @When("User sudah input2 data dan click next")
    public void user_sudah_input2_data_dan_click_next() {
        Hooks.delay(2);
        salespage.inputData("tester", "3142999355555", "1212121212121212", "Jakarta", "Awal", "Jauh");
        extentTest.log(LogStatus.PASS, "User sudah input data dan click next");
    }

    @When("User sudah input3 data dan click next")
    public void user_sudah_input3_data_dan_click_next() {
        Hooks.delay(2);
        salespage.inputData("tester", "4142999212666", "1212121212121212", "Jakarta", "Awal", "Jauh");
        extentTest.log(LogStatus.PASS, "User sudah input data dan click next");
    }

    @When("User tanpa upload foto faskes awal")
    public void user_tanpa_upload_foto_faskes_awal() {
        extentTest.log(LogStatus.PASS, "User tanpa upload foto faskes awal");

    }

    @When("User tanpa upload foto faskes tujuan")
    public void user_tanpa_upload_foto_faskes_tujuan() {
        extentTest.log(LogStatus.PASS, "User tanpa upload foto faskes tujuan");

    }

    @When("User tanpa upload foto TTD digital")
    public void user_tanpa_upload_foto_ttd_digital() {
        extentTest.log(LogStatus.PASS, "User tanpa upload foto TTD digital");

    }

    @Then("User tidak dapat menekan button selanjutnya")
    public void user_tidak_dapat_menekan_button_selanjutnya() {
        System.out.println(salespage.buttonIsEnable());
        Assert.assertFalse(salespage.buttonIsEnable());
        extentTest.log(LogStatus.PASS, "User tidak dapat menekan button selanjutnya");

    }

    //  Scenario: Upload dokumen invalid : upload gambar dengan size lebih dari 5mb
        @When("User sudah input data dan click next : test size lebih dari 5mb")
    public void user_sudah_input_data_dan_click_next_test_size_lebih_dari_5mb() {
        salespage.inputData("tester", "4149992229266", "1772121620121212", "Jakarta", "Awal", "Jauh");
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User sudah input data dan click next : test size lebih dari 5mb");
    }

    @And("User upload foto faskes awal dengan size lebih dari 5mb")
    public void user_upload_foto_faskes_awal_dengan_size_lebih_dari_5mb() {
        salespage.uploadFaskesAwalFormat(salespage.fileJPG10mb);
        extentTest.log(LogStatus.PASS, "User upload foto faskes awal dengan size lebih dari 5mb");
    }

    @When("User upload foto faskes tujuan dengan size lebih dari 5mb")
    public void user_upload_foto_faskes_tujuan_dengan_size_lebih_dari_5mb() {
        salespage.setBtnUploadCancel();
        salespage.uploadFaskesTujuanFormat(salespage.fileJPG10mb);
        extentTest.log(LogStatus.PASS, "User upload foto faskes tujuan dengan size lebih dari 5mb");
    }

    @When("User upload foto TTD digital dengan size lebih dari 5mb")
    public void user_upload_foto_ttd_digital_dengan_size_lebih_dari_5mb() {
        salespage.setBtnUploadCancel();
        salespage.uploadTtdDigitalFormat(salespage.fileJPG10mb);
        extentTest.log(LogStatus.PASS, "User upload foto TTD digital dengan size lebih dari 5mb");
    }

    @When("User click save gambar")
    public void user_click_save_gambar() {
        Hooks.delay(3);
        salespage.btnSaveFile();
        extentTest.log(LogStatus.PASS, "User click save");
    }
    @Then("Menampilkan alert upload is larger than the permitted size")
    public void menampilkan_alert_upload_is_larger_than_the_permitted_size() {
        Hooks.delay(20);
        System.out.println(salespage.msgUploadLarger());
        Assert.assertEquals(salespage.msgUploadLarger(), "Upload error: The file you are attempting to upload is larger than the permitted size.");
        extentTest.log(LogStatus.PASS, "Menampilkan alert upload is larger than the permitted size");
    }

    //    Scenario: Upload dokumen invalid : memasukan gambar format PNG
    @When("User sudah input data dan click next : test format file")
    public void user_sudah_input_data_dan_click_next_test_format_file() {
        salespage.inputData("tester", "41499911112166", "1772121652121212", "Jakarta", "Awal", "Jauh");
        extentTest.log(LogStatus.PASS, "User sudah input data dan click next : test format file");

    }

    @And("User upload foto faskes awal dengan format PNG")
    public void user_upload_foto_faskes_awal_dengan_format_png() {
        salespage.uploadFaskesAwalFormat(salespage.filePNG);
        extentTest.log(LogStatus.PASS, "User upload foto faskes awal dengan format PNG");
    }

    @When("User click save gambar faskes awal")
    public void user_click_save_gambar_faskes_awal() {
        Hooks.delay(3);
        salespage.btnSaveFile();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User click save gambar faskes awal");
    }

    @When("User upload foto faskes tujuan dengan format PNG")
    public void user_upload_foto_faskes_tujuan_dengan_format_png() {
        salespage.uploadFaskesTujuanFormat(salespage.filePNG);
        extentTest.log(LogStatus.PASS, "User upload foto faskes tujuan dengan format PNG");
    }

    @When("User click save gambar faskes tujuan")
    public void user_click_save_gambar_faskes_tujuan() {
        Hooks.delay(3);
        salespage.btnSaveFile();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User click save gambar faskes tujuan");
    }

    @When("User upload foto TTD digital format PNG")
    public void user_upload_foto_ttd_digital_format_png() {
        salespage.uploadTtdDigitalFormat(salespage.filePNG);
        extentTest.log(LogStatus.PASS, "User upload foto TTD digital format PNG");
    }

    @When("User click save gambar TTD digital")
    public void user_click_save_gambar_ttd_digital() {
        Hooks.delay(3);
        salespage.btnSaveFile();
        extentTest.log(LogStatus.PASS, "User click save gambar TTD digital");
        Hooks.delay(3);
    }

    @Then("Menampilkan alert data berhasil di upload")
    public void menampilkan_alert__berhasil_di_upload() {
        String text = salespage.txtAlertUpload();
        Assert.assertTrue(text.contains("Data Berhasil diupload!"));
        extentTest.log(LogStatus.PASS, "Menampilkan alert data berhasil di upload");
        salespage.clickAlert();
    }

    // Scenario: Upload dokumen invalid : memasukan gambar format JFIF
    @When("User upload foto faskes awal dengan format JFIF")
    public void user_upload_foto_faskes_awal_dengan_format_jfif() {
        salespage.setBtnUploadCancel();
        Hooks.delay(3);
        salespage.uploadFaskesAwalFormat(salespage.fileJFIF);
        extentTest.log(LogStatus.PASS, "User upload foto faskes awal dengan format JFIF");
    }

    @When("User upload foto faskes tujuan dengan format JFIF")
    public void user_upload_foto_faskes_tujuan_dengan_format_jfif() {
        salespage.setBtnUploadCancel();
        Hooks.delay(3);
        salespage.uploadFaskesTujuanFormat(salespage.fileJFIF);
        extentTest.log(LogStatus.PASS, "User upload foto faskes awal dengan format JFIF");
    }

    @When("User upload foto TTD digital dengan format JFIF")
    public void user_upload_foto_ttd_digital_dengan_format_jfif() {
        salespage.setBtnUploadCancel();
        Hooks.delay(3);
        salespage.uploadTtdDigitalFormat(salespage.fileJFIF);
        extentTest.log(LogStatus.PASS, "User upload foto faskes awal dengan format JFIF");
    }


    @Then("Menampilkan alert upload error")
    public void menampilkan_alert_upload_error() {
        Hooks.delay(3);
        System.out.println(salespage.msgUploadLarger());
        Assert.assertEquals(salespage.msgUploadLarger(), "Upload error: The filetype you are attempting to upload is not allowed.");
        extentTest.log(LogStatus.PASS, "Menampilkan alert upload error");
    }

    // Scenario: Upload dokumen invalid : memasukan gambar format SVG
    @When("User upload foto faskes awal dengan format SVG")
    public void user_upload_foto_faskes_awal_dengan_format_svg() {
        salespage.setBtnUploadCancel();
        Hooks.delay(3);
        salespage.uploadFaskesAwalFormat(salespage.fileSVG);
        extentTest.log(LogStatus.PASS, "User upload foto faskes awal dengan format SVG");
    }

    @When("User upload foto faskes tujuan dengan format SVG")
    public void user_upload_foto_faskes_tujuan_dengan_format_svg() {
        salespage.setBtnUploadCancel();
        Hooks.delay(3);
        salespage.uploadFaskesTujuanFormat(salespage.fileSVG);
        extentTest.log(LogStatus.PASS, "User upload foto faskes tujuan dengan format SVG");
    }

    @When("User upload foto TTD digital dengan  format SVG")
    public void user_upload_foto_ttd_digital_dengan_format_svg() {
        salespage.setBtnUploadCancel();
        Hooks.delay(3);
        salespage.uploadTtdDigitalFormat(salespage.fileSVG);
        extentTest.log(LogStatus.PASS, "User upload foto TTD digital dengan  format SVG");
    }

    // Scenario: Upload dokumen invalid : memasukan gambar format SVG
    @When("User upload foto faskes awal dengan format WEBP")
    public void user_upload_foto_faskes_awal_dengan_format_webp() {
        salespage.setBtnUploadCancel();
        Hooks.delay(3);
        salespage.uploadFaskesAwalFormat(salespage.fileWEBP);
        extentTest.log(LogStatus.PASS, "User upload foto faskes awal dengan format SVG");
    }


    @When("User upload foto faskes tujuan dengan format WEBP")
    public void user_upload_foto_faskes_tujuan_dengan_format_webp() {
        salespage.setBtnUploadCancel();
        Hooks.delay(3);
        salespage.uploadFaskesTujuanFormat(salespage.fileWEBP);
        extentTest.log(LogStatus.PASS, "User upload foto faskes tujuan dengan format SVG");
    }

    @When("User upload foto TTD digital dengan format WEBP")
    public void user_upload_foto_ttd_digital_dengan_format_webp() {
        salespage.setBtnUploadCancel();
        Hooks.delay(3);
        salespage.uploadTtdDigitalFormat(salespage.fileWEBP);
        extentTest.log(LogStatus.PASS, "User upload foto TTD digital dengan  format SVG");
    }

    // Scenario: Upload dokumen invalid : memasukan gambar format RAW
    @When("User upload foto faskes awal dengan format RAW")
    public void user_upload_foto_faskes_awal_dengan_format_raw() {
        salespage.setBtnUploadCancel();
        Hooks.delay(3);
        salespage.uploadFaskesAwalFormat(salespage.fileRAW);
        extentTest.log(LogStatus.PASS, "User upload foto faskes awal dengan format SVG");
    }

    @When("User upload foto faskes tujuan dengan format RAW")
    public void user_upload_foto_faskes_tujuan_dengan_format_raw() {
        salespage.setBtnUploadCancel();
        Hooks.delay(3);
        salespage.uploadFaskesTujuanFormat(salespage.fileRAW);
        extentTest.log(LogStatus.PASS, "User upload foto faskes tujuan dengan format SVG");
    }

    @When("User upload foto TTD digital dengan format RAW")
    public void user_upload_foto_ttd_digital_dengan_format_raw() {
        salespage.setBtnUploadCancel();
        Hooks.delay(3);
        salespage.uploadTtdDigitalFormat(salespage.fileRAW);
        extentTest.log(LogStatus.PASS, "User upload foto TTD digital dengan  format SVG");
    }

}
