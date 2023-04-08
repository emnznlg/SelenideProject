package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Google {

    public SelenideElement searchBox = $(By.name("q"));
    public SelenideElement resultStats = $(By.id("result-stats"));

}
