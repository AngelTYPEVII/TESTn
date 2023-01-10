package Tests;

import Persons.Person;
import Steps.Elements.ElementDatePicker;
import Steps.Page.Forms.PageForms;
import Steps.Page.*;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainTest {
    private static final String baseUrl ="https://demoqa.com/";

    PageTextBox textBox = new PageTextBox();
    PageForms forms = new PageForms();
    PageRegister registerUser= new PageRegister();
    PageMenu menu = new PageMenu();
    ElementDatePicker datePicker = new ElementDatePicker();
    PageLogin loginPage = new PageLogin();
    PageDroppable pageDroppable=new PageDroppable();
    Person person =new Person("Тимур","Карпинский",
            "Angel-TYPEVII","Кострома",
            "Кострома","timurka2609@yandex.ru",
            "89621845293");

    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000;
        Configuration.browserSize = "1920x1080";
    }
    @BeforeEach
    public void before() {
        open(baseUrl);
    }

    @Test
    public void testElementsTextBox(){
        textBox.transitionTextBox();
        textBox.inputFullName(person.getName());
        textBox.inputEmail(person.getEMail());
        textBox.inputCurrentAddress(person.getCurrentAddress());
        textBox.inputPermanentAddress(person.getPermanentAddress());
        textBox.submit();
        textBox.checkInfo();
    }

    @Test
    public void testFormsPracticeForm(){
        forms.transitionForms();
        forms.inputFirstName(person.getName());
        forms.inputLastName(person.getLastName());
        forms.inputEmail(person.getEMail());
        forms.inputGender();
        forms.inputNumber(person.getPhoneNumber());
        forms.inputDateOfBirth();
        forms.inputHobbies("Reading","Sports","");
//        new SwitcherHobbies("Reading");
        forms.avatarUpload();
        forms.inputAddress(person.getPermanentAddress());
        forms.submit();
        forms.closeWidow();
    }

    @Test
    public void testBookStoreApplicationRegister(){
        loginPage.skroleBody();
        loginPage.transitionBookStoreApplication();
        registerUser.newUser();
        registerUser.inputFirstName(person.getName());
        registerUser.inputLastName(person.getLastName());
        registerUser.inputUserName(person.getUserName());
        registerUser.inputPassword("Qq-123456!");
        registerUser.registerNewUser();
    }


    @Test
    public void testWidgetsMenu(){
        menu.transitionMenu();
        menu.hoverMainItem2();
        menu.hoverSubList();
        menu.hoverSubItem2();
    }

    @Test
    public void testWidgetsDatePicker(){
        datePicker.transitionDatePicker();
        datePicker.inputDate("September 26 2002 14:30","September 26, 2002 2:30 PM");
        datePicker.inputDate("26/09/2022/18:20","January 3, 2023 11:00 AM");
        datePicker.inputDate("zxzxzxzxZZZ","");
        datePicker.inputDate("++++++","");
    }

    @Test
    public void testInteractionsDroppable(){
        pageDroppable.transitionDroppable();
        pageDroppable.drop();
    }
}