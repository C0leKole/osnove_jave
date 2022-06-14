package domaciZadaci.domaci_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Zadatak1Selenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        driver.get("https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//img[contains(@class, 'fendym')]")).click();

        driver.findElement(By.xpath("//div[contains(text(), '+ Add photo')]")).click();

        File dokument1 = new File("src/main/resources/front_nikola_ilic.jpg");


        driver.findElement(By.xpath("//input[contains(@id, 'imageUpload')]")).sendKeys(dokument1.getAbsolutePath());


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]"), 1));

        driver.findElement(By.xpath("//img[contains(@loading, 'lazy')]")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'sc-iXxrte dxCajp')]")));
        driver.findElement(By.xpath("//button[contains(text(), 'Use One Side Only')]")).click();
        //block
        driver.findElement(By.xpath("//img[contains(@alt, 'image 2')]")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'sc-cCsOjp dcdHHD')]")).click();

        File dokument2 = new File("src/main/resources/left_nikola_ilic.jpg");
        driver.findElement(By.xpath("//input[contains(@id, 'imageUpload')]")).sendKeys(dokument2.getAbsolutePath());
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div"), 1));

        driver.findElement(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'Use One Side Only')]")).click();
        //block
        driver.findElement(By.xpath("//img[contains(@alt, 'image 3')]")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'sc-cCsOjp dcdHHD')]")).click();

        File dokument3 = new File("src/main/resources/back_nikola_ilic.jpg");
        driver.findElement(By.xpath("//input[contains(@id, 'imageUpload')]")).sendKeys(dokument3.getAbsolutePath());
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div"), 2));

        driver.findElement(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'Use One Side Only')]")).click();
        //block

        driver.findElement(By.xpath("//img[contains(@alt, 'image 4')]")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'sc-cCsOjp dcdHHD')]")).click();

        File dokument4 = new File("src/main/resources/right_nikola_ilic.jpg");
        driver.findElement(By.xpath("//input[contains(@id, 'imageUpload')]")).sendKeys(dokument4.getAbsolutePath());
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div"), 3));

        driver.findElement(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'Use One Side Only')]")).click();

        //block

        driver.findElement(By.xpath("//div[contains(@class, 'sc-jhzXDd emMrhw')]")).click();
        driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();

        WebElement greska = driver.findElement(By.xpath("//*[@action='error']"));

        System.out.println("Vrednost pop up atributa je: " + greska.getAttribute("action"));

        driver.quit();



    }
}
