package com.student;

public class Main {
	
	public static void main(String[] args) {
		Student zhangsan = new Student(1, "zhangsan", 99, 88, 77);
		Student zhangsan1 = new Student(2, "zhangsan1", 22, 33, 22);
		Student zhangsan2 = new Student(3, "zhangsan2", 11, 44, 44);
		Student zhangsan3 = new Student(4, "zhangsan3", 22, 44, 55);
		
		StudentList stdList = new StudentList();
		stdList._add(zhangsan);
		stdList._add(zhangsan1);
		stdList._add(zhangsan2);
		stdList._add(zhangsan3);
		
		stdList.query("zhang");
	}
	
}
