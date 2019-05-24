

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class MagentoTest {
	@Test
	public void positive() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium components\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
        driver.get("https://www.magento.com");
        Welcome w = new Welcome(driver);
        w.clickOnMyaccount();
        Login l = new Login(driver);
        l.typeEmail();
        l.typePass();
        l.clickOnLogin();
        Main m = new Main(driver);
        m.clickOnLogout();
        driver.quit();
	}

}
