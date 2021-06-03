package co.yedam.app.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileCopyTest {
	
	public static void main(String[] args) {
		//파일복사
		try {
			FileInputStream fis = new FileInputStream("d:/temp/image.png");
			FileOutputStream fos = new FileOutputStream("d:/temp/image2.png");
			byte[] b = new byte[1024];
			int cnt2 = 0;
			while(true) {
				cnt2 += 1;
				System.out.println(cnt2);
				int cnt = fis.read(b);
				if (cnt == -1) break;
				fos.write(b);
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
