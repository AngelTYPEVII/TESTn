package Steps.Page.Forms;

import org.openqa.selenium.By;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;

public class SwitcherHobbies {
    public SwitcherHobbies(String arg, String arg1, String arg2){
        if (!Objects.equals(arg, ""))
            $(By.xpath("//label[.='"+arg+"']")).click();
        if (!Objects.equals(arg1, ""))
            $(By.xpath("//label[.='"+arg1+"']")).click();
        if (!Objects.equals(arg2, ""))
            $(By.xpath("//label[.='"+arg2+"']")).click();
    }
}