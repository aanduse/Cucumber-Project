package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp(){

    }

    //It runs after every scenario

    /*@After("hooks_feature or @customer_login")
      I can run @After method for specific tags
      For example here @After method will run for only @hooks_feature or @customer_login
     */

    @After
    public void tearDown(Scenario scenario){
    if(scenario.isFailed()) {
    final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    scenario.attach(screenshot,"image/png","screenshots");
}
}
}
