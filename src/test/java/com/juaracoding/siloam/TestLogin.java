package com.juaracoding.siloam;

import com.juaracoding.siloam.pages.LoginPage;
import com.juaracoding.siloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    public static WebDriver driver;
    public static LoginPage loginpage = new LoginPage();

    public static ExtentTest extentTest;
    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test Login Admin
    //Positive Test Login Admin
    @Given("Admin membuka browser dan url")
    public void admin_membuka_browser_dan_url(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"Admin membuka browser dan url");
    }
    @When("Admin input username yang terdaftar")
    public void admin_input_username_yang_terdaftar(){
        loginpage.validUsername("admindika");
        extentTest.log(LogStatus.PASS,"Admin input username yang terdaftar");
    }

    @And("Admin logout dari web")
    public void admin_logout_dari_web(){
        loginpage.logout();
        extentTest.log(LogStatus.PASS,"Admin logout dari web");
    }
    @And("Admin menekan button logout")
    public void admin_menekan_button_logout(){
        loginpage.logout();
        extentTest.log(LogStatus.PASS,"Admin menekan button logout");
    }
    @And("Admin input password yang terdaftar")
    public void admin_input_password_yang_terdaftar(){
        loginpage.validPassword("d1k4@passw0rd");
        extentTest.log(LogStatus.PASS,"Admin input password yang terdaftar");
    }
    @And("Admin menekan button login")
    public void admin_menekan_button_login(){
        Hooks.delay(1);
        loginpage.btnLogin();
        extentTest.log(LogStatus.PASS,"Admin menekan button login");
    }
    @Then("Admin diarahkan ke halaman home")
    public void admin_diarahkan_ke_halaman_home(){
        Hooks.delay(1);
        Assert.assertEquals(loginpage.getTxtHome(),"Home");
        extentTest.log(LogStatus.PASS,"Admin diarahkan ke halaman home");
    }
    @Then("Admin diarahkan ke halaman url")
    public void admin_diarahkan_ke_halaman_url(){
        Hooks.delay(1);
        String txtDikaSiloam = loginpage.getTxtDikaSiloam();
        Assert.assertTrue(txtDikaSiloam.contains("DIKA"));
        extentTest.log(LogStatus.PASS,"Admin diarahkan ke halaman url");
    }
    //Test Negative
    @When("Admin input username yang invalid")
    public void admin_input_username_yang_invalid(){
        loginpage.invalidUsername("Admindika");
        extentTest.log(LogStatus.PASS,"Admin input username yang invalid");
    }

    @When("Admin input username yang invalid Admin")
    public void admin_input_username_yang_invalid_Admin(){
        loginpage.invalidUsername("Admin");
        extentTest.log(LogStatus.PASS,"Admin input username yang invalid Admin");
    }
    @When("Admin input username null")
    public void admin_input_username_null(){
        loginpage.nullUsername("");
        extentTest.log(LogStatus.PASS,"Admin input username null");
    }
    @When("Admin input username kurang dari 8 atau lebih dari 16 digit")
    public void admin_input_username_kurang_dari_8_atau_lebih_dari_16_digit(){
        loginpage.invalidUsername("admin12");
        extentTest.log(LogStatus.PASS,"Admin input username kurang dari 8 atau lebih dari 16 digit");
    }

    @And("Admin input password yang invalid case sensitive")
    public void admin_input_password_yang_invalid_case_sensitive(){
        loginpage.invalidPassword("D1k4@passw0rd");
        extentTest.log(LogStatus.PASS,"Admin input password yang invalid case sensitive");
    }
    @And("Admin input password yang kurang dari 8 atau lebih dari 16 digit")
    public void admin_input_password_yang_kurang_dari_8_atau_lebih_dari_16_digit(){
        loginpage.invalidPassword("12345");
        extentTest.log(LogStatus.PASS,"Admin input password yang kurang dari 8 atau lebih dari 16 digit");
    }
    @And("Admin input password yang invalid admin123")
    public void admin_input_password_yang_invalid_admin123(){
        loginpage.invalidPassword("admin123");
        extentTest.log(LogStatus.PASS,"Admin input password yang invalid admin123");
    }


    @And("Admin input password yang invalid")
    public void admin_input_password_yang_invalid(){
        loginpage.invalidPassword("admin123");
        extentTest.log(LogStatus.PASS,"Admin input password yang invalid");
    }
    @And("Admin input password null")
    public void admin_input_password_null(){
        loginpage.nullPassword("");
        extentTest.log(LogStatus.PASS,"Admin input password null");
    }

    @Then("Admin mendapatkan message Wrong username or password")
    public void admin_mendapatkan_message_Wrong_username_or_password(){
        Hooks.delay(1);
        String txtWrongUsernameorPassword = loginpage.getTxtWrongUsernameorPassword();
        Assert.assertTrue(txtWrongUsernameorPassword.contains("Wrong username or password!"));
        extentTest.log(LogStatus.PASS,"Admin mendapatkan message Wrong username or password");
    }
    @Then("Admin mendapatkan message Please fill the fields di username")
    public void admin_mendapatkan_message_Please_fill_the_fields_di_username(){
        Assert.assertEquals(loginpage.getTxtUsername(),"true");
        extentTest.log(LogStatus.PASS,"Admin mendapatkan message Please fill the fields di username");
    }
    @Then("Admin mendapatkan message Please fill the fields di password")
    public void admin_mendapatkan_message_Please_fill_the_fields_di_password(){
        Assert.assertEquals(loginpage.getTxtPassword(),"true");
        extentTest.log(LogStatus.PASS,"Admin mendapatkan message Please fill the fields di password");
    }



   //Test Login Sales
   @When("User input username yang terdaftar")
   public void user_input_username_yang_terdaftar(){
        loginpage.validUsername("D6200927");
        extentTest.log(LogStatus.PASS,"User input username yang terdaftar");
   }
   @When("User input username yang invalid case sensitive")
   public void User_input_username_yang_invalid_case_sensitive(){
        loginpage.invalidUsername("d6200927");
        extentTest.log(LogStatus.PASS,"User input username yang invalid case sensitive");
   }
   @When("User input username null")
   public void user_input_username_null(){
        loginpage.nullUsername("");
        extentTest.log(LogStatus.PASS,"User input username null");
   }
   @When("User input username yang invalid")
   public void user_input_username_yang_invalid(){
        loginpage.invalidUsername("rey");
        extentTest.log(LogStatus.PASS,"User input username yang invalid");
   }
   @When("Admin sudah login dan berada di home")
   public void admin_sudah_login_dan_berada_di_home(){
        loginpage.loginAdmin("admindika","d1k4@passw0rd");
        extentTest.log(LogStatus.PASS,"Admin sudah login dan berada di home");
   }
   @When("User sudah login dan berada di home")
   public void user_sudah_login_dan_berada_di_home(){
        loginpage.loginSales("D6200927","1997-10-23");
        extentTest.log(LogStatus.PASS,"User sudah login dan berada di home");
   }
   @And("User menekan button logout")
   public void user_menekan_button_logout(){
        loginpage.logout();
        extentTest.log(LogStatus.PASS,"User menekan button logout");
   }


   @And("User input password yang terdaftar")
   public void user_input_password_yang_terdaftar(){
        loginpage.validPassword("1997-10-23");
        extentTest.log(LogStatus.PASS,"User input password yang terdaftar");
   }
   @And("User menekan button login")
   public void user_menekan_button_login(){
        loginpage.btnLogin();
        extentTest.log(LogStatus.PASS,"User menekan button login");
   }
   @And("User logout dari web")
   public void user_logout_dari_web(){
        loginpage.logout();
        extentTest.log(LogStatus.PASS,"User logout dari web");
   }

   @And("User input password yang invalid case sensitive")
   public void user_input_password_yang_invalid_case_sensitive(){
        loginpage.invalidPassword("19971023");
        extentTest.log(LogStatus.PASS,"User input password yang invalid case sensitive");
   }
   @And("User input password null")
   public void user_input_password_null(){
        loginpage.nullPassword("");
        extentTest.log(LogStatus.PASS,"User input password null");
   }
   @And("User input password yang invalid")
   public void user_input_password_yang_invalid(){
        loginpage.invalidPassword("admin12");
        extentTest.log(LogStatus.PASS,"User input password yang invalid");
   }
    @Then("User diarahkan ke halaman url")
    public void user_diarahkan_ke_halaman_url(){
        Hooks.delay(1);
        String txtDikaSiloam = loginpage.getTxtDikaSiloam();
        Assert.assertTrue(txtDikaSiloam.contains("DIKA"));
        extentTest.log(LogStatus.PASS,"User diarahkan ke halaman url");
    }
    @Then("User mendapatkan message Please fill the fields di username")
    public void user_mendapatkan_message_Please_fill_the_fields_di_username(){
        Assert.assertEquals(loginpage.getTxtUsername(),"true");
        extentTest.log(LogStatus.PASS,"User mendapatkan message Please fill the fields di username");
    }
    @Then("User mendapatkan message Please fill the fields di password")
    public void user_mendapatkan_message_Please_fill_the_fields_di_password(){
        Assert.assertEquals(loginpage.getTxtPassword(),"true");
        extentTest.log(LogStatus.PASS,"User mendapatkan message Please fill the fields di password");
    }
    @Then("User diarahkan ke halaman home")
    public void user_diarahkan_ke_halaman_home(){
        Hooks.delay(1);
        Assert.assertEquals(loginpage.getTxtHome(),"Home");
        extentTest.log(LogStatus.PASS,"User diarahkan ke halaman home");
    }
    @Then("User mendapatkan message Wrong username or password")
    public void user_mendapatkan_message_Wrong_username_or_password(){
        Hooks.delay(1);
        String txtWrongUsernameorPassword = loginpage.getTxtWrongUsernameorPassword();
        Assert.assertTrue(txtWrongUsernameorPassword.contains("Wrong"));
        extentTest.log(LogStatus.PASS,"User mendapatkan message Wrong username or password");
    }
}
