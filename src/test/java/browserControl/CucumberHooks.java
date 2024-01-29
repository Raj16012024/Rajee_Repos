package browserControl;

import io.cucumber.java.After;
import io.cucumber.java.Before;
// if null error comes up when doing testrunner, then may need to import cucumber java, not just junit
public class CucumberHooks extends WebConnector {
    @Before
    public void setup() {openBrowser();}

    @After
    public void teardown() {closeBrowser();}

}
