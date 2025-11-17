package org.d_four;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ZEnterTheText {

	public static void main(String[] args) throws IOException {
		
		FileWriter FW=new FileWriter ("C:\\Users\\LENOVO\\eclipse-workspace\\JavaFour\\"
				+ "FileWriterr\\one.txt");
		BufferedWriter BW=new BufferedWriter (FW);
		
		BW.write("Allah akbar");
		
		BW.close();

	}

}
