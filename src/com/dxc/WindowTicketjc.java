package com.dxc;

/**
 * 
 * <p>Title: WindowTicket</p>  
 * <p>Description:例子实现三个窗口卖票，总票数为100张<继承Thread> </p>  
 * @author  王鹏帆  
 * @date  2019年9月28日
 */
public class WindowTicketjc extends Thread{
	/*
	 * 多个线程必须共用同一把锁
	 * 使用继承Thread方式时，慎用this充当同步监视器，考虑使用当前类充当同步监视器，注意唯一性；
	 *  
	 */
	private static int ticket=10;
	private static Object obj=new Object();

	
	@Override
	public void run() {
		while(true){
			//睡眠状态？怎么会影响线程数呢？
			//synchronized(*.class)
			synchronized(obj){
				if(ticket>0){
				
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+":卖票，票号为"+ticket);
					ticket--;
				}else{
					break;
				}
				
			}
			
			
		}

			
			
	}
		
		
		

	

}
