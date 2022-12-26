package practice;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Chapter19_Ex1 {
	public static void main(String[] args) throws IOException{
		/*
		Path inputPath = Path.of("C:\\pleiades\\workspace\\input.csv");
		String inputCsv = Files.readString(inputPath);
		String[] lines = inputCsv.split("\n");
		
		StringBuffer sb = new StringBuffer();
		for (String line : lines) {
			String[] items = line.split(",");
			sb.append(items[0]).append(",").append(items[6]).append("\n");
		}
		Files.writeString(Paths.get("C:\\pleiades\\workspace\\output.csv"), sb.toString());
		*/
		
		String allData = Files.readString(Paths.get("C:\\pleiades\\workspace\\input.csv"), StandardCharsets.UTF_8);

		String[] lines = allData.split("\n");
		StringBuffer sb = new StringBuffer();
		for (String line : lines) {
			String[] items = line.split(",");
			sb.append(items[0]).append(",").append(items[6]).append("\n");
		}
        Files.writeString(Paths.get("C:\\pleiades\\workspace\\output.csv"), sb.toString());
	}
}
