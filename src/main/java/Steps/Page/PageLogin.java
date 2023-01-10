package Steps.Page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tools.Transition;
import tools.TransitionElement;

import static com.codeborne.selenide.Selenide.$;

public class PageLogin {
    private final SelenideElement body = $(By.xpath("//div[@class='body-height']"));
    private final SelenideElement bookStoreApplication = new Transition("Book Store Application").getH5();
    private final SelenideElement login = new TransitionElement("Login").getSpan();

    @Step("Вход в пункт \"Login\"")
    public void transitionBookStoreApplication(){
        bookStoreApplication.click();
        login.click();
    }
    @Step("Прокрутка страницы")
    public void skroleBody(){
        body.scrollIntoView(false);
    }
}
