package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;
    protected Landingpage landingpage;
    public Homepage(WebDriver driver){
        this.driver = driver;
    }
    public Landingpage logout() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div")).click();
        Thread.sleep(2000);
        return new Landingpage(driver);
    }
}
