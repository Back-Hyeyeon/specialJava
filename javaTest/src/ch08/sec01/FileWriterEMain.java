package ch08.sec01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEMain {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:/javaTest10/javaTest.txt");
			while(true) {
				String inpouData = sc.nextLine();
				if(inpouData.length() == 0) {
					break;
				}
				fw.write(inpouData, 0, inpouData.length());
				fw.write("\r\n",0,2);
			}
		}  catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
		fw.close();
		System.out.printf("end");
	}
	

}
