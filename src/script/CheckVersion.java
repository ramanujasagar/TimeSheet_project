package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTTPage;
import page.LoginPage;

public class CheckVersion extends BaseTest
{
@Test(priority=3)
public void testVersion()
{
	String un=Excel.getData(XL_PATH, "CheckVersion", 1, 0);
	String pw=Excel.getData(XL_PATH, "CheckVersion", 1, 1);
	String eVersion=Excel.getData(XL_PATH, "CheckVersion", 1, 2);
	LoginPage l=new LoginPage(driver);
	l.setUsername(un);
	l.Setpwd(pw);
	l.ClickBTN();
	EnterTTPage e=new EnterTTPage(driver);
	e.Help();
	e.AboutactiTIME();
	e.Verifyversion();
	e.CloseButton();
	e.logout();
}
}
