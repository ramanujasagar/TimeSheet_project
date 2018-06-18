package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BasePage;

public class EnterTTPage extends BasePage
{
@FindBy(xpath="//div[contains(text(),'Help')]")
private WebElement Help;
@FindBy(linkText="About your actiTIME")
private WebElement AboutAT;
@FindBy(xpath="//span[.='actiTIME 2017 Online']")
private WebElement version;
@FindBy(id="aboutPopupCloseButtonId")
private WebElement closeBTN;
@FindBy(id="logoutLink")
private WebElement Logout;
public EnterTTPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void Help()
{
	wait(5);
	Help.click();
}
public void AboutactiTIME()
{
	wait(1);
	AboutAT.click();
}
public void Verifyversion()
{
	wait(1);
	version.click();
}
public void CloseButton()
{
	wait(1);
	closeBTN.click();
}
public void logout()
{
	wait(1);
	Logout.click();
}
}
