//package lesson3;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.util.concurrent.TimeUnit;
//
////Тест-кейс № 1. Проверка авторизации
//public class TestOne {
//    public static void main(String[] args) {
//
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
//        options.addArguments("start-maximized");
//
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        driver.get("https://www.lamoda.ru/");
//        WebElement auth = driver.findElement(By.xpath("//*[text()[contains(.,'Войти')]]"));
//        auth.click();
//
//
//        WebElement login = driver.findElement(By.name("login"));
//        login.click();
//        login.sendKeys("nastusha665@mail.ru");
//
//        WebElement password = driver.findElement(By.cssSelector("input[name=password]"));
//        password.click();
//        password.sendKeys("1234Book@");
//
//        WebElement singIn = driver.findElement(By.cssSelector("button[aria-label=Войти]"));
//        singIn.click();
//
//
//        try {
//            WebElement allert = driver.findElement(By.xpath("//*[text()[contains(.,'Супер!')]]"));
//            allert.click();
//        }
//        catch (NoSuchElementException exception) {
//            System.out.println("Элемент не найден");
//        }
//
//
//        WebElement profile = driver.findElement(By.cssSelector("span[role=link]>a[role=link]"));
//        profile.click();
//
//        driver.quit();
//
//
//
//
//
//
//    }
//}
