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
				System.out.println("姓名："+stdList.get(i).getName()+" "+"成绩："+stdList.get(i).getEnglish()+" "+stdList.get(i).getHighNumber()+" "+stdList.get(i).getSport());
			}
		}
	}
}
