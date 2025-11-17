package org.d_four;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreate {
	
	public static void main(String[] args) throws IOException 
{
	File f=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven1\\jacky\\Rock.xlsx");
	
	boolean fi = f.createNewFile();
	System.out.println(fi);
	
	FileOutputStream jk=new FileOutputStream (f);
	
	Workbook ktr=new XSSFWorkbook ();
	
	Sheet one = ktr.createSheet("First Sheet");
	
	Row two = one.createRow(0);
	
	Cell three = two.createCell(0);
	
	three.setCellValue("Lion");
	
	ktr.write(jk); //-------->workbook variable (fileoutput)
	
	//--create file, create row, create cell, set cell value, merge workbook+fileoutputstream
	
	Sheet ek = ktr.getSheetAt(0);
	
	Row tho = ek.getRow(0);
	
	Cell theen = tho.getCell(0);
	
	String saar = theen.toString();
	System.out.println(saar);              //---> saar and panch are same
	
	String panch = theen.getStringCellValue();
	System.out.println(panch);
	
	if (saar.equals("Lion")) {
		theen.setCellValue("Lions");
	}
	
	String che = theen.toString();
	System.out.println(che);
	
	//--here set or update the cell.
	
	
	
	

}

}
