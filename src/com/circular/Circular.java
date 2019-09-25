package com.circular;

/**
 * 圆形类
 * @author anneli
 * @date 2019年9月25日 下午5:19:43 
 *
 */
public class Circular extends Graphical {
	private double Radius;

	public Circular() {
	}
	
	public double getRadius() {
		return Radius;
	}

	public void setRadius(double radius) {
		Radius = radius;
	}

	public Circular(String color,String isFill,double radius) {
		super(color,isFill);
		this.Radius=radius;
	}
	
	@Override public void getFigureArea() {
		System.out.println("圆形面积："+Radius*Radius*Math.PI);

	}

	@Override
	public void getFigureCirs() {
		System.out.println("圆形面积："+Radius*2.0*Math.PI);

	}

	@Override
	public String toString() {
		return "Circular [Radius=" + Radius + ", getColor()=" + getColor() + ", isFill()=" + isFill() + "]";
	}

	

}
