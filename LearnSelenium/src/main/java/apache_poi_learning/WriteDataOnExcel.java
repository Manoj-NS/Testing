package apache_poi_learning;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Create Workbook--Sheet--Rows--Cell

public class WriteDataOnExcel {
	
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();		
		
		XSSFSheet sheet = workbook.createSheet("EMP Info");
	/*	
		Object empdata [][] = { {"EmpNo","Name","Job","Phone"},
								{"202301","John","Supervisior","1236548510"},
								{"202302","Robert","Merch","1285248510"},
								{"202303","Raja","Driver","9632548510"},
								{"202304","Mohan","Manager","3658548510"}
		};					
			//Using FOR LOOP
		
			int rows = empdata.length;
			int cols= empdata[0].length;
			
			System.out.println("Total Rows: "+rows);
			System.out.println("Total Columns: "+cols);
			
			for(int r=0;r<rows;r++)
			{
				XSSFRow row=sheet.createRow(r);
				
				for(int c=0;c<cols;c++)
				{
					XSSFCell cell=row.createCell(c);
					
					Object value=empdata[r][c];
					
					if(value instanceof String)
						cell.setCellValue((String)value);
					if(value instanceof Integer)
						cell.setCellValue((Integer)value);
					if(value instanceof Boolean)
						cell.setCellValue((Boolean)value);

				}
			}
			
			String filepath=".\\DataFiles\\Forloop_Emp_Details.xlsx";
			FileOutputStream outstream = new FileOutputStream(filepath);
			workbook.write(outstream);
			
			outstream.close();
			
			System.out.println("For Loop: Emp_Details file created successfully");
		*/	
		
/*		
//Using for each Loop	
		int rowCount=0;
		
		for(Object emp[]:empdata) {
			
		XSSFRow	row=sheet.createRow(rowCount++);
			int columnCount=0;
			
			for(Object value:emp) 
			{
				XSSFCell cell=row.createCell(columnCount++);
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
			String filepath=".\\DataFiles\\ForEach_Emp_Details.xlsx";
			FileOutputStream outstream = new FileOutputStream(filepath);
			workbook.write(outstream);
			
			outstream.close();
			
			System.out.println("ForEach: Emp_Details file created successfully");
*/
		
		
//Using Array
		
		
	ArrayList<Object[]> empdata = new ArrayList<Object[]>();
	
	empdata.add(new Object []{"EmpNo","Name","Job","Phone"});
	empdata.add(new Object []{"202301","John","Supervisior","1236548510"});
	empdata.add(new Object []{"202302","Robert","Merch","1285248510"});
	empdata.add(new Object []{"202303","Raja","Driver","9632548510"});
	empdata.add(new Object []{"202304","Mohan","Manager","3658548510"});
	
	// Using for each loop
	
	int rownum=0;
	
	for(Object[] emp:empdata)
	{
		XSSFRow row=sheet.createRow(rownum++);
		int cellnum=0;
		
		for(Object value:emp)
		{
			XSSFCell cell=row.createCell(cellnum++);
			
			if(value instanceof String)
				cell.setCellValue((String)value);
			if(value instanceof Integer)
				cell.setCellValue((Integer)value);
			if(value instanceof Boolean)
				cell.setCellValue((Boolean)value);
				} 
			}
	
			String filepath=".\\DataFiles\\Array_Emp_Details.xlsx";
			FileOutputStream outstream = new FileOutputStream(filepath);
			workbook.write(outstream);
	
			outstream.close();
	
			System.out.println("Array: Emp_Details file created successfully");
	
		}
}