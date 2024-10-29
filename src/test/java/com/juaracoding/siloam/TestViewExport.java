package com.juaracoding.siloam;

import com.juaracoding.siloam.pages.ViewExportPages;
import com.juaracoding.siloam.utils.utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class TestViewExport {

    public static WebDriver driver;
    public static ViewExportPages viewExportPages = new ViewExportPages();

    public static ExtentTest extentTest;

    public TestViewExport() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Filter data valid
    @When("Admin click menu view export")
    public void admin_click_menu_view_export() {
        Hooks.delay(1);
        viewExportPages.setViewExportClick();
        extentTest.log(LogStatus.PASS, "Admin click menu view export");
    }

    @And("Admin memilih start date")
    public void admin_memilih_start_date() {
        Hooks.delay(3);
        viewExportPages.setStartDate("2023-03-21");
        extentTest.log(LogStatus.PASS, "Admin memilih start date");

    }

    @And("Admin memilih end date")
    public void admin_memilih_end_date() {
        Hooks.delay(3);
        viewExportPages.setEndDate("2023-03-22");
        extentTest.log(LogStatus.PASS, "Admin memilih end date");
    }

    @When("Admin click filter")
    public void admin_click_filter() {
        viewExportPages.setFilterBtn();
        extentTest.log(LogStatus.PASS, "Admin click filter");
    }

    @Then("Menampilkan data user yang telah difilter")
    public void menampilkan_data_user_yang_telah_difilter() {
        Assert.assertEquals(viewExportPages.txtDateFilter(), "2023-03-21 09:04:49");
        extentTest.log(LogStatus.PASS, "Menampilkan data user yang telah difilter");
    }


    // Scenario: Filter data invalid : pilih date DESC-ASC
    @When("Admin memilih start date desc")
    public void admin_memilih_start_date_desc() {
        viewExportPages.setStartDate("2023-03-31");
        extentTest.log(LogStatus.PASS, "Admin memilih start date desc");
    }

    @When("Admin memilih end date asc")
    public void admin_memilih_end_date_asc() {
        viewExportPages.setEndDate("2023-03-01");
        extentTest.log(LogStatus.PASS, "Admin memilih end date asc");
    }

    @Then("Tidak  berhasil menampilkan data user berdasarkan date yang dipilih")
    public void tidak_berhasil_menampilkan_data_user_berdasarkan_date_yang_dipilih() {
        Assert.assertEquals(viewExportPages.totalDataTable(), 0);
        extentTest.log(LogStatus.PASS, "Tidak  berhasil menampilkan data user berdasarkan date yang dipilih");
    }

    // Refresh data user
    @When("Admin sudah filter data user")
    public void admin_sudah_filter_data_user() {
        Hooks.delay(2);
        viewExportPages.filterData();
        extentTest.log(LogStatus.PASS, "Admin sudah filter data user");
    }

    @And("Admin click button refresh")
    public void admin_click_button_refresh() {
        Hooks.delay(3);
        viewExportPages.setRefreshBtn();
        extentTest.log(LogStatus.PASS, "Admin click button refresh");
    }

    @Then("Semua field filter ke reset kembali ke awal sebelum difilter")
    public void semua_field_filter_ke_reset_kembali_ke_awal_sebelum_difilter() {
        System.out.println(viewExportPages.totalDataTable());
        Assert.assertEquals(viewExportPages.totalDataTable(), 0);
        extentTest.log(LogStatus.PASS, "Semua field filter ke reset kembali ke awal sebelum difilter");
    }

    // Filter data invalid: tanpa start date
    @When("Admin tidak memilih start date")
    public void admin_tidak_memilih_start_date() {
        // null
        extentTest.log(LogStatus.PASS, "Admin tidak memilih start date");
    }

    @Then("Menampilkan alert please fill out this field start date")
    public void menampilkan_alert_please_fill_out_this_field_start_date() {
        System.out.println(viewExportPages.txtPopupFillthisFieldStartDate());
        Assert.assertEquals(viewExportPages.txtPopupFillthisFieldStartDate(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Menampilkan alert please fill out this field start date");
    }

    // Filter data invalid: tanpa end date
    @When("Admin tidak memilih end date")
    public void admin_tidak_memilih_end_date() {
        // null
        extentTest.log(LogStatus.PASS, "Admin tidak memilih end date");
    }

    @Then("Menampilkan alert please fill out this field end date")
    public void menampilkan_alert_please_fill_out_this_field_end_date() {
        System.out.println(viewExportPages.txtPopupFillthisFieldEndDate());
        Assert.assertEquals(viewExportPages.txtPopupFillthisFieldEndDate(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Menampilkan alert please fill out this field end date");

    }


    // Menampilkan foto sales Faskes Awal
    @And("Admin click tag link pada tabel foto faskes awal")
    public void admin_click_tag_link_pada_tabel_foto_faskes_awal() {
        viewExportPages.setFaskesAwal();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "Admin click tag link pada tabel foto faskes awal");
    }

    @Then("Menampilkan foto faskes awal di new tab browser")
    public void menampilkan_foto_faskes_awal_di_new_tab_browser() {
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Before"), "Link error");
        System.out.println("New tab title: " + driver.getTitle());
        Hooks.delay(3);
        driver.close();
        driver.switchTo().window(tab.get(0));
        extentTest.log(LogStatus.PASS, "Menampilkan foto faskes awal di new tab browser");
    }

    // Menampilkan foto sales Faskes Tujuan
    @And("Admin click tag link pada tabel foto faskes tujuan")
    public void admin_click_tag_link_pada_tabel_foto_faskes_tujuan() {
        viewExportPages.setFaskesTujuan();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "Admin click tag link pada tabel foto faskes tujuan");

    }

    @Then("Menampilkan foto faskes tujuan di new tab browser")
    public void menampilkan_foto_faskes_tujuan_di_new_tab_browser() {
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        String title = driver.getTitle();
        System.out.println("title " + title);
        Assert.assertTrue(title.contains("After"), "Link error");
        System.out.println("New tab title: " + driver.getTitle());
        Hooks.delay(3);
        driver.close();
        driver.switchTo().window(tab.get(0));
        extentTest.log(LogStatus.PASS, "Menampilkan foto faskes tujuan di new tab browser");
    }

    // Menampilkan PDF agreement sales
    @When("Admin click tag link pdf agreement")
    public void admin_click_tag_link_pdf_agreement() {
        Hooks.delay(2);
        viewExportPages.setPdfAgreement();
        extentTest.log(LogStatus.PASS, "Admin click tag link pdf agreement");
    }

    @Then("Menampilkan file format pdf di new tab browser")
    public void menampilkan_file_format_pdf_di_new_tab_browser() {
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        //validate
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("agreement"), "Link error");
        System.out.println(url);
        Hooks.delay(3);
        driver.close();
        driver.switchTo().window(tab.get(0));;
        // Continue with original browser (first window)
        extentTest.log(LogStatus.PASS, "Menampilkan file format pdf di new tab browser");
    }

    // Menampilkan view data user yang telah di filter
    @And("Admin click button view pada tabel user")
    public void admin_click_button_view_pada_tabel_user() {
        Hooks.delay(2);
        viewExportPages.setBtnView();
        extentTest.log(LogStatus.PASS, "Admin click button view pada tabel user");
    }

    @Then("Menampilkan page view data user di new tab browser")
    public void menampilkan_page_view_data_user_di_new_tab_browser() {
        String winHandleBefore = driver.getWindowHandle();
        // Perform the click operation that opens new window
        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        // Perform the actions on new window
        viewExportPages.clickPriview();
        System.out.println("Text" + viewExportPages.txtViewData());
        Assert.assertEquals(viewExportPages.txtViewData(), "View Data");
        // Close the new window, if that window no more required
        Hooks.delay(5);
        driver.close();
        // Switch back to original browser (first window)
        driver.switchTo().window(winHandleBefore);
        // Continue with original browser (first window)

        extentTest.log(LogStatus.PASS, "Menampilkan page view data user di new tab browser");

    }


    // Scenario: Mengexport Data user valid
    @When("Admin click button Export")
    public void admin_click_button_export() {
        viewExportPages.setExportBtn();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "Admin click button Export");
    }

    @Then("Admin mendownload file export berformat xls")
    public void admin_mendownload_file_export_berformat_xls() {
        Assert.assertTrue(utils.isFileExport(), "File Export not found");
        extentTest.log(LogStatus.PASS, "Admin mendownload file export berformat xls");
    }

    // Scenario: Mengexport data invalid : tanpa filter data
    @Then("Menampilkan alert mohon isi start_date dan end_date terlebih dahulu!!!")
    public void menampilkan_alert_mohon_isi_start_date_dan_end_date_terlebih_dahulu() {
        Assert.assertEquals(viewExportPages.setTxtAlert(), "Danger! Mohon isi start_date dan end_date terlebih dahulu!!!\n" + "×");
        extentTest.log(LogStatus.PASS, "Menampilkan alert mohon isi start_date dan end_date terlebih dahulu!!!");

    }

    //Scenario: Mendownload Data user valid
    @When("Admin click button Download")
    public void admin_click_button_download() {
        viewExportPages.setDownloadBtn();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "Admin click button Download");

    }

    @Then("Admin mendownload file download berformat zip")
    public void admin_mendownload_file_download_berformat_zip() {
        Assert.assertTrue(utils.isFileDownloaded());
        extentTest.log(LogStatus.PASS, "Admin mendownload file download berformat zip");
    }

    // Scenario: Mengexport & Mendownload Data user invalid : tidak ada data pada tanggal di filter
    @When("Admin memilih tanggal yang tidak ada data")
    public void admin_memilih_tanggal_yang_tidak_ada_data() {
        viewExportPages.filterDataNull();
        extentTest.log(LogStatus.PASS, "Admin memilih tanggal yang tidak ada data");
    }

    @Then("Menampilkan alert Data tidak ada")
    public void menampilkan_alert_data_tidak_ada() {
        Assert.assertEquals(viewExportPages.setTxtAlert(), "Danger! Data Tidak Ada!!!\n" + "×");
        extentTest.log(LogStatus.PASS, "Menampilkan alert Data tidak ada");
    }

    //View Data (Priview Data)
    @When("Admin click priview button")
    public void admin_click_priview_button() {
        // Perform the click operation that opens new window
        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        // Perform the actions on new window
        viewExportPages.setPreviewBtn();

        // Continue with original browser (first window)
        extentTest.log(LogStatus.PASS, "Admin click priview button");
    }

    @Then("menampilkan file berformat PDF pada new tab browser")
    public void menampilkan_file_berformat_pdf_pada_new_tab_browser() {
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("preview"), "Link error");
        System.out.println(url);
        // Close the new window, if that window no more required
        Hooks.delay(5);
        driver.close();
        // Switch back to original browser (first window)
        driver.switchTo().window(winHandleBefore);
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "menampilkan file berformat PDF pada new tab browser");

    }
}

