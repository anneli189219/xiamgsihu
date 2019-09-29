package com.dxc;

public class Thread2 extends Thread{
	@Override
	public void run() {
		//实现该线程的作用
		for(int i=0;i<100;i++){
			if(i%2!=0){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
		
	}

}
