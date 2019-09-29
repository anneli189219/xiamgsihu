package com.dxc;
/**
 * 
 * <p>Title: WindowTicket</p>  
 * <p>Description:例子实现三个窗口卖票，总票数为100张<实现Runnable> </p>  
 * @author  王鹏帆  
 * @date  2019年9月28日
 */
public class WindowTicket implements Runnable{
	/*
	 * 1.怎样理解线程安全问题？
	 * 多个线程操作共享数据时，会出现线程安全。
	 * 在run()方法中添加sleep()是为了增加出现错票与重票的概率；
	 * 注：测试程序是否会出现错误与程序本身存在错误无关，尽管有百分之一的概率出现错误也不行；
	 * 2.问题出现的原因？
	 * 当某个线程操作车票的过程中，尚未完成时其他线程参与进来操作车票。
	 * 3.如何解决？
	 * 当一个线程在操作ticket的过程中，其他线程不能参与进来，直到该线程操作完之后其他线程才能操作；
	 * 这种情况即使线程出现阻塞，也无法被改变。
	 * 4.在Java中，通过同步机制来解决线程安全问题
	 * 方式一:同步代码块
	 *  synchronized(同步监视器){
	 *  	//需要被同步的代码(包含代码不能多也不能少)
	 *  	this/当前类
	 *  }
	 *  说明：操作共享数据的代码即为需要被同步的代码
	 *  共享数据：多个线程共同操作的变量，ticket即为共享数据；
	 *  同步监视器：俗称锁，任何一个类的对象都可；多个线程必须共用同一把锁。
	 *  
	 *  方式二：同步方法
	 *   如果操作共享数据刚好声明在一个方法中
	 *  5.同步的好处
	 *  解决了线程安全问题；
	 *  操作同步代码时只能有一个线程参与，其他线程等待，相当于是一个单线程的过程，效率比较低。
	 *  
	 *  
	 */
	private int ticket=100;
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			synchronized(this){
				if(ticket>0){
					System.out.println(Thread.currentThread().getName()+":卖票，票号为"+ticket);
					ticket--;
				}else{
					break;
				}
				
			}
			
			
		}
		
		
	}
	

}
