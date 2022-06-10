package domaci_09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Zadatak1Selenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://s.bootsnipp.com/iframe/WaXlr");

        List<WebElement> dugmici = driver.findElements(By.xpath("//button[contains(@id, 'rating-star')]"));

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite redni broj zvezdice na koju treba kliknuti:");
        int n = s.nextInt();

        for (int i = 0; i < n ; i++) {

            if (n == 1) {
                dugmici.get(i).click();
            } if ( n == 2) {
                dugmici.get(i).click();
            } if ( n == 3) {
                dugmici.get(i).click();
            } if (n == 4) {
                dugmici.get(i).click();
            } if ( n == 5){
                dugmici.get(i).click();
            }

        }
        Thread.sleep(5000);
        driver.quit();



    }
}
