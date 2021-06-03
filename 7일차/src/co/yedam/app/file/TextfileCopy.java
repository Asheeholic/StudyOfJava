package co.yedam.app.file;

import java.io.FileReader;
import java.io.FileWriter;

public class TextfileCopy {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("d:/temp/data.txt"); // 파일 위치 동일하게 만들어보고 ㄱ
			FileWriter fw = new FileWriter("d:/temp/data2.txt");
			
			char[] c = new char[100];
			while(true) {
				int cnt = fr.read(c);
				if ( cnt == -1 ) break;
				fw.write(c);
			}
			fr.close();
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
