package co.yedam.app.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void fileCreate() throws IOException {
		File file = new File("d:/temp/diary.txt");
		boolean result = file.createNewFile();
		System.out.println(result);
	}
	
	private static void makeFolder() {
		File file = new File("d:/temp/images");
		file.mkdir();
	}
	
	private static void fileInfo() {
		File file = new File("d:/temp/image.png");
		System.out.println("파일크기" + file.length());
		System.out.println("파일이름" + file.getName());

	}

	private static void folderList() {
		File file = new File("d:/temp");
		if ( file.isDirectory() ) {
			File[] list = file.listFiles();
			for(File i : list) {
				if(StringUtil.getExtention(i.getName()).equals("png")) {
					System.out.println(i.getName());
					FileUtil.copy(i.getAbsolutePath(), "d:/temp/images/"+i.getName());
				}
			}
		}
	}
		
	public static void main(String[] args) throws IOException {
		//fileCreate();
		//makeFolder();
		//fileInfo();
		folderList();
		
	}


}
