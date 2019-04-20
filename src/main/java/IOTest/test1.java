package IOTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/** 
* @author 作者 justdoit1995: 
* @version 创建时间：2019年4月20日 下午5:31:02 
* 类说明 
*/
public class test1 {
	public static void main(String[] args) throws IOException {
		File f = new File("f:" + File.separator + "test1.txt");
		OutputStream out = new FileOutputStream(f,true);// 如果文件不存在会自动创建
		String str = "Hello World";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out.close();
	}

}
