package IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/** 
* @author 作者 justdoit1995: 
* @version 创建时间：2019年4月20日 下午5:35:42 
* 类说明 
*/
public class test4 {
	public static void main(String[] args) throws IOException {
		          File f = new File("f:" + File.separator+"test.txt");
		          InputStream in=new FileInputStream(f);
		         byte[] b=new byte[(int) f.length()];
		         in.read(b);
		         in.close();
		         System.out.println(new String(b));
		     }

}
