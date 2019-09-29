package com.dxc;

/**
 * 
 * <p>Title: WindowTicket</p>  
 * <p>Description:例子实现三个窗口卖票，总票数为100张<实现Runnable>同步方法 </p>  
 * @author  王鹏帆  
 * @date  2019年9月28日
 */
public class WindowTickets implements Runnable{
	/*
	 * 多个线程必须共用同一把锁
	 * 使用同步方法解决线程安全问题
	 * 同步方法仍然会涉及到同步监视器，只是不需要我们显示声明
	 * 1.非静态的同步方法，同步监视器是this
	 * 2.静态的同步方法，同步监视器是当前类本身
	 */
	private  int ticket=10;
	
	@Override
	public void run() {
		while(true){
			show();
		}

	}
	//synchronized修饰需要同步的方法代码
	public synchronized void show(){
		if(ticket>0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":卖票，票号为"+ticket);
			ticket--;
		}
			
		
	}
		
		
		

	

}
