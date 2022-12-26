package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Chapter19_4 {
	public static void main(String[] args) {
		// try-with-resourcesを使用
		try (FileInputStream fis = new FileInputStream("C:\\pleiades\\workspace\\test.txt")) {
			int c;
			while ((c = fis.read()) != -1) {
				// バイナリ値を16進数文字列に変換して出力
				System.out.print(Integer.toHexString(c));
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありませんでした");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}
}
