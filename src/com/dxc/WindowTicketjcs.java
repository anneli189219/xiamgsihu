package com.dxc;

/**
 * 
 * <p>Title: WindowTicket</p>  
 * <p>Description:例子实现三个窗口卖票，总票数为100张<继承Thread> </p>  
 * @author  王鹏帆  
 * @date  2019年9月28日
 */
public class WindowTicketjcs extends Thread{
	/*
	 * 多个线程必须共用同一把锁
	 * 使用同步方法解决线程安全问题
	 *  
	 */
	private static int ticket=10;
	
	@Override
	public void run() {
		while(true){
			
			show();	
		}

	}
	//
	public synchronized static void show(){
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
