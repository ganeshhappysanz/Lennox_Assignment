package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	
	@FindBy(xpath="//a[@href='/signin']")
	public static WebElement Login_link;	
	@FindBy(id="j_username")
	public static WebElement username_field;
	@FindBy(id="j_password")
	public static WebElement Password_field;
	@FindBy(id="loginSubmit")
	public static WebElement Login_button;
	

}
