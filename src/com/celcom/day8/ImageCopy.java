package com.celcom.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopy {

	public static void main(String[] args) throws Exception{
		FileInputStream fr = new FileInputStream("D:\\JAVA TRAINING\\MY_PROJECT\\src\\com\\celcom\\day8\\Brook _ One Piece.jpg");
		FileOutputStream fw = new FileOutputStream("D:\\JAVA TRAINING\\MY_PROJECT\\src\\com\\celcom\\day8\\Brook1.jpg");
		
		int ch = 0;
		while((ch = fr.read()) != -1 )
		{
			fw.write(ch);
		}
		fw.close();
		fr.close();
		System.out.println("Image Copied");
	}

}
