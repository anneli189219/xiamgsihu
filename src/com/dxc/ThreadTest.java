package com.dxc;

public class ThreadTest {
	/*
	 * 主线程测试类
	 * 测试Thread类常用的方法：
	 * 1.start():启动当前线程，调用当前线程的run方法
	 * 2.run():通常需要重写Thread类中的此方法，将创建的线程所做的操作声明到此方法中
	 * 3.currentThread():静态方法，返回执行当前代码的线程
	 * 4.getName():获取当前线程的名字
	 * 5.setName():设置当前线程的名字，也可以通过构造方法
	 * 6.yield():释放当前cpu的执行权
	 * 7.join():在线程a中调用线程b的join()方法，此时线程a就进入阻塞状态，直到线程b完全执行完
	 *          以后，线程a才结束阻塞状态。
	 * 8.stop():已过时，执行该方法时，强制结束当前线程
	 * 9.isAlive():判断当前线程是否存活
	 * 10.sleep(时间毫秒):让当前线程处于睡眠状态
	 */
	public static void main(String[] args) {
//		testThread();
//		testRun();
//		testTicket();
//		testTickets();
		testTicketjc();
//		testTicketjcs();
		System.out.println(Thread.currentThread().getName()+"我爱你中国");
	}
	//实现卖票问题，使用继承Thread(同步方法)
	public static void testTicketjcs() {
		WindowTicketjcs w1 = new WindowTicketjcs();
		w1.start();
		WindowTicketjcs w2=w1;
		w2.start();
		WindowTicketjcs w3=w1;
		w3.start();
	}
	//实现卖票问题，使用实现Runnable接口(同步方法)
	public static void testTickets() {
		WindowTickets wt=new WindowTickets();
		Thread t1=new Thread(wt);
		Thread t2=new Thread(wt);
		Thread t3=new Thread(wt);
		t1.start();
		t2.start();
		t3.start();
		
	}
	//实现卖票问题，使用继承Thread
	public static void testTicketjc() {
		WindowTicketjc w1=new WindowTicketjc();
		w1.start();
		WindowTicketjc w2=new WindowTicketjc();
		w2.start();
		WindowTicketjc w3=new WindowTicketjc();
		w3.start();
		
		
		
	}
	//实现卖票问题，使用实现Runnable接口
	public static void testTicket() {
		WindowTicket wt=new WindowTicket();
		Thread t1=new Thread(wt);
		Thread t2=new Thread(wt);
		Thread t3=new Thread(wt);
		t1.start();
		t2.start();
		t3.start();
		
	}
	//测试继承Thread方式
	public static void testThread(){
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 t2=new Thread2();
		t2.start();
	}
	//测试实现Runnable接口方式
	public static void testRun(){
		Thread3 t3=new Thread3();
		Thread t=new Thread(t3);
		t.setName("线程1");
		t.start();
		Thread t1=new Thread(t3);
		t1.setName("线程2");
		t1.start();
	}

}
