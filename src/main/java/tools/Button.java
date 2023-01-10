package tools;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
@Getter
public class Button {
    private final SelenideElement id;
    public Button(String id){
        this.id = $(By.xpath("//button[@id='"+id+"']"));
    }
}
