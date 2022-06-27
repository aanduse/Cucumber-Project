package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",

        },
        features = "./src/test/resources/features",//path od features folder
        glue = {"stepdefinitions"},//path of the step definitions folder
        tags = "@db_customer_ssn",
        dryRun =false
)
public class RunnerJDBC {

}
