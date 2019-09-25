package com.circular;

/**
 * 长方形类
 * @author anneli
 * @date 2019年9月25日 下午5:20:06 
 *
 */
public class Rectangle extends Graphical {
	private double Width;
	private double Height;
	
	public double getWidth() {
		return Width;
	}

	public void setWidth(double width) {
		Width = width;
	}

	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}

	public Rectangle() {
		
	}
	
	public Rectangle(String color,String isFill,double width,double height) {
		super(color,isFill);
		this.Width = width;
		this.Height = height;
	}

	@Override
	public void getFigureArea() {
		System.out.println("长方形面积："+Width*Height);
		
	}

	@Override
	public void getFigureCirs() {
		System.out.println("长方形周长："+(2*Width+2*Height));
		
	}

	@Override
	public String toString() {
		return "Rectangle [Width=" + Width + ", Height=" + Height + ", getColor()=" + getColor() + ", isFill()="
				+ isFill() + "]";
	}
	
}
