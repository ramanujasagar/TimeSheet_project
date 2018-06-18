package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Autoutil 
{

public static String getProperty(String path, String key)
{
	String v="";
	try
	{
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		v=p.getProperty(key);
		
	}
	catch(Exception e)
	{
		
	}
	return v;
}



	

}
