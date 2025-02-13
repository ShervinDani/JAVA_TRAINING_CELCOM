package com.celcom.day8;

import java.io.FileReader;
import java.io.FileWriter;

public class IOStreamExample2 {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("D:\\JAVA TRAINING\\MY_PROJECT\\src\\com\\celcom\\day8\\Example.txt");
		FileWriter fw = new FileWriter("D:\\JAVA TRAINING\\MY_PROJECT\\src\\com\\celcom\\day8\\Text.txt");
		
		int ch = 0;
		while((ch = fr.read()) != -1 )
		{
			fw.write(ch);
		}
		fw.close();
		fr.close();
		System.out.println("File Copied");
	}

}
