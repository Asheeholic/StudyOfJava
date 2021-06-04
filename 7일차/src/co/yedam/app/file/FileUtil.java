package co.yedam.app.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileUtil {
	
	public static void copy(String src, String des) {
		//파일복사
		try {
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(des);
			byte[] b = new byte[4];
			//int cnt2 = 0;
			while(true) {
				//cnt2 += 1;
				//System.out.println(cnt2);
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
