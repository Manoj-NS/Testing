package apache_poi_learning;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel {
	
	public static void main(String[] args) throws IOException {
		
//To remove compile error need to add log4j-api and log4j-core dependencies	
		
		// .\\=This will take current project path 
		
		String excelFilePath = ".\\DataFiles\\City-State-Population.xlsx";
		
		//To open file and read the data
		
		FileInputStream inputstream = new FileInputStream (excelFilePath);
		
		// To get the Workbook
		
		XSSFWorkbook workbook = new XSSFWorkbook (inputstream);
		
		// To get the sheet from workbook; can get by sheet or index
		
		// XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//To read the data in sheet
		
		//Using FOR Loop
		
		//find the total rows and  column in the sheet
		
		int rows=sheet.getLastRowNum();
		
		int col=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total rows: "+rows);
		System.out.println("Total columns: "+col);
		
		for (int r=0; r<=rows; r++)
		{
			XSSFRow row =sheet.getRow(r);
			
			for (int c=0; c<col; c++)
			{
				XSSFCell cell=row.getCell(c);
				
				//Find the type of the cell
				
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue()); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
				}
				
				System.out.print(" - ");
			}
			System.out.println();
		}
	
		
/*
		//Using iterator--Most Preferred Method--It is easier then For Loop  
		
		//Add the sheet to Iterator
		Iterator iterator = sheet.iterator();
		
		//Checking Iterator have another record and then go inside and get the row
		  
		while (iterator.hasNext())
		{
			//Adding row to Iterator 
			XSSFRow row=(XSSFRow) iterator.next();
			
			Iterator celliterator = row.cellIterator();
			
			while(celliterator.hasNext())
			{
			XSSFCell cell=(XSSFCell) celliterator.next();
			
			switch(cell.getCellType())
			{
			case STRING: System.out.print(cell.getStringCellValue()); break;
			case NUMERIC: System.out.print(cell.getNumericCellValue());break;
			case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
			}
			
			System.out.print(" - ");
			}
			
			System.out.println();
		}
*/
	}

}
