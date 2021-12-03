package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpage {
    private WebDriver driver;
    protected Homepage homepage;

    public Landingpage(WebDriver driver) {
        this.driver = driver;
    }

    public void getTitle() throws InterruptedException {
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
    }

    public Homepage signin() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("akala4gov@yahoo.com");
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("STEPUPH1GHWATER@3364");
        Thread.sleep(1000);

        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);

        return new Homepage(driver);
    }
}
