import io.github.bonigarcia.wdm.WebDriverManager;
import lesson3.LoginPage;
import lesson3.MenuPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CaseForTest extends AbstractTest {



        @Test
        void test1() throws InterruptedException {
            LoginPage loginPage = new LoginPage(getWebDriver());
            loginPage.entRy();
            loginPage.logIn();
            loginPage.setLogin("nastusha665@mail.ru");
            loginPage.passWord();
            loginPage.setPassword("1234Book@");
            loginPage.singIn();
            loginPage.allerT();
            loginPage.proFile();
            Assertions.assertEquals("Заказы", getWebDriver().getTitle());
    }

    @Test
    void test2() {
        MenuPage mainMenu = new MenuPage(getWebDriver());
        mainMenu.clickmenuIdeas();
        mainMenu.clickmenuClothes();
        mainMenu.clickaccessories();

        Assertions.assertEquals("https://www.lamoda.ru/c/557/accs-zhenskieaksessuary/?sitelink=topmenuW&l=5",getWebDriver().getCurrentUrl());


}

    @Test
    void test3() {
        MenuPage mainMenu = new MenuPage(getWebDriver());
        mainMenu.clickBox();
        Assertions.assertEquals("https://www.lamoda.ru/checkout/cart/",getWebDriver().getCurrentUrl());


    }
    @Test
    void test4 () throws InterruptedException {


        MenuPage mainMenu = new MenuPage(getWebDriver());

        mainMenu.setSearch("Футболка");
        Thread.sleep(5000);

        Assertions.assertTrue(mainMenu.searchCatalog().contains("Товары по запросу «футболка»"), "Поиск не сработал");

    }
    @Test
    void test5 () throws InterruptedException {
            LoginPage loginPage = new LoginPage(getWebDriver());
            loginPage.entRy();
            loginPage.logIn();
            loginPage.setLogin("nastusha665@mail.ru");
            loginPage.passWord();
            loginPage.setPassword("1234Book@1");
            loginPage.singIn();
            Assertions.assertTrue(loginPage.falseEntrY().contains("Неверный логин или пароль."));


}



    @Test
    void test6() throws InterruptedException {

        MenuPage mainMenu = new MenuPage(getWebDriver());
        mainMenu.oferta();

        Assertions.assertEquals("https://www.lamoda.ru/about/oferta/?from=footer",getWebDriver().getCurrentUrl());

    }


}
