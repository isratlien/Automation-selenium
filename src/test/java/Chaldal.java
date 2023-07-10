import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Chaldal {
    public WebDriver driver;

    @Test
    public void browser() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        Map<String, Object> profile = new HashMap<String, Object>();
        Map<String, Integer> contentSettings = new HashMap<String, Integer>();
        //0 - Default, 1 - Allow, 2 - Block
        contentSettings.put("notifications", 2);
        contentSettings.put("geolocation", 2);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");
//
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
//      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//      driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div[3]/h5")).click();
        driver.findElement(By.xpath("(//input[@name=\"name\"])[1]")).sendKeys("Israt");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@name=\"name\"])[2]")).sendKeys("Lien");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("isratlien@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()=\"Register\"]")).click();
        driver.findElement(By.xpath("//a [text()=\"YouTube Courses\"]")).actions.moveToElement(menuOption).perform();

    }

}
