package com.dxc;
/**
 * 
 * <p>Title: Thread1</p>  
 * <p>Description:创建两个分线程，其中一个遍历100以内的偶数，另一个遍历100以内的奇数 </p>  
 * @author  王鹏帆  
 * @date  2019年8月14日
 */
public class Thread1 extends Thread{
	/*
	 * 创建多线程方式一:继承Thread类
	 * 1.创建一个继承于Thread类的子类
	 * 2.重写Thread类中的run()方法(此线程所做的操作)
	 * 3.创建该子类对象
	 * 4.调用start()方法
	 */
	@Override
	public void run() {
		//实现该线程的作用
		for(int i=0;i<100;i++){
			if(i%2==0){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
		
	}
	/*
	 * 线程优先级
	 * 时间片策略、抢占式策略
	 * MAX_PRIORITY 10
	 * MIN_PRIORITY 1
	 * NORM_PRIORITY 5
	 * getPriority()
	 * setPriority(int size)
	 */
	

}
