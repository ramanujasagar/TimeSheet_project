package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException 
	{
		String path="./data/input.xlsx";
		String sheet="Valid Login";
		
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		String v=wb.getSheet(sheet).getRow(1).getCell(0).toString();
		//String x=wb.getSheet(sheet).getRow(1).getCell(1).toString();
        System.out.println(v);
        //System.out.println(x);
	}

}
