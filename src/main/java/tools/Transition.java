package tools;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class Transition {
    SelenideElement h5;
    public Transition (String h5){
        this.h5= $(By.xpath("//div[@class='card-body']//h5[.='"+h5+"']"));
    }
}
