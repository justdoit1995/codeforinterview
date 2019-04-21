package IOTest;

import java.io.File;

/**
 * 
 * @author Jack
 *递归读取文件夹的文件demo
 */
public class ListFileDemo {
	public static void main(String[] args) {
		listFile("D:\\BaiduBrowser");
	}
	public static void listFile(String path) {
		if(path==null) {
			return;
		}
		File[] files = new File(path).listFiles();
		if(files==null) {
			return;
		}
		for(File file:files) {
			if(file.isFile()) {
				System.out.println(file.getName());
			}else if(file.isDirectory()) {
				System.out.println("Directory:"+file.getName());
				listFile(file.getPath());
			}else {
				System.out.println("error");
			}
		}
	}
}
