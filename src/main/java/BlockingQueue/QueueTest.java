package BlockingQueue;
/** 
* @author 作者 justdoit1995: 
* @version 创建时间：2019年4月20日 上午11:14:57 
* 类说明 
*/
public class QueueTest {
	public static void main(String[] args) { 
		final SimpleBlockingQueue sbq = new SimpleBlockingQueue(); 
		Thread t1 = new Thread(){ 
			public void run() { 
				try { sbq.add(1); 
				Thread.sleep(1000); 
				sbq.add(2); 
				} catch (InterruptedException e) { 
					e.printStackTrace(); 
					} 
				} 
			}; 
			Thread t2 = new Thread(){ 
				public void run() { 
					try { 
						while (true){ 
						Integer item = sbq.take(); 
						} 
					} catch (InterruptedException e) { 
						e.printStackTrace(); 
						} 
					} 
				}; 
				t2.start(); 
				try { 
					Thread.sleep(5000); 
				} catch (InterruptedException e) { 
					e.printStackTrace(); 
					} 
				t1.start(); 
	}
	
}
