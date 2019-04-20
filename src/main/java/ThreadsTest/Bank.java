package ThreadsTest;
/** 
* @author 作者 justdoit1995: 
* @version 创建时间：2019年4月20日 上午10:26:20 
* 类说明 
*/
public class Bank {
	private int count =0;//账户余额  

	//还有一种方法，使用volatile关键字是不行的，因为他不能保证原子操作
	// private volatile int count = 0;
	
	//可重入锁 ReentrantLock
	
	//https://www.cnblogs.com/xiaoxi/p/7679470.html 参考这里
	
	private static ThreadLocal<Integer> count1 = new ThreadLocal<Integer>(){
		@Override
		protected Integer initialValue(){
			return 0;
		}
	};
	
    //存钱  
    public  synchronized void addMoney(int money){  
    	/*synchronized(this){*/  //同步代码块实现同步
    		count +=money; 
        //} 
        System.out.println(System.currentTimeMillis()+"存进："+money);  
    }  

    //取钱  
    public  synchronized void subMoney(int money){  
    	//synchronized(this){
	    	if(count-money < 0){  
	            System.out.println("余额不足");  
	            return;  
	        }  
	        count -=money; 
       // } 
        System.out.println(+System.currentTimeMillis()+"取出："+money);  
    }  

    //查询  
    public void lookMoney(){  
        System.out.println("账户余额："+count);  
    }  
}
