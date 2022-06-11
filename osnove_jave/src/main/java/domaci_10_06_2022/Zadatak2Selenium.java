package domaciZadaci.domaci_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Zadatak2Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://geodata.solutions/");


        WebElement element = driver.findElement(By.id("countryId"));
        Select select = new Select(element);
        select.selectByValue("Serbia");


        WebElement element2 = driver.findElement(By.id("stateId"));
        Select select2 = new Select(element2);
        select2.selectByValue("Central Serbia");

        if (elementExist(driver, By.xpath("//select[contains(@id, 'stateId')]/option")) == true) {
            System.out.println("STATE Element postoji");
        } else {
            System.out.println("STATE Element ne postoji");
        }


        WebElement element3 = driver.findElement(By.id("cityId"));
        Select select3 = new Select(element3);
        select3.selectByValue("Zajecar");

        List<WebElement> elementi = driver.findElements(By.xpath("//select[contains(@id, 'cityId')]/option"));

        if (elementi.size() > 2) {
            System.out.println("CITY Elementi postoje");
        } else {
            System.out.println("CITY Elementi ne postoje");
        }




        driver.quit();


    }

    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;
    }
}
