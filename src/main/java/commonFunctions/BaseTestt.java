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

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestt {

public static WebDriver driver;
String ApppURL="https://www.liidaveqa.com/login";

	
	@BeforeSuite
	public void setup() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--disable notifications");
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
