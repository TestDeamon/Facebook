package setup;

import POM.Landingpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup {
    private WebDriver driver;
    protected Landingpage landingpage;

    @BeforeTest
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\IdeaProjects\\ChakaProcessAutomation\\resources\\geckodriver.exe");

        driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://facebook.com");

        Thread.sleep(3000);

        landingpage = new Landingpage(driver);
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
