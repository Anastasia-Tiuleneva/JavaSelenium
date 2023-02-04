package lesson3;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    @FindBy (xpath = "//*[text()[contains(.,'Войти')]]")
    private WebElement entry;


    @FindBy (css = "input[name=login]")
    private WebElement login;
    @FindBy (css = "input[name=password]")
    private WebElement password;

    @FindBy (css = "button[aria-label=Войти]")
    private WebElement singin;


    @FindBy (xpath = "//*[text()[contains(.,'Супер!')]]")
    private WebElement allert;

    @FindBy (css = "span[role=link]>a[role=link]")
    private WebElement profile;


    @FindBy (xpath = "//*[text()[contains(.,'Неверный логин или пароль.')]]")
    private WebElement falseEntry;


    public LoginPage (WebDriver driver){
        super(driver);
    }


    public void entRy(){
        this.entry.click();
    }

    public void logIn(){
        this.login.click();
    }

    public LoginPage setLogin(String login){
        this.login.sendKeys(login);
        return this;

    }

    public void passWord(){
        password.click();

    }

    public LoginPage setPassword(String password){
        this.password.sendKeys(password);
        return this;

    }

    public void singIn(){
        this.singin.click();
    }

    public void allerT(){
        try {
            this.allert.click();
        }
        catch (NoSuchElementException exception) {
            System.out.println("Элемент не найден");
        }

    }

    public void proFile(){
        this.profile.click();
    }


    public String falseEntrY(){
        String falseEntry = this.falseEntry.getText();
        return falseEntry;
    }










    }
