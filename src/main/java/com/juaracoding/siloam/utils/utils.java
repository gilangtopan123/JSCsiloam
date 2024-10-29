package com.juaracoding.siloam.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class utils {
    public static int testCount = 0;

    public static final String downloadLocation = "C:\\juaracoding\\sqabatch8\\JCSiloamm\\downloads";
    public static final String exportLocation = "C:\\juaracoding\\sqabatch8\\JCSiloamm\\downloads";


    public static String getScreenshot(WebDriver driver, String screenShotName) throws IOException {
        String dataName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/FailedTestScreenshot/"
                + screenShotName + "_" + dataName + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;
    }


    public static boolean isFileDownloaded() {
        File folder = new File(downloadLocation);
        File[] listOfFiles = folder.listFiles();
        boolean isFileDownloaded = false;
        for (File lisOftFile : listOfFiles) {
            if (lisOftFile.isFile()) {
                String fileName = lisOftFile.getName();
                System.out.println("File " + fileName);
                if (fileName.matches("20230405.zip")) {
                    isFileDownloaded = true;
                }
            }

        }
        return isFileDownloaded;
    }

    public static boolean isFileExport() {

        File folder = new File(exportLocation);
        File[] listOfFiles = folder.listFiles();
        boolean isFileExport = false;
        for (File lisOftFile : listOfFiles) {
            if (lisOftFile.isFile()) {
                String fileName = lisOftFile.getName();
                System.out.println("File " + fileName);
                if (fileName.matches("data_export.xls")) {
                    isFileExport = true;
                }
            }

        }
        return isFileExport;
    }


}



