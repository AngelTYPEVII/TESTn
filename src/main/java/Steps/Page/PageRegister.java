package Steps.Page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tools.Button;
import tools.Input;

public class PageRegister {

    private final SelenideElement btnNewUser = new Button("newUser").getId();
    private final SelenideElement firstName= new Input("firstname").getId();
    private final SelenideElement lastName = new Input("lastname").getId();
    private final SelenideElement userName = new Input("userName").getId();
    private final SelenideElement password = new Input("password").getId();
    private final SelenideElement register = new Button("register").getId();


    @Step("Нажимание кнопки \"New User\"")
    public void newUser(){
        btnNewUser.click();
    }
    @Step("Ввод в поле \"First Name\"")
    public void inputFirstName(String first_name){
        firstName.val(first_name);
    }
    @Step("Ввод в поле \"Last Name\"")
    public void inputLastName(String last_name){
        lastName.val(last_name);
    }
    @Step("Ввод в поле \"User Name\"")
    public void inputUserName(String user_name) {
        userName.val(user_name);
    }
    @Step("Ввод в поле \"Password\"")
    public void inputPassword(String pass){
        password.val(pass);
    }
    @Step("нажатие кнопки \"Register\"")
    public void registerNewUser (){
        register.click();
    }
}
