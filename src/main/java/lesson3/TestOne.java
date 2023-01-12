package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestOne {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.lamoda.ru/");

        WebElement auth = driver.findElement();

<a class="_root_clp6c_2 _secondaryLabel_clp6c_13 _link_1gjtp_11 _link_1gjtp_11" role="button">Войти</a>
        //*[@id="vue-rroot"]/div/heade/div[2]/div/a[1]
        /html/body/div[1]/div/header/div[2]/div/a[1]



        div._root_1gjtp_2> a[role = "button"]

    }
}
