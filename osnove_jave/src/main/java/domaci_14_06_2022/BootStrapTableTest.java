package domaciZadaci.domaci_14_06_2022;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class BootStrapTableTest {
    private WebDriver driver;
    private String baseUrl = "https://s.bootsnipp.com";

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }


    @Test(priority = 10)
    public void editRow() throws InterruptedException {
        driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertTrue(driver.getTitle().equals("Table with Edit and Update Data - Bootsnipp.com"),
                "Naslov stranice nije Table with Edit and Update Data - Bootsnipp.com");
        driver.findElement(By.xpath("//button[contains(@type, 'button')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("modal-content")));

        driver.findElement(By.id("fn")).clear();
        driver.findElement(By.id("ln")).clear();
        driver.findElement(By.id("mn")).clear();

        driver.findElement(By.id("fn")).sendKeys("Nikola");
        driver.findElement(By.id("ln")).sendKeys("Ilic");
        driver.findElement(By.id("mn")).sendKeys("Goran");

        driver.findElement(By.id("up")).click();
        WebElement element = driver.findElement(By.className("modal-content"));
        wait.until(ExpectedConditions.invisibilityOf(element));
        String ime = driver.findElement(By.id("f1")).getText();
        String prezime = driver.findElement(By.id("l1")).getText();
        String srednjeIme = driver.findElement(By.id("m1")).getText();


        Assert.assertEquals(ime,
                "Nikola",
                "U First Name celiji prvog reda tabele se ne javlja uneto ime");

        Assert.assertEquals(prezime,
                "Ilic",
                "U Last Name celiji prvog reda tabele se ne javlja uneto prezime");

        Assert.assertEquals(srednjeIme,
                "Goran",
                "U Middle Name celiji prvog reda tabele se ne javlja uneto srednje ime");


    }

    @Test(priority = 20)
    public void deleteRow() {
        driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertTrue(driver.getTitle().equals("Table with Edit and Update Data - Bootsnipp.com"),
                "Naslov stranice nije Table with Edit and Update Data - Bootsnipp.com");
        driver.findElement(By.xpath("//button[contains(@class, 'delete')]")).click();

        String deletePopUp = driver.findElement(By.id("del")).getAttribute("id");


        Assert.assertTrue(deletePopUp
                        .equals("del"),
                "Pop-up se ne pojavljuje nakon brisanja reda");

        driver.findElement(By.id("del")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement deleteDialogueBox = driver.findElement(By.id("del"));
        wait.until(ExpectedConditions.invisibilityOf(deleteDialogueBox));

        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("/tbody"), 1));


    }

    @Test(priority = 30)
    public void takeAScreenShot() throws Exception {
        driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertTrue(driver.getTitle().equals("Table with Edit and Update Data - Bootsnipp.com"),
                "Naslov stranice nije Table with Edit and Update Data - Bootsnipp.com");

        this.takeSnapShot(driver,
                "C:\\Users\\Kole\\Desktop\\Projekti\\UvodJava\\src\\main\\resources\\slika.png");


    }

    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile = new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}