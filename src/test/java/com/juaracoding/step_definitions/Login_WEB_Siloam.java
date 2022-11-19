package com.juaracoding.step_definitions;

import com.juaracoding.cucumber.pages.LoginSiloam;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Login_WEB_Siloam {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginSiloam loginSiloam = new LoginSiloam();

    public Login_WEB_Siloam() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Test Case One
    @When("user open page siloam")
    public void user_go_to_Web_Siloam() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "user open page siloam");

    }

    @And("user input username password sales valid")
    public void user_input_username_password_sales_valid() {
        loginSiloam.login("D6200927", "1997-10-23");
        extentTest.log(LogStatus.PASS, "user input username sales valid");
    }


    @And("user click button login")
    public void user_click_button_login() {
        loginSiloam.setBtnLogin();
        extentTest.log(LogStatus.PASS, "user click button login");
    }

    @Then("user open home page")
    public void user_open_home_page() {
        loginSiloam.getTxtHome();
        extentTest.log(LogStatus.PASS, "user open home page");
    }
}

