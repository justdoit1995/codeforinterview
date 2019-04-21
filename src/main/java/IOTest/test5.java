package IOTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test5 {
	public static void main(String[] args) throws IOException {
		String url = "e:"+"\\"+"license"+"."+"txt";
		File file = new File(url);
		FileInputStream in = new FileInputStream(file);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		for(int i=0;i<5;i++) {
			if(reader.ready()) {
				int tmp=in.read();
				System.out.printf("%d:%c\n",i,tmp);
			}
		}
		//读取五个字符
		char[] buf = new char[5];
		reader.read(buf,0,5);
		System.out.println(String.valueOf(buf));
		System.out.println(reader.readLine());
	}
}
