package testcases;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import commonFunctions.BaseTestt;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pageElements.LoginPage;


public class Login extends BaseTestt{
	
	@Test
	public void Login_Test() throws InterruptedException, BiffException, IOException {
		PageFactory.initElements(driver, pageElements.LoginPage.class);
		LoginPage.Login_link.click();
		Thread.sleep(5000);
		
		File src=new File("C:/Users/Ganesh/eclipse-workspace/Assignment_Test/TestData/TestData.xls");
		Workbook wb=Workbook.getWorkbook(src);
		String UserName=wb.getSheet(0).getCell(0, 0).getContents();
		String Password=wb.getSheet(0).getCell(1, 0).getContents();
		
		LoginPage.username_field.sendKeys(UserName);
		LoginPage.Password_field.sendKeys(Password);
		LoginPage.Login_button.submit();
		
	}

}
