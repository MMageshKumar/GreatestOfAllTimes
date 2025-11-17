package org.c_three;

import java.io.File;

public class FileOpr {

	public static void main(String[] args)
	{

		File hr=new File ("C:\\Users\\LENOVO\\eclipse-workspace\\MavenOne\\CenaFolder");
		
		boolean check1 = hr.mkdir();
		System.out.println(check1);

	}

}
