package commonFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestt {

public static WebDriver driver;
String ApppURL="https://www.liidaveqa.com/login";

	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ganesh\\eclipse-workspace\\Assignment_Test\\Drivers\\geckodriver.exe");
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--disable notifications");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get(ApppURL);
		
		
		/*
		 * FirefoxProfile geoDisabled = new FirefoxProfile();
		 * geoDisabled.setPreference("geo.enabled", false);
		 * geoDisabled.setPreference("geo.provider.use_corelocation", false);
		 * geoDisabled.setPreference("geo.prompt.testing", false);
		 * geoDisabled.setPreference("geo.prompt.testing.allow", false);
		 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 * capabilities.setCapability(FirefoxDriver.PROFILE, geoDisabled); driver = new
		 * FirefoxDriver(capabilities);
		 */
		
	}
	
	
	@AfterSuite
	public void teardown() {
		if(driver!=null) {
            driver.quit();
        }
	}
	

}
