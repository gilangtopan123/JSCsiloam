package com.juaracoding.siloam.pages;


import com.juaracoding.siloam.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SalesPages {
    private WebDriver driver;

    public SalesPages() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='name']")
    WebElement fieldsName;
    @FindBy(xpath = "//input[@id='name']")
    WebElement txtName;
    @FindBy(xpath = "//input[@id='no_bpjs']")
    WebElement fieldsBpjs;
    @FindBy(xpath = "//input[@id='no_bpjs']")
    WebElement txtBpjs;
    @FindBy(xpath = "//input[@id='no_ktp']")
    WebElement fieldsKtp;
    @FindBy(xpath = "//input[@id='no_ktp']")
    WebElement txtKtp;
    @FindBy(xpath = "//textarea[@id='address']")
    WebElement fieldsAddress;
    @FindBy(xpath = "//textarea[@id='address']")
    WebElement txtAddress;
    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    WebElement dropdownMenuCity;
    @FindBy(xpath = "//input[@role='textbox']")
    WebElement inputCity;

    @FindBy(xpath = "//*[@id=\"destination_faskes\"]")
    WebElement txtAlertFaskesTujuan;

    @FindBy(xpath = "//input[@role='textbox']")
    WebElement inputFaskes;
    @FindBy(xpath = "//li[@id='select2-ktp_city-result-8183-KOTA JAKARTA PUSAT']")
    WebElement pilihJakPus;
    @FindBy(xpath = "//li[@id='select2-ktp_city-result-mzfg-KOTA JAKARTA SELATAN']")
    WebElement pilihJakSel;
    @FindBy(xpath = "//li[@id='select2-destination_faskes-result-lijv-2||Clinic Kepu Timur||Kota Jakarta Pusat']")
    WebElement pilihFaskesJakpus;
    @FindBy(xpath = "//li[@id='select2-destination_faskes-result-mvp8-3||Clinic Bona Indah||Kota Jakarta Selatan']")
    WebElement pilihFaskesJakSel;
    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    WebElement txtCity;
    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement faskesAwal;
    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement txtFaskesAwal;
    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    WebElement dropdownFaskesTujuan;
    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    WebElement txtFaskesTujuan;
    @FindBy(xpath = "//textarea[@id='reason']")
    WebElement fieldsAlasan;
    @FindBy(xpath = "//textarea[@id='reason']")
    WebElement txtAlasan;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSubmit;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement txtSubmit;
    @FindBy(xpath = "//span[normalize-space()='Input']")
    WebElement menuInput;
    @FindBy(xpath = "//div[@role='alert']")
    WebElement txtSuccessSave;
    @FindBy(xpath = "//div[@id='default-tab-1']")
    WebElement txtWarningMessageInputFields;
    @FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
    WebElement txtFieldAlamatMessage;

    @FindBy(xpath = "//span[normalize-space()='Field Alasan Harus Diisi!']")
    WebElement txtFieldAlasanMessage;

    public void inputData(String nama, String Bpjs, String KTP, String alamat, String faskesAwal, String alasan) {
        menuInput.click();
        delay(3);
        fieldsName.sendKeys(nama);
        fieldsBpjs.sendKeys(Bpjs);
        fieldsKtp.sendKeys(KTP);
        fieldsAddress.sendKeys(alamat);
        inputCity();
        inputFaskesAwal(faskesAwal);
        inputFaskesTujuan();
        inputAlasan(alasan);
        delay(4);
        btnSubmit.click();
    }

    public void inputData1(String nama, String Bpjs, String KTP, String alamat, String faskesAwal, String alasan) {
        menuInput.click();
        delay(3);
        fieldsName.sendKeys(nama);
        fieldsBpjs.sendKeys(Bpjs);
        fieldsKtp.sendKeys(KTP);
        fieldsAddress.sendKeys(alamat);
        inputCity();
        inputFaskesAwal(faskesAwal);
        inputFaskesTujuan();
        inputAlasan(alasan);
    }

    public void inputDataTanpaFaskesTujuan(String nama, String Bpjs, String KTP, String alamat, String faskesAwal, String alasan) {
        menuInput.click();
        delay(3);
        fieldsName.sendKeys(nama);
        fieldsBpjs.sendKeys(Bpjs);
        fieldsKtp.sendKeys(KTP);
        fieldsAddress.sendKeys(alamat);
        inputCity();
        inputFaskesAwal(faskesAwal);
        delay(4);
    }

    public String getTxtFieldAlasanMessage() {
        return txtFieldAlasanMessage.getText();
    }

    public String getTxtFieldAlamatMessage() {
        return txtFieldAlamatMessage.getText();
    }

    public String getTxtNoKTP() {
        return txtKtp.getText();
    }

    public String getTxtNama() {
        return txtName.getText();
    }

    public String txtRequiredName() {
        return fieldsName.getAttribute("validationMessage");
    }

    public String txtRequiredNobpjs() {
        return fieldsBpjs.getAttribute("validationMessage");
    }

    public String txtRequiredFaskesTujuan() {
        return txtAlertFaskesTujuan.getAttribute("validationMessage");
    }

    public String getTxtBpjs() {
        return txtBpjs.getText();
    }

    public String getTxtAddress() {
        return txtAddress.getText();
    }

    public String getTxtCity() {
        return txtCity.getText();
    }

    public String getTxtFaskesAwal() {
        return txtFaskesAwal.getText();
    }

    public String getTxtFaskesTujuan() {
        return txtFaskesTujuan.getText();
    }

    public String getTxtAlasan() {
        return txtAlasan.getText();
    }

    public String getTxtSubmit() {
        return txtSubmit.getText();
    }

    public void inputName(String name) {
        fieldsName.sendKeys(name);
    }

    public void inputBpjs(String nobpjs) {
        fieldsBpjs.sendKeys(nobpjs);
    }

    public void inputKtp(String noktp) {
        fieldsKtp.sendKeys(noktp);
    }

    public void inputCity() {
        dropdownMenuCity.click();
        inputCity.sendKeys("Jakarta Timur");
        inputCity.sendKeys(Keys.ENTER);
    }

    public void inputCityJakSel() {
        dropdownMenuCity.click();
        inputCity.sendKeys("Jakarta");
        pilihJakSel.click();
    }

    public void inputFaskesAwal(String faskesA) {
        faskesAwal.sendKeys(faskesA);
    }

    public void inputFaskesTujuan() {
        dropdownFaskesTujuan.click();
        inputFaskes.sendKeys("Jakarta Utara");
        inputFaskes.sendKeys(Keys.ENTER);
    }

    public String getTxtWarningPleaseInputMessage() {
        return txtWarningMessageInputFields.getText();
    }

    public void inputAlasan(String alasan) {
        fieldsAlasan.sendKeys(alasan);
    }

    public void inputAddress(String address) {
        fieldsAddress.sendKeys(address);
    }

    public void btnSubmit() {
        btnSubmit.click();
    }

    public void menuInput() {
        menuInput.click();
    }

    public String getTxtSuccessSave() {
        return txtSuccessSave.getText();
    }


    // TAB Upload Doc
    public final String fileJPG = "C:\\juaracoding\\sqabatch8\\JCSiloamm\\Sample_Photo\\Sample.jpg";
    public final String fileJPG10mb = "C:\\juaracoding\\sqabatch8\\JCSiloamm\\Sample_Photo\\Sample_10mb.jpg";
    public final String filePNG = "C:\\juaracoding\\sqabatch8\\JCSiloamm\\Sample_Photo\\Sample_PNG.png";
    public final String fileJFIF = "C:\\juaracoding\\sqabatch8\\JCSiloamm\\Sample_Photo\\Sample.JFIF";
    public final String fileSVG = "C:\\juaracoding\\sqabatch8\\JCSiloamm\\Sample_Photo\\Sample.svg";
    public final String fileWEBP = "C:\\juaracoding\\sqabatch8\\JCSiloamm\\Sample_Photo\\Sample.webp";
    public final String fileRAW = "C:\\juaracoding\\sqabatch8\\JCSiloamm\\Sample_Photo\\Sample.raw";
    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
    WebElement fotoFaskesAwalBtn;
    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
    WebElement fotoFaskesTujuanBtn;
    @FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
    WebElement fotoTtdDigial;
    @FindBy(xpath = "//input[@id='file']")
    WebElement chooseFile;
    @FindBy(xpath = "//div[@id='message']")
    WebElement msgErrorUpload;
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement btnUploadCancel;
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement txtAlertUpload;

    @FindBy(xpath = "//button[@id='btnSave']")
    WebElement btnSaveFile;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    WebElement btnAlert;

    @FindBy(xpath = "//strong[normalize-space()='Terima kasih dokumen anda sudah lengkap !']")
    WebElement btnAlertDocumentLengkap;
    @FindBy(xpath = "//*[@id=\"default-tab-2\"]/div[2]/div/div/button")
    WebElement Selanjutnya;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement btnSelanjutnya;

    @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
    WebElement txtTtdDigital;

    @FindBy(xpath = "//span[@class='text-red']")
    WebElement requiredUpl;

    @FindBy(xpath = "//select[@id='ktp_city']")
    WebElement selectKotaKtp;
    @FindBy(xpath = "//select[@id='destination_faskes']")
    WebElement selectFaskesTujuan;
    @FindBy(xpath = "//span[normalize-space()='The Nomor BPJS already exist.']")
    WebElement txtBpjsAlreadyExist;

    public String getTxtBpjsAlreadyExist() {
        return txtBpjsAlreadyExist.getText();
    }

    public void pilihKota() {
        Select selectKota = new Select(selectKotaKtp);
        selectKota.selectByValue("KOTA JAKARTA PUSAT");
    }

    public void pilihFaskesTujuan() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", pilihFaskesJakpus);
        Select selectFaskesDestination = new Select(selectFaskesTujuan);
        selectFaskesDestination.selectByValue("2||Clinic Kepu Timur||Kota Jakarta Pusat");
    }

    public void pilihFaskesTujuanBeda() {
        Select selectFaskesDestinationBeda = new Select(selectFaskesTujuan);
        selectFaskesDestinationBeda.selectByValue("3||Clinic Bona Indah||Kota Jakarta Selatan");
    }

    public boolean buttonIsEnable() {
        return Selanjutnya.isEnabled();
    }

    public String txtTtdDigital() {
        return txtTtdDigital.getText();
    }

    public String msgUploadLarger() {
        return msgErrorUpload.getText();
    }

    public void btnSaveFile() {
        btnSaveFile.click();
    }

    public void setBtnUploadCancel() {
        btnUploadCancel.click();
    }


    public String alertDokumenLengkap() {
        return btnAlertDocumentLengkap.getText();
    }

    public String setBtnSelanjutnyaDisable() {
        return btnSelanjutnya.getAttribute("disabled");
    }

    public void setBtnSelanjutnya() {
        btnSelanjutnya.click();
    }

    public String txtAlertUpload() {
        return txtAlertUpload.getText();
    }

    public void clickAlert() {
        btnAlert.click();
    }

    public void uploadFaskesAwalFormat(String directoryFile) {
        fotoFaskesAwalBtn.click();
        chooseFile.sendKeys(directoryFile);
    }

    public void uploadFaskesTujuanFormat(String directoryFile) {
        fotoFaskesTujuanBtn.click();
        chooseFile.sendKeys(directoryFile);
    }

    public void uploadTtdDigitalFormat(String directoryFile) {
        fotoTtdDigial.click();
        chooseFile.sendKeys(directoryFile);
    }

    public void uploadFaskesAwal(String directoryFile) {
        delay(3);
        fotoFaskesAwalBtn.click();
        chooseFile.sendKeys(directoryFile);
        delay(3);
        btnSaveFile.click();
        btnAlert.click();
    }

    public void uploadFaskesTujuan(String directoryFile) {
        fotoFaskesTujuanBtn.click();
        chooseFile.sendKeys(directoryFile);
        delay(3);
        btnSaveFile.click();
        btnAlert.click();
    }

    public void uploadTtdDigital(String directoryFile) {
        fotoTtdDigial.click();
        chooseFile.sendKeys(directoryFile);
        delay(3);
        btnSaveFile.click();
        btnAlert.click();
    }

    static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
