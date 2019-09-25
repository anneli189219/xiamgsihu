package com.student;
/**
 * 学生类 保存学生的基本信息
 * @author anneli
 *
 */
public class Student {
	private int Sno;
	private String Name;
	private int English;
	private int HighNumber;
	private int Sport;
	public static int c;
	
	
	
	public Student() {
		super();
		c++;
		// TODO Auto-generated constructor stub
	}

	/**
	 * 构造方法 初始化信息
	 * @param Sno 学号
	 * @param Name 姓名
	 * @param English 英语成绩
	 * @param HighNumber 高数成绩
	 * @param Sport 体育成绩
	 */
	public Student(int Sno,String Name,int English,int HighNumber,int Sport) {
		// TODO Auto-generated method stub
		this.Sno = Sno;
		this.Name = Name;
		this.English = English;
		this.HighNumber = HighNumber;
		this.Sport = Sport;
	}

	public int getSno() {
		return Sno;
	}

	public void setSno(int sno) {
		Sno = sno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public int getHighNumber() {
		return HighNumber;
	}

	public void setHighNumber(int highNumber) {
		HighNumber = highNumber;
	}

	public int getSport() {
		return Sport;
	}

	public void setSport(int sport) {
		Sport = sport;
	}

	@Override
	public String toString() {
		return "Student [Sno=" + Sno + ", Name=" + Name + ", English=" + English + ", HighNumber=" + HighNumber
				+ ", Sport=" + Sport + "]";
	}
	
}
