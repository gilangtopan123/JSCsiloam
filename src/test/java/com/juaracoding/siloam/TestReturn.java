package com.juaracoding.siloam;

import com.juaracoding.siloam.pages.LoginPage;
import com.juaracoding.siloam.pages.ReturnPage;
import com.juaracoding.siloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestReturn {
    public static WebDriver driver;
    public static LoginPage loginpage = new LoginPage();
    public static ReturnPage returnPage = new ReturnPage();

    public static ExtentTest extentTest;
    public TestReturn(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("user sudah login")
    public void user_sudah_login(){
        driver.get(Constants.URL);
        loginpage.loginSales("D6200927","1997-10-23");
        extentTest.log(LogStatus.PASS,"user sudah login");
    }
    @When("user click menu New")
    public void user_click_menu_New(){
        returnPage.setMenuNew();
        extentTest.log(LogStatus.PASS,"user click menu New");
    }
    @And("user input tanggal start")
    public void user_input_tanggal_start(){
        Hooks.delay(1);
        returnPage.setBtnInputTglStart();
        extentTest.log(LogStatus.PASS,"user input tanggal start");
    }
    @And("user input tanggal end")
    public void user_input_tanggal_end(){
        Hooks.delay(1);
        returnPage.setInputTglEnd();
        extentTest.log(LogStatus.PASS,"user input tanggal end");
    }
    @And("user pilih status pending")
    public void user_pilih_status_pending(){
        returnPage.setSelectStatusPending();
        extentTest.log(LogStatus.PASS,"user pilih status pending");
    }
    @And("user click tombol filter")
    public void user_click_tombol_filter(){
        returnPage.setBtnFilter();
        extentTest.log(LogStatus.PASS,"user click tombol filter");
    }
    @Then("user mendapatkan data yang input")
    public void user_mendapatkan_data_yang_input(){
        Hooks.delay(1);
        Assert.assertEquals(returnPage.getTxtDataBarisAtas(),"2");
        extentTest.log(LogStatus.PASS,"user mendapatkan data yang input");
    }
}
