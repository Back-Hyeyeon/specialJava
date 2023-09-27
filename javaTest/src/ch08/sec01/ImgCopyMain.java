package ch08.sec01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImgCopyMain {

	public static void main(String[] args) throws IOException {
		FileInputStream fio = new FileInputStream("c:\\javaTest10\\ing.jpg");
		FileOutputStream fos = new FileOutputStream("c:\\javaTest10\\back.jpg");

		int data = 0;
		while ((data = fio.read()) != -1) {
//			int data = fio.read();
			if (data == -1) {
				break;
			}
			fos.write(data);
		}
		fio.close();
		fos.close();
		System.out.printf("복사 완");
	}
}
