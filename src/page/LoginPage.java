package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class LoginPage extends BasePage
{
	
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	@FindBy(xpath="//span[@class='errormsg']")
	private WebElement ErrMsg;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setUsername(String un)
	{
		unTB.sendKeys(un);
	}
	public void Setpwd(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void ClickBTN()
	{
		loginBTN.click();
	}
	public void VerifyErrMsg(String eText)
	{
		wait(2);
		verifyText(ErrMsg,eText);
	}

}
