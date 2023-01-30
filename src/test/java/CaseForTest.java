import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CaseForTest {
    static WebDriver driver;


    @BeforeAll
    static void setup() {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }


    @Test
    void test1() throws InterruptedException {
        driver.get("https://www.lamoda.ru/");
        WebElement auth = driver.findElement(By.xpath("//*[text()[contains(.,'Войти')]]"));
        auth.click();


        WebElement login = driver.findElement(By.cssSelector("input[name=login]"));
        login.click();
        login.sendKeys("nastusha665@mail.ru");

        WebElement password = driver.findElement(By.cssSelector("input[name=password]"));
        password.click();
        password.sendKeys("1234Book@");

        WebElement singIn = driver.findElement(By.cssSelector("button[aria-label=Войти]"));
        singIn.click();


        try {
            WebElement allert = driver.findElement(By.xpath("//*[text()[contains(.,'Супер!')]]"));
            allert.click();
        }
        catch (NoSuchElementException exception) {
            System.out.println("Элемент не найден");
        }


        WebElement profile = driver.findElement(By.cssSelector("span[role=link]>a[role=link]"));
        profile.click();

            Thread.sleep(1000);

        Assertions.assertTrue(driver.getTitle().contains("Заказы"), "Тест не успешный");

    }


    @Test
    void test2() {

        driver.get("https://www.lamoda.ru/");

        WebElement ideas = driver.findElement(By.xpath("//*[text()[contains(.,'Идеи')]]"));
        ideas.click();

        WebElement clothes = driver.findElement(By.xpath("//*[text()[contains(.,' Одежда')]]"));
        clothes.click();

        WebElement accessories= driver.findElement(By.xpath("//*[text()[contains(.,'Аксессуары')]]"));
        accessories.click();

        Assertions.assertEquals("https://www.lamoda.ru/c/557/accs-zhenskieaksessuary/?sitelink=topmenuW&l=5",driver.getCurrentUrl(), "Тест провален");

    }

    @Test
    void test3() {
        driver.get("https://www.lamoda.ru/p/rtlacg877001/clothes-uniqlo-polo/");

        try {
            WebElement addBasket = new WebDriverWait(driver, Duration.ofSeconds(5)).until
                    (ExpectedConditions.elementToBeClickable(By.cssSelector("button[aria-label=\"Добавить в корзину\"]")));
            System.out.println("Element is clickable");
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addBasket);

            addBasket.click();
            System.out.println("Element click");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable");
        }

        WebElement goToBasket = driver.findElement(By.xpath("//*[text()[contains(.,'Перейти в корзину')]]"));
        goToBasket.click();
        Assertions.assertEquals("https://www.lamoda.ru/checkout/cart/",driver.getCurrentUrl(), "Тест провален");
    }
    @Test
    void test4 () throws InterruptedException {


        driver.get("https://www.lamoda.ru/");

        WebElement search = driver.findElement(By.cssSelector("input[placeholder=Поиск]"));
        search.click();
        search.sendKeys("Футболка");
        search.sendKeys(Keys.ENTER);

        Thread.sleep(1000);

        WebElement catalog = driver.findElement(By.cssSelector("div>h2"));
        String catalogName = catalog.getText();
        System.out.println(catalogName);

        Assertions.assertTrue(catalogName.contains("Товары по запросу «футболка»"), "Поиск не сработал");

    }
    @Test
    void test5 () {
        driver.get("https://www.lamoda.ru/");
        WebElement auth = driver.findElement(By.xpath("//*[text()[contains(.,'Войти')]]"));
        auth.click();


        WebElement login = driver.findElement(By.cssSelector("input[name=login]"));
        login.click();
        login.sendKeys("nastusha665@mail.ru");

        WebElement password = driver.findElement(By.cssSelector("input[name=password]"));
        password.click();
        password.sendKeys("1234Book@1");

        WebElement singIn = driver.findElement(By.cssSelector("button[aria-label=Войти]"));
        singIn.click();

        WebElement allert = driver.findElement(By.xpath("//*[text()[contains(.,'Неверный логин или пароль.')]]"));
        String textOr = "Неверный логин или пароль.";
        String textFr = allert.getText();

        Assertions.assertTrue(textOr.contains(textFr), "Тест не успешный");
}



    @Test
    void test6() {
        driver.get("https://www.lamoda.ru/");

        try {
            WebElement oferta = new WebDriverWait(driver, Duration.ofSeconds(5)).until
                    (ExpectedConditions.elementToBeClickable(By.xpath("//*[text()[contains(.,'Публичная оферта')]]")));
            System.out.println("Element is clickable");
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", oferta);

            oferta.click();
            System.out.println("Element click");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable");
        }

        Assertions.assertEquals("https://www.lamoda.ru/about/oferta/?from=footer",driver.getCurrentUrl(), "Тест провален");
    }

    @AfterAll
    static void close(){
        driver.quit();
    }
}
