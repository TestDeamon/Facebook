package Tests;

import POM.Homepage;
import org.testng.annotations.Test;
import setup.Setup;


public class AllTests extends Setup {
    Homepage homepage;

    @Test
    public void tests() throws InterruptedException {
        landingpage.getTitle();
        homepage = landingpage.signin();

        landingpage = homepage.logout();
    }
}
