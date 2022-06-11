package domaciZadaci.domaci_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak1Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://s.bootsnipp.com/iframe/Dq2X");

        for (int i = 0; i < 5; i++) {

            driver.findElement(By.xpath("//div[contains(@class, 'col-md-12')]/div[last()]/button")).click();
            if (elementExist(
                    driver,
                    By.xpath("//div[contains(@class, '//div[contains(@class, 'col-md-12')]/div[last()]/button')]")) == false) {
                System.out.println("Element je izbrisan");
            }


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
