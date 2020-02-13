import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics {
    public static void main(String[] args) {

        // classname obj = new classname();

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nirav\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        // WebDriver driver = new FirefoxDriver();


//System.setProperty("webdriver.chrome.driver", "C:\Users\nirav\AppData\Local\Google\Chrome\Application\chrome.exe");


        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com");

        System.out.println("am on argos homepage");

    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("12345");
    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("jiya12");
    }}//input[@id='username']