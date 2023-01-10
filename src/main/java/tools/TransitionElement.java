package tools;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class TransitionElement {
    SelenideElement span;
    public TransitionElement(String span){
        this.span = $(By.xpath("//div[@class='element-group']//span[.='"+span+"']"));
    }
}
