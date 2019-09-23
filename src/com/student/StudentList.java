package com.student;
import java.util.ArrayList;

/**
 * 学生表 实现学生表的增删查找
 * @author anneli
 *
 */
public class StudentList {
	private ArrayList<Student> stdList = new ArrayList<Student>();

	/**
	 * 增加学生到学生表
	 * @param std 学生对象
	 */
	public void _add(Student std) {
		stdList.add(std);
	}
	
	/**
	 * 按内容查询 模糊查询 输出查询到的学生姓名和成绩
	 * @param value 查询内容
	 */
	public void query(String value) {
		for (int i = 0; i < stdList.size(); i++) {
			if (stdList.get(i).getName().contains(value)) {
				System.out.println("姓名："+stdList.get(i).getName()+" 英语成绩："+stdList.get(i).getEnglish()+" 高数成绩："+stdList.get(i).getHighNumber()+" 体育成绩："+stdList.get(i).getSport());
			}
		}
		System.out.println();
	}
	
	/**
	 * 输出学生表的详细信息
	 */
	public void print() {
		for (int i = 0; i < stdList.size(); i++) {
			System.out.println("学号："+stdList.get(i).getSno()+" 姓名："+stdList.get(i).getName()+" 英语成绩："+stdList.get(i).getEnglish()+" 高数成绩："+stdList.get(i).getHighNumber()+" 体育成绩："+stdList.get(i).getSport());
		}
		System.out.println();
	}
	
	/**
	 * 查询不及格的学生并输出
	 */
	public void fail() {
		int people = 0;
		System.out.print("英语成绩不及格的有：");
		for (int i = 0; i < stdList.size(); i++) {
			if (stdList.get(i).getEnglish()<60) {
				System.out.print(stdList.get(i).getName()+" ");
				people++;
			}
		}
		System.out.print("总共有"+people+"人\n");
		
		people = 0;
		System.out.print("高数成绩不及格的有：");
		for (int i = 0; i < stdList.size(); i++) {
			if (stdList.get(i).getHighNumber()<60) {
				System.out.print(stdList.get(i).getName()+" ");
				people++;
			}
		}
		System.out.print("总共有"+people+"人\n");
		
		people = 0;
		System.out.print("体育成绩不及格的有：");
		for (int i = 0; i < stdList.size(); i++) {
			if (stdList.get(i).getSport()<60) {
				System.out.print(stdList.get(i).getName()+" ");
				people++;
			}
		}
		System.out.print("总共有"+people+"人\n");
		
		System.out.println();
	}
}


