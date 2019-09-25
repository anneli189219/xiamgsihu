package com.circular;

/**
 * 抽象图形类
 * 
 * @author anneli
 * @date 2019年9月25日 下午4:44:54
 *
 */
public abstract class Graphical {
	private String Color;// 颜色
	private String isFill;// 是否填充

	public Graphical(String color,String isFill) {
		this.Color=color;
		this.isFill=isFill;
	}
	
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String isFill() {
		return isFill;
	}

	public void setFill(String isFill) {
		this.isFill = isFill;
	}

	public Graphical() {
	}

	@Override
	public String toString() {
		return "图形属性 [Color=" + Color + ", isFill=" + isFill + "]";
	}

	/**
	 * 获得图形面积
	 */
	public abstract void getFigureArea();

	/**
	 * 获得图形周长
	 */
	public abstract void getFigureCirs();

}
