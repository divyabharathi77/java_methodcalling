package javastream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelreading {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File f=new File("C:\\fileactions\\myexcelwreite.xlsx");
		FileInputStream fn=new FileInputStream(f);
        Workbook workbook= WorkbookFactory.create(fn);
        Sheet sheet=workbook.getSheetAt(0);
        for(Row row:sheet)
        {
        	for(Cell cell:row)
        	{
        		switch(cell.getCellType())
        		{
        		case Cell.CELL_TYPE_STRING:
        			System.out.print(cell.getStringCellValue()+"\t");
        			break;
        		case Cell.CELL_TYPE_BLANK:
        			System.out.print("blank"+"\t");
        			break;
        		case Cell.CELL_TYPE_NUMERIC:
        			System.out.print(cell.getNumericCellValue()+"\t");
        			break;
        		}
        		
        	}
            System.out.println();

        }
        //System.out.println();
        /*Row row=sheet.getRow(0);
        Cell cell=row.getCell(0);
        System.out.println(cell);*/
        fn.close();
        //lol commit through eclipse......
        
        }

}
