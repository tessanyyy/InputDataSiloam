package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSiloam {
    private final WebDriver driver;

    public LoginSiloam(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/form/div[1]/input")
    WebElement txtUsernameRequired;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/form/div[2]/input")
    WebElement txtPasswordRequired;


    @FindBy(xpath = "  //*[@id=\"content\"]/h1")
    WebElement txtHome;


    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);

    }

    public void setBtnLogin(){
        btnLogin.click();
    }

    public String getTxtUsernameRequired(){
        return txtUsernameRequired.getAttribute("required");
    }

    public String getTxtPasswordRequired(){
        return txtPasswordRequired.getAttribute("required");
    }


    public String getTxtHome(){
        return txtHome.getAttribute("Home");
    }
}