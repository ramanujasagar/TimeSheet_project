package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAutoConst 
{
public WebDriver driver;
static
{
System.setProperty(CHROME_KEY,CHROME_VALUE );
//System.setProperty(GECKO_KEY,GECKO_VALUE);
}
@BeforeMethod(alwaysRun=true)
public void OpenApplication()
{
	String appURL=Autoutil.getProperty(CONFIG_PATH,"appURL");
	String sITO=Autoutil.getProperty(CONFIG_PATH, "ITO");
	long ITO=Long.parseLong(sITO);
	driver=new ChromeDriver();
	//driver=new FirefoxDriver();
	driver.get(appURL);
	driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
	
}
@AfterMethod(alwaysRun=true)
public void CloseApplication()
{
	driver.quit();
}
	

}
