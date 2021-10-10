package aram_FIleCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyProgram {
	public static void main(String[] args) throws IOException {
		FileInputStream original = null;
		FileOutputStream copy = null;

		original = new FileInputStream("C:\\Dev\\workspace\\20211010_FileCopy\\test.txt");
		copy = new FileOutputStream("C:\\Dev\\workspace\\20211010_FileCopy\\test2.txt");

		int readInt = 0;

		while (readInt != -1) {
			readInt = original.read();
			copy.write((char) readInt);
			
			
		}
		original.close();
		copy.close();
		
		System.out.println("복사 완료!");
	}

	{

	}
}
