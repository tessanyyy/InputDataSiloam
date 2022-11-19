package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class InputDataPage {

    private WebDriver driver;
    private WebElement sendKeyStatus;

    public InputDataPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[3]/a/span")
    WebElement menuInput;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement getTxtFormInput;


    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement inputNama;


    @FindBy(xpath = "//*[@id=\"no_bpjs\"]")
    WebElement inputNomorBPJS;



    @FindBy(xpath = "//*[@id=\"no_ktp\"]")
    WebElement inputNomotKTP;


    @FindBy(xpath = "//*[@id=\"address\"]")
    WebElement inputAlamat;

    @FindBy(xpath = "//*[@id=\"select2-ktp_city-container\"]")
    WebElement klikKotaKTP;
    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement inputKotaKTP;


    @FindBy(xpath = "//*[@id=\"origin_faskes\"]")
    WebElement inputFaskesAwal;


    @FindBy(xpath = "//*[@id=\"select2-destination_faskes-container\"]")
    WebElement klikFaskesTujuan;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement inputFaskesTujuan;

    @FindBy(xpath = "//*[@id=\"default-tab-1\"]/form/div[9]/div/button")
    WebElement btnSimpanData;

    @FindBy(xpath = " //*[@id=\"content\"]/div[2]/div/ul/li[2]/a/b/span[2]")
    WebElement getTxtUploadData;



    public void klikMenuInput() {
        menuInput.click();
    }

    public String getTxtRFormInput() {
        return getTxtFormInput.getAttribute("Form Input");
    }

    public void setInputNama(String nama){
        this.inputNama.sendKeys(nama);
    }

    public void setInputNomorBPJS(String bpjs){
        this.inputNomorBPJS.sendKeys(bpjs);
    }

    public void setInputNomotKTP(String nomotKTP){
        this.inputNomotKTP.sendKeys(nomotKTP);
    }

    public void setInputAlamat(String alamat){
        this.inputAlamat.sendKeys(alamat);

    }

    public void setInputKotaKTP(String kotaKTP){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 150)");
        klikKotaKTP.click();
        this.inputKotaKTP.sendKeys(kotaKTP,Keys.RETURN);
    }

    public void setInputFaskesAwal(String faskesAwal){
        this.inputFaskesAwal.sendKeys(faskesAwal);
    }

    public void setInputFaskesTujuan(String faskesTujuan){
        klikFaskesTujuan.click();
        this.inputFaskesTujuan.sendKeys(faskesTujuan, Keys.RETURN);
    }

    public void setBtnSimpanData(){
        this.btnSimpanData.sendKeys(Keys.RETURN);
    }

    public void getUploadData(){
        getTxtUploadData.click();
    }
}