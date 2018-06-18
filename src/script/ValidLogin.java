package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTTPage;
import page.LoginPage;

public class ValidLogin extends BaseTest
{
@Test(priority=1)
public void testValidLogin()
{
	String un=Excel.getData(XL_PATH, "Valid Login", 1, 0);
	String pw=Excel.getData(XL_PATH, "Valid Login", 1, 1);
	String eTitle=Excel.getData(XL_PATH, "Valid Login", 1, 2);
	LoginPage l =new LoginPage(driver);
	l.setUsername(un);
	l.Setpwd(pw);
	l.ClickBTN();
	EnterTTPage e=new EnterTTPage(driver);
	e.verifyPageIsDisplayed(driver,eTitle);
}
}
