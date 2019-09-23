package com.mpw;

/**
 * 引用传值 两数交换
 * @author anneli
 * @date 2019年9月23日 下午3:39:00 
 *
 */
public class Swap {

	public static void swap(MyClass a, MyClass b) {
		int tmp = a.getNum();
		a.setNum(b.getNum());
		b.setNum(tmp);
	}

	public static void main(String[] args) {
		MyClass a = new MyClass(11);
		MyClass b = new MyClass(22);
		Swap.swap(a, b);
		System.out.println(a.getNum() + " " + b.getNum());
	}
}

class MyClass {
	int Num;
	
	public MyClass(int Num){
		this.Num = Num;
	}
		
	public int getNum() {
		return Num;
	}

	public void setNum(int tmp) {
		Num = tmp;
	}
}
