package tools;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
@Getter
public class TextArea {
    private final SelenideElement id;
    public TextArea(String id){
        this.id = $(By.xpath("//textarea[@id='"+id+"']"));
    }
}
