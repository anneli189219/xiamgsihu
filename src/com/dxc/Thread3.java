package com.dxc;
/**
 * 
 * <p>Title: Thread3</p>  
 * <p>Description: </p>  
 * @author  王鹏帆  
 * @date  2019年8月14日
 */
public class Thread3 implements Runnable{
	/*
	 * 创建多线程方式二:实现Runnable接口
	 * 1.创建一个实现Runnable接口的类
	 * 2.该类实现Runnable接口中的run()方法
	 * 3.实例化该类对象，并将此对象作为参数传递到Thread类的构造器中，然后创建Thread类对象
	 * 4.调用start()方法
	 */
	/*
	 * 比较创建多线程的两种方式异同
	 * 开发中优先选择实现Runnable接口方式(没有单继承局限性、更适合处理多个线程共享数据情况)
	 * 联系: public class Thread implements Runnable
	 * 相同点：
	 * 两种方式都需要重写run()方法，把线程需要执行的业务逻辑放到该方法中
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
	
	
}
