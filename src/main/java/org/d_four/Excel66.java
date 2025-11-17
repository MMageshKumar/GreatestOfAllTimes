package org.d_four;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel66 { //-------> For Get values from Excel 

	public static void main(String[] args) throws IOException  {
		
		File f = new File ("C:\\Users\\LENOVO\\eclipse-workspace\\Maven1\\jacky\\Rock.xlsx");
//		boolean fc= f.createNewFile();
//		System.out.println(fc);
		
		FileInputStream b=new FileInputStream (f);
		
	    Workbook v=new XSSFWorkbook (b) ;  //---> introducing new,Interface & Parameterised constructor 
		
		Sheet Sh1 = v.getSheet("First Sheet");
		
		Row RO1 = Sh1.getRow(2);
		
		Cell cll = RO1.getCell(1);
		
		System.out.println(cll);
		
		int ROW = Sh1.getPhysicalNumberOfRows();  //---> these also new things
		System.out.println(ROW);
		
		int CELL = RO1.getPhysicalNumberOfCells();
		System.out.println(CELL);
		
		System.out.println("----------------------");

//		for (int i = 0; i <ROW; i++) 
//		{
//			Row bl = Sh1.getRow(i);
//			
//			for (int j = 0; j <CELL ; j++) 
//			{
//				Cell ml = bl.getCell(j);
//				System.out.println(ml);
//			}}
		
		
		
		for (int i = 0; i < ROW; i++)
		{		
		Row bl = Sh1.getRow(i);
		System.out.println("	");
		
		for (int j = 0; j < CELL; j++) 
		{
			Cell ml = bl.getCell(j);
			//System.out.println(ml);
		
		int one = ml.getCellType();  //---> Cell type finder here.
		//System.out.println(one);
		
		
		if (one==1)
		{
			String wahid = ml.getStringCellValue(); //---------------------------------
			System.out.println(wahid);
		}else 
		{
			if(DateUtil.isCellDateFormatted(ml)) 
		{
			Date itnan = ml.getDateCellValue();  //-------------------------------------
			
			SimpleDateFormat tl=new SimpleDateFormat ("dd.MM.YYYY");
			String tn = tl.format(itnan);
			
			System.out.println(tn);
		}else 
		{
			double thalatha = ml.getNumericCellValue();  //------------------------------
			int jk= (int) thalatha;
			
			String hbk = String.valueOf(jk);
			
			System.out.println(hbk);
		}
		}
		}
	    }
	
		
		
		
		
		
		
		
		
		
		
	}

}
