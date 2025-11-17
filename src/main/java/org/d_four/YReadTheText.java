package org.d_four;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class YReadTheText {
	
	public static void main(String [] args) throws IOException {
		
		FileReader fr=new FileReader ("C:\\Users\\LENOVO\\eclipse-workspace"
				+ "\\JavaFour\\FileWriterr\\one.txt");
		
		BufferedReader bf=new BufferedReader (fr);
		
		String str = bf.readLine();
		
		System.out.println(str);
		bf.close();
		
	}

}
