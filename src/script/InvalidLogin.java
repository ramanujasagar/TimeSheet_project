package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InvalidLogin extends BaseTest
{
@Test(priority=2)
public void testInvalidLogin()
{
	//int rc=Excel.getRowCount(XL_PATH, "InvalidLogin");
	for(int i=1;i<=4;i++)
	{
		String un=Excel.getData(XL_PATH, "InvalidLogin", i, 0);
		String pw=Excel.getData(XL_PATH, "InvalidLogin", i, 1);
		String msg=Excel.getData(XL_PATH, "InvalidLogin", i, 2);
		LoginPage l=new LoginPage(driver);
		l.setUsername(un);
		l.Setpwd(pw);
		l.ClickBTN();
		l.VerifyErrMsg(msg);
	}
}
}
