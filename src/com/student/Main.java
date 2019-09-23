package com.student;

/**
 * 实现类 测试代码
 * @author anneli
 * @date 2019年9月23日 下午3:04:38 
 *
 */
public class Main {
	
	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Student zhangsan = new Student(20192301, "zhangsan", 88, 55, 88);
		Student zhangsan1 = new Student(20192302, "wangwu", 66, 66, 55);
		Student zhangsan2 = new Student(20192303, "xiaoming", 55, 66, 77);
		Student zhangsan3 = new Student(20192304, "lige", 55, 55, 59);
		
		StudentList stdList = new StudentList();
		stdList._add(zhangsan);
		stdList._add(zhangsan1);
		stdList._add(zhangsan2);
		stdList._add(zhangsan3);
		
		stdList.print();
		stdList.query("ing");
		stdList.fail();
	}
	
}
