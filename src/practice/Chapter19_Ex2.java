package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Chapter19_Ex2 {
	public static void main(String[] args) {
		// ファイルを開き、loadメソッドでプロパティを読み込む
		try (FileReader fr = new FileReader("C:\\pleiades\\workspace\\personal.properties")) {
			Properties p = new Properties();
			p.load(fr);

			// 各設定内容を出力
			System.out.println(p.getProperty("name"));
            System.out.println(p.getProperty("age"));
            System.out.println(p.getProperty("gender"));

			// 例外処理を記述
			// printStackTraceで例外を出力
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありませんでした");
			// printStackTraceで例外を出力
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}