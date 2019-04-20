package IOTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/** 
* @author 作者 justdoit1995: 
* @version 创建时间：2019年4月20日 下午5:28:36 
* 类说明 
*/
public class test {
	public static void main(String[] args) throws IOException {
		File f = new File("f:" + File.separator + "test.txt");
		OutputStream out = new FileOutputStream(f);// 如果文件不存在会自动创建
		String str = "Hello World";
		byte[] b = str.getBytes();
		out.write(b);// 因为是字节流，所以要转化成字节数组进行输出
		out.close();
	}

}
