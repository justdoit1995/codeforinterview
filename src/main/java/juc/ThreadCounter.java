package juc;


import java.util.concurrent.atomic.AtomicInteger;

//线程安全地实现一个计数器
public class ThreadCounter implements Runnable{
	private static AtomicInteger count = new AtomicInteger(0);

	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try{
				Thread.sleep(1);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			ThreadCounter.calc();
		}
		
	}
	
	public synchronized static void calc(){
		if(count.get()<1000){
			int c = count.incrementAndGet();
			System.out.println("线程："+Thread.currentThread().getName()+":"+c);
		}
	}

	public static void main(String[] args){
		for(int i=0;i<5;i++){
			ThreadCounter t = new ThreadCounter();
			Thread y = new Thread(t);
			y.start();
		}
	}
	
}

