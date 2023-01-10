package Steps.Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import tools.Transition;
import tools.TransitionElement;

import static com.codeborne.selenide.Selenide.*;

public class PageDroppable {
    private final SelenideElement interactions = new Transition("Interactions").getH5();
    private final SelenideElement droppable = new TransitionElement("Droppable").getSpan();
    private final SelenideElement draggableObject = $(By.cssSelector("div#draggable"));
    private final SelenideElement droppableObject = $(By.cssSelector("div#droppable"));
    private final SelenideElement scroll = $(By.cssSelector("div.left-pannel"));

    @Step("Переход на страницу \"droppable\"")
    public void transitionDroppable() {
        interactions.click();
        scroll.scrollTo();
        droppable.click();
    }
    @Step("Перемищение объекта в область")
    public void drop(){
        draggableObject.shouldBe(Condition.interactable).click();
        actions().dragAndDrop(draggableObject, droppableObject).build().perform();
        Assertions.assertEquals("Dropped!", droppableObject.getText());
    }
}
