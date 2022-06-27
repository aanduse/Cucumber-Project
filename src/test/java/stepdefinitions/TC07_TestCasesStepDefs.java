package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC07_TestCasesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC07_TestCasesStepDefs {

    TC07_TestCasesPage testCasesPage =new TC07_TestCasesPage();

    @Given("user launches the browser")
    public void user_launches_the_browser() {
        Driver.getDriver();
    }

    @When("user navigate the url")
    public void user_navigate_the_url() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
    }

    @Then("user verifies that home page is visible succesfully")
    public void user_verifies_that_home_page_is_visible_succesfully() {
        Assert.assertEquals("https://automationexercise.com/",Driver.getDriver().getCurrentUrl());
    }

    @And("user clicks on Test Cases button")
    public void userClicksOnTestCasesButton() {

        testCasesPage.testCasesLink.click();
    }

    @Then("user navigate to test case page succesfully")
    public void user_navigate_to_test_case_page_succesfully() {
    //Assert.assertTrue(testCasesPage.testCaseText.isDisplayed());
        Assert.assertEquals("TEST CASES", testCasesPage.testCaseText.getText());
    }

    @Then("user closes the browser")
    public void userClosesTheBrowser() {
        Driver.closeDriver();
    }
}
