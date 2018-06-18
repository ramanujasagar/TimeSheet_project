package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
 public WebDriver driver;
public void wait(int i)
{
	try
	{
		Thread.sleep(i*1000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
}	 
	public void verifyPageIsDisplayed( WebDriver driver,String eResult)
	 {
		 String sETO=Autoutil.getProperty(IAutoConst.CONFIG_PATH, "ETO");
		 long ETO=Long.parseLong(sETO);
		 WebDriverWait wait=new WebDriverWait(driver, ETO);
		 try
		 {
			 wait.until(ExpectedConditions.titleIs(eResult));
			 Reporter.log("PASS:Expected Page is Displayed",true);
		 }
		 catch(Exception e)
		 {
			 Reporter.log("Fail:Expected Page is not Displayed");
			 Assert.fail();
		 }
	 }
	public void verifyText(WebElement e,String eText)
	{
		String aText =e.getText();
		Assert.assertEquals(aText, eText);
	}
}

