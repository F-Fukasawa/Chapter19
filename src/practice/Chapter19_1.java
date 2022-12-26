package practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Chapter19_1 {
	public static void main(String[] args) {
		/*
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\pleiades\\workspace\\test.txt", true);
			fw.write("あいうえお");
		} catch (IOException e) {
			System.out.println("エラーです");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		*/
		
		//try-with-resources
		//tryの後に()を書いて、その中でクローズすべきリソースを定義します。
		//こうすると、tryを抜ける際に自動的にクローズが呼ばれます。
		try (FileWriter fw = new FileWriter("C:\\pleiades\\workspace\\test.txt", true); FileReader fr = new FileReader("C:\\pleiades\\workspace\\test.txt")) {
		  fw.write("あいうえお");
		  int c;
		  while ((c = fr.read()) != -1) {
			System.out.print(c);
		  }
		} catch (IOException e) {
		  System.out.println("エラーです");
		  e.printStackTrace();
		}
	}
}
