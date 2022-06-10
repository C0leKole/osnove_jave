package domaci_09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String unos = "TestProba";
        driver.manage().window().maximize();
        driver
                .navigate()
                .to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");


        for (int i = 0; i < 5  ; i++) {
            driver.findElement(By.xpath("//button[contains(@class, 'btn btn-info add-new')]")).click();

            driver.findElement(By.xpath("//input[contains(@name, 'name')]")).sendKeys(unos);
            driver.findElement(By.xpath("//input[contains(@name, 'department')]")).sendKeys(unos);
            driver.findElement(By.xpath("//input[contains(@name, 'phone')]")).sendKeys(unos);


            driver.findElement(By.xpath("//table[contains(@class, 'table table-bordered')]/tbody/tr[last()]/td[last()]/a[1]")).click();
        }

        driver.quit();








    }
}
