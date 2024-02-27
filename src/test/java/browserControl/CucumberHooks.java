package browserControl;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

// if null error comes up when doing testrunner, then may need to import cucumber java, not just junit
public class CucumberHooks extends WebConnector {
    @Before
    public void setup() {openBrowser();}
    @After
    public void teardown(Scenario scenario) {

        if (scenario.isFailed()) {
            //Take a screenshot
            final byte[] Screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            // embed it in the report
            scenario.attach(Screenshots, "image/png", scenario.getName().replace(" ", "_") + "_ErrorScreenshot");}
        closeBrowser();}
}


