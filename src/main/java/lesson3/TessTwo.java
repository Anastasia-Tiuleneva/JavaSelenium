//package lesson3;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//ChromeOptions
//import java.util.concurrent.TimeUnit;
//
////Тест-кейс № 2. Проверка меню магазина
//
//public class TessTwo {
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
//
//        driver.get("https://www.lamoda.ru/");
//
//        WebElement ideas = driver.findElement(By.xpath("//*[text()[contains(.,'Идеи')]]"));
//        ideas.click();
//
//        WebElement clothes = driver.findElement(By.xpath("//*[text()[contains(.,'Одежда')]]"));
//        clothes.click();
//
//        WebElement accessories= driver.findElement(By.xpath("//*[text()[contains(.,'Аксессуары')]]"));
//        accessories.click();
//
//        driver.quit();
//
//
//    }
//}
