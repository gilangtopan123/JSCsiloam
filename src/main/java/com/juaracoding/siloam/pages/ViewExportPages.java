package com.juaracoding.siloam.pages;

import com.juaracoding.siloam.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ViewExportPages {
    private WebDriver driver;

    public ViewExportPages() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[normalize-space()='View & Export']")
    WebElement viewExportClick;

    @FindBy(xpath = "//input[@id='datepicker']")
    WebElement startDate;
    @FindBy(xpath = "//input[@id='datepicker2']")
    WebElement endDate;

    @FindBy(xpath = "//button[normalize-space()='Filter']")
    WebElement filterBtn;
    @FindBy(xpath = "//i[@class='fa fa-redo-alt']")
    WebElement refreshBtn;

    @FindBy(xpath = "//td[normalize-space()='2023-03-21 09:04:49']")
    WebElement txtDateFilter;

    @FindBy(xpath = "//td[normalize-space()='1']")
    WebElement txtNoData;
    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[7]/a")
    WebElement faskesAwal;
    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[8]/a")
    WebElement faskesTujuan;
    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[9]/a")
    WebElement pdfAgreement;


    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[2]/a")
    WebElement btnView;
    @FindBy(xpath = "//h4[@class='panel-title']")
    WebElement txtViewData;

    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr")
    List<WebElement> tableBody;


    public int totalDataTable() {
        return tableBody.size();
    }


    public void filterDataNull() {
        startDate.sendKeys("2023-03-25");
        startDate.sendKeys(Keys.ENTER);
        endDate.sendKeys("2023-03-26");
        endDate.sendKeys(Keys.ENTER);
    }


    // Export Data
    @FindBy(xpath = "// button[normalize-space()='Export']")
    WebElement exportBtn;
    @FindBy(xpath = "//div[@role='alert']")
    WebElement txtAlert;

    public void setExportBtn() {
        exportBtn.click();
    }

    public String setTxtAlert() {
        return txtAlert.getText();
    }

    // Download Data
    @FindBy(xpath = "//button[normalize-space()='Download']")
    WebElement downloadBtn;

    public void setDownloadBtn() {
        downloadBtn.click();
    }

    // View Data Page
    @FindBy(xpath = "//a[@id='preview']")
    WebElement previewBtn;

    public void setPreviewBtn() {
        previewBtn.click();
    }

    public void setViewExportClick() {
        viewExportClick.click();
    }

    public void setBtnView() {
        btnView.click();
    }

    public String txtDateFilter() {
        return txtDateFilter.getText();
    }


    public void setStartDate(String dateStart) {
        startDate.sendKeys(dateStart);
        startDate.sendKeys(Keys.ENTER);
    }

    public void setEndDate(String dateEnd) {
        endDate.sendKeys(dateEnd);
        endDate.sendKeys(Keys.ENTER);
    }

    public void setFilterBtn() {
        filterBtn.click();
    }

    public void setRefreshBtn() {
        refreshBtn.click();
    }


    public void filterData() {

        startDate.sendKeys("2023-03-21");
        startDate.sendKeys(Keys.ENTER);
        endDate.sendKeys("2023-03-22");
        endDate.sendKeys(Keys.ENTER);
        delay(2);
        filterBtn.click();
    }

    @FindBy(xpath = "//input[@id='datepicker']")
    WebElement txtPleaseFillThisFieldsSd;

    @FindBy(xpath = "//input[@id='datepicker2']")
    WebElement txtPleaseFillThisFieldsEd;

    public String txtPopupFillthisFieldStartDate() {
        return txtPleaseFillThisFieldsSd.getAttribute("validationMessage");
    }

    public String txtPopupFillthisFieldEndDate() {
        return txtPleaseFillThisFieldsEd.getAttribute("validationMessage");
    }

    public String txtViewData() {
        return txtViewData.getText();
    }

    public void clickPriview() {
        txtViewData.click();
    }

    public void setFaskesAwal() {
        faskesAwal.click();
    }

    public void setFaskesTujuan() {

        faskesTujuan.click();
    }

    public void setPdfAgreement() {
        pdfAgreement.click();
    }

    public void newTab() {
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        //switch to open tab
        driver.switchTo().window(tab.get(1));
        System.out.println("New tab title: " + driver.getTitle());
        //switch to first tab
        driver.switchTo().window(tab.get(0));
        System.out.println("First tab title: " + driver.getTitle());
        driver.quit();
    }



    static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
