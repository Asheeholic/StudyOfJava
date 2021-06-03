package co.yedam.app.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

public class BufferTest {

	public static void main(String[] args) {
		try {
			BufferedReader fr = new BufferedReader( new FileReader("d:/temp/score.txt") );
			PrintStream out = System.out;
			String a;
			while(true) {
				a = fr.readLine();
				if ( a == null ) break;
				String[] score = a.split(" ");
				int b1 = Integer.parseInt(score[0]);
				int b2 = Integer.parseInt(score[1]);
				System.out.println(b1 + b2);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
