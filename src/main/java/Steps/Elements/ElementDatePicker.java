package Steps.Elements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import tools.Input;

import static com.codeborne.selenide.Selenide.$;

public class ElementDatePicker {
    private final SelenideElement widgets = $(By.xpath("//div[@class='card-body']//h5[.='Widgets']"));
    private final SelenideElement datePicker = $(By.xpath("//div[@class='element-group']//li[@id='item-2']//span[.='Date Picker']"));
    private final SelenideElement dateAndTimePickerInput = new Input("dateAndTimePickerInput").getId();

    @Step("Переход с домашней страницы на страницу \"Date Picker\"")
    public void transitionDatePicker(){
        widgets.click();
        datePicker.click();
    }

    @Step("Ввод в поле \"Date And Time\"")
    public void inputDate(String date,String expected){
        //Предварительная очистка поля
        while (dateAndTimePickerInput.getValue().length()>0)
            dateAndTimePickerInput.sendKeys(Keys.BACK_SPACE);
        //Ввод даты
        dateAndTimePickerInput.val(date);
        dateAndTimePickerInput.sendKeys(Keys.ENTER);
        Assertions.assertEquals(expected,dateAndTimePickerInput.getValue());
    }
}
