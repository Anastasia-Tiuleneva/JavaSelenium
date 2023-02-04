package lesson3;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends AbstractPage{

    @FindBy(xpath = "//*[text()[contains(.,'Идеи')]]")
    private WebElement menuIdeas;

    @FindBy (xpath = "//*[text()[contains(.,' Одежда')]]")
    private WebElement menuClothes;

    @FindBy (xpath = "//*[text()[contains(.,'Аксессуары')]]")
    private WebElement accessories;


    @FindBy(css = "input[placeholder=Поиск]")
    private WebElement search;

    @FindBy(css = "div>h2")
    private WebElement catalog;

    @FindBy (css = "a[href= \"/checkout/cart/\"]>div")
    private WebElement box;


    @FindBy(xpath = "//*[text()[contains(.,'Публичная оферта')]]")
    private WebElement oferta;


    public MenuPage( WebDriver driver) {
        super(driver);
    }
    public MenuPage clickmenuIdeas(){
        menuIdeas.click();
        return this;
    }
    public MenuPage clickmenuClothes(){
        menuClothes.click();
        return this;
    }

    public MenuPage clickaccessories(){
        accessories.click();
        return this;
    }




    public MenuPage setSearch(String search)  {
        this.search.sendKeys(search, Keys.ENTER);
        return this;
    }


    public String searchCatalog(){
        String catalogName = this.catalog.getText();
        return catalogName;
    }


    public MenuPage oferta() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", this.oferta);
        this.oferta.click();
        return this;
    }


    public MenuPage clickBox () {
        box.click();
        return this;
    }








}
