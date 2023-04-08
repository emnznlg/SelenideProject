package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class TestPage {

    //1.Way
//    public SelenideElement username() {
//        return $(By.id("exampleInputEmail1"));
//    }

    //2.Way
    public SelenideElement username = $(By.id("exampleInputEmail1"));
    public SelenideElement password = $(By.id("exampleInputPassword1"));
    public SelenideElement submitBtn = $(By.xpath("//*[@type='submit']"));
    public SelenideElement logOutBtn = $(By.partialLinkText("Logout"));
}
