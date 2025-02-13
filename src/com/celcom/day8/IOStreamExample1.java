package com.celcom.day8;

import java.io.FileReader;

public class IOStreamExample1 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:\\JAVA TRAINING\\MY_PROJECT\\src\\com\\celcom\\day8\\Example.txt");
		int ch = 0;
		while((ch = fr.read())!=-1)
		{
			System.err.print((char)ch);
		}
		fr.close();
	}

}
