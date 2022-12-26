package practice;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Chapter19_5 {
	public static void main(String[] args) throws IOException{
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write(0x41);//A
		bos.write(0x42);//B
		bos.write(0x43);//C
		byte[] data = bos.toByteArray();
		//dataは「0x41,0x42,0x43」が入った要素数3のbyte型配列
		for (byte b:data) {
			System.out.println(Integer.toHexString(b) + " ");
		}
	}
}
