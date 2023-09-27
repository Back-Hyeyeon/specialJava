package ch08.sec01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyMain {

	public static void main(String[] args) throws IOException {
		
		File src = new File("C:\\Windows\\system.ini");
		File test = new File("c:/javaTest10/mysystem.txt");
		
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(test);
		
		while(true) {
			int data = fr.read();
			if(data == -1) {
				break;
			}
			fw.write((char)data);
		}
		fr.close();
		fw.close();
		System.out.printf("%s에서 %s로 복사 완료",src.getName(),test.getName());
	}

}
