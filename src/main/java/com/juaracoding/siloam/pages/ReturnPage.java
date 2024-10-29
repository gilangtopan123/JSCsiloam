package com.juaracoding.siloam.pages;

import com.juaracoding.siloam.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReturnPage {
    private WebDriver driver;

    public ReturnPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Form Return buka menu new
    @FindBy(xpath = "//span[normalize-space()='New']")
    WebElement menuNew;

    @FindBy(xpath = "//input[@id='tgl']")
    WebElement btnInputTglStart;

    @FindBy(xpath = "//input[@id='tgl2']")
    WebElement btnInputTglEnd;

    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='prev'][normalize-space()='«']")
    WebElement prevDate;

    @FindBy(xpath = "//td[@class='day'][normalize-space()='1']")
    WebElement day1;
    @FindBy(xpath = "//td[normalize-space()='31']")
    WebElement day31;

    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtHeader;

    @FindBy(xpath = "//select[@id='status']")
    WebElement selectStatus;
    @FindBy(xpath = "//button[@id='btn-filter']")
    WebElement btnFilter;
    @FindBy(xpath = "//button[@id='btn-reset']")
    WebElement btnReset;
    @FindBy(xpath = "//input[@type='search']")
    WebElement inputSearch;
    @FindBy(xpath = "//span[@id='btnSearch']")
    WebElement btnSearch;
    @FindBy(xpath = "//span[@id='btnRefresh']")
    WebElement btnRefresh;
    @FindBy(xpath = "//select[@name='table_length']")
    WebElement selectTableEntries;
    @FindBy(xpath = "//tbody/tr[1]/td[7]/center[1]/a[1]")
    WebElement viewDataAtas;
    @FindBy(xpath = "//a[normalize-space()='Previous']")
    WebElement btnPrevious;
    @FindBy(xpath = "//a[normalize-space()='Next']")
    WebElement btnNext;
    @FindBy(xpath = "//div[@id='table_info']")
    WebElement txtShowTablesEntries;
    @FindBy(xpath = "//tbody/tr[2]/td[1]")
    WebElement txtDataBarisAtas;
    public void setMenuNew(){
        menuNew.click();
    }
    public String getTxtHeader(){
        return txtHeader.getText();
    }
    public void setBtnFilter(){
        btnFilter.click();
    }
    public void setBtnReset(){
        btnReset.click();
    }
    public void setInputSearch(String search){
        inputSearch.sendKeys(search);
    }
    public void setBtnSearch(){
        btnSearch.click();
    }
    public void setBtnRefresh(){
        btnRefresh.click();
    }

    //input tanggal
    public void setBtnInputTglStart(){
        btnInputTglStart.click();
        prevDate.click();
        delay(1);
        day1.click();
    }

    public void setInputTglEnd(){
        btnInputTglEnd.click();
        prevDate.click();
        delay(1);
        day31.click();
    }

    //pilih status
    public void setSelectStatusPending(){
        Select pilihStatus = new Select(selectStatus);
        pilihStatus.selectByValue("pending");
    }
    public void setSelectStatusComplete(){
        Select pilihStatus = new Select(selectStatus);
        pilihStatus.selectByValue("complete");
    }
    public void setSelectTableEntries10(){
        Select pilih10Entries = new Select(selectTableEntries);
        pilih10Entries.selectByValue("10");
    }
    public void setSelectTableEntries25(){
        Select pilih10Entries = new Select(selectTableEntries);
        pilih10Entries.selectByValue("25");
    }
    public void setSelectTableEntries50(){
        Select pilih10Entries = new Select(selectTableEntries);
        pilih10Entries.selectByValue("50");
    }
    public void setSelectTableEntries100(){
        Select pilih10Entries = new Select(selectTableEntries);
        pilih10Entries.selectByValue("100");
    }
    public void setViewDataAtas(){
        viewDataAtas.click();
    }
    public String getTxtDataBarisAtas(){
        return txtDataBarisAtas.getText();
    }
    public String getTxtShowTableEntries(){
        return txtShowTablesEntries.getText();
    }

    //bagian bawah
    public void setBtnPrevious(){
        btnPrevious.click();
    }
    public void setBtnNext(){
        btnNext.click();
    }
    static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
