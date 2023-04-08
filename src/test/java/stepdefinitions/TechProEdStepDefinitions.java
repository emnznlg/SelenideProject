package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TechProEdStepDefinitions {

    @Given("User verifies that the title contains {string}")
    public void user_verifies_that_the_title_contains(String string) {
        boolean isTrue = title().contains(string);
        Assert.assertTrue(isTrue);
    }

}
