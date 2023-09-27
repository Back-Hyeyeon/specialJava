package ch08.sec01;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

import org.xml.sax.InputSource;

public class FileinputStreaderMain {

	public static void main(String[] args) {
		try {

//			FileReader fin = new FileReader("C:/javaTest10/javaTest.txt");
			FileInputStream fin = new FileInputStream("C:/javaTest10/javaTest.txt");
			InputStreamReader isr = new InputStreamReader(fin);
			
			while(true) {
				int data = isr.read();
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
