//package lesson3;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
////Тест-кейс № 3. Проверка карточки товара
//
//public class TestThree {
//    public static void main(String[] args) {
//
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
//        options.addArguments("--start-maximized");
//
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        driver.get("https://www.lamoda.ru/p/rtlacg877001/clothes-uniqlo-polo/");
//
//        try {
//            WebElement addBasket = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[aria-label=\"Добавить в корзину\"]")));
//            System.out.println("Element is clickable");
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addBasket);
//
//            addBasket.click();
//            System.out.println("Element click");
//        }
//        catch(TimeoutException e) {
//            System.out.println("Element isn't clickable");
//        }
//
//        WebElement goToBasket = driver.findElement(By.xpath("//*[text()[contains(.,'Перейти в корзину')]]"));
//        goToBasket.click();
//        driver.quit();
//
//
//
//
//    }
//}
