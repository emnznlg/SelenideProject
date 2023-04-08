package stepdefinitions;

import io.cucumber.java.en.*;
import pages.TestPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TestPageStepDefinitions {

    TestPage testPage = new TestPage();

    @When("User enters the username")
    public void user_enters_the_username() {
        testPage.username.setValue("techproed");
    }
    @When("User enters the password")
    public void user_enters_the_password() {
        testPage.password.setValue("SuperSecretPassword");
    }
    @When("User clicks the login button")
    public void user_clicks_the_login_button() {
        testPage.submitBtn.click();
        sleep(2000);
    }

    @And("User clicks the logout button")
    public void userClicksTheLogoutButton() {
        testPage.logOutBtn.click();
        sleep(2000);
    }
}
