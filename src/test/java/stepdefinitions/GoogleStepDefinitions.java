package stepdefinitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Google;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleStepDefinitions {

    Google google = new Google();

    @Given("User navigates to {string}")
    public void user_navigates_to(String string) {
        open(string);
    }

    @When("User waits for {int} seconds")
    public void user_waits_for_seconds(Integer int1) {
        sleep(int1 * 1000);
    }

    @When("User navigates back")
    public void user_navigates_back() {
        back();
    }

    @When("User navigates forward")
    public void user_navigates_forward() {
        forward();
    }

    @When("User refreshes the page")
    public void user_refreshes_the_page() {
        refresh();
    }

    @When("User holds the browser open")
    public void user_holds_the_browser_open() {
        Configuration.holdBrowserOpen = true;
    }
    @When("User searches for {string}")
    public void user_searches_for(String string) {
        google.searchBox.setValue(string).pressEnter();

    }
    @Then("User verifies that the page source contains {string}")
    public void user_verifies_that_the_page_source_contains(String string) {
        boolean isTrue = WebDriverRunner.source().contains(string);
        Assert.assertTrue(isTrue);
    }
    @Then("User verifies that the result contains the {string} keyword")
    public void user_verifies_that_the_result_contains_the_keyword(String string) {
        google.resultStats.shouldBe();
        google.resultStats.shouldHave(text(string));
        google.resultStats.shouldNotHave(text("mercedes"));
    }

}
