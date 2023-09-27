package ch08.sec01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		try {
			FileReader fin = new FileReader("C:\\javaTest10\\javaTest.txt");
			while(true) {
				int data = fin.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
			
		}  catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("end");
	}
}
