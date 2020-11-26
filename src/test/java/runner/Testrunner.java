package runner;

import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = ("seleniumgluecode"),
        //plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:resources/reports/report.html"}
        plugin = {"json:resources/reports/cucumber_report.json"}
)
public class Testrunner {

    @AfterClass
    public static void teardown(){
        try {
            System.out.println("Generating report...");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Report successfully generated!");
        }catch (Exception ex){
            System.out.println("The report could not be generated.");
            ex.printStackTrace();
        }
    }
}
