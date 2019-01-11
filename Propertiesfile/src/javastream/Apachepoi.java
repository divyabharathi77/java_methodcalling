package javastream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apachepoi {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook excelwrk =new XSSFWorkbook();// creating workbook
		XSSFSheet sheet =excelwrk.createSheet("first sheet");//creating sheet
		/*Row row0= sheet.createRow(0);//created row
		Row row1=sheet.createRow(1);
		Cell cellA=row0.createCell(0);//created cell0
		Cell cellB=row0.createCell(1);
		Cell cellC=row1.createCell(0);
		Cell cellD=row1.createCell(1);
*/
		for(int rows=0;rows<10;rows++)
		{
			 Row row=sheet.createRow(rows);
			 for(int cols=0;cols<10;cols++)
			 {
				 Cell cell=row.createCell(cols);
				 cell.setCellValue((int)(Math.random()*100));
			 }
		}
		/*cellA.setCellValue("divya");
		cellB.setCellValue("sudeeksha");
		cellC.setCellValue("kiran");
		cellD.setCellValue("success");
*/
		
		// stream connectivity
		File fn=new File("C:\\fileactions\\myexcelwreite.xlsx");
		FileOutputStream f = new FileOutputStream(fn);
		 excelwrk.write(f);// connecting workbook to output stream
		 //closing the file
		 f.close();
		 System.out.println(" excel file created");
		 
		
		
		

	}

}
