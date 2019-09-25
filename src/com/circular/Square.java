package com.circular;

/**
 * 正方形类
 * @author anneli
 * @date 2019年9月25日 下午5:20:17 
 *
 */
public class Square extends Graphical{

	private double Width;
	
	public double getWidth() {
		return Width;
	}

	public void setWidth(double width) {
		Width = width;
	}

	public Square() {
	}
	
	public Square(String color,String isFill,double width) {
		super(color,isFill);
		this.Width = width;
	}

	@Override
	public void getFigureArea() {
		System.out.println("正方形面积："+Width*Width);
		
	}

	@Override
	public void getFigureCirs() {
		System.out.println("正方形周长："+4.0*Width);
		
	}

	@Override
	public String toString() {
		return "Square [Width=" + Width + ", getColor()=" + getColor() + ", isFill()=" + isFill() + "]";
	}

	

}
