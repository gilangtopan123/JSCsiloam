package com.juaracoding.siloam;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/01LoginAdmin.feature",
                "src/main/resources/features/02LoginSales.feature",
                "src/main/resources/features/03InputDataSales.feature",
                "src/main/resources/features/04UploadSales.feature",
                "src/main/resources/features/05TTDDigitalSales.feature",
                "src/main/resources/features/06FormReturn.feature",
                "src/main/resources/features/07ViewExport.feature"},
        glue = {"com.juaracoding.siloam"},
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
