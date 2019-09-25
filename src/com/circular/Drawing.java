package com.circular;

/**
 * 画板类 生成图形并打印
 * @author anneli
 * @date 2019年9月25日 下午5:20:31 
 *
 */
public class Drawing {
	
	public static void main(String[] args) {
		Circular circular = new Circular("绿色","填充",3.0);//圆形
		Rectangle rectangle =new Rectangle("红色","无填充",10.0,5.0);//长方形
		Square square = new Square("黄色","无填充",4.0);//正方形
		
		circular.getFigureArea();
		circular.getFigureCirs();
		
		rectangle.getFigureArea();
		rectangle.getFigureCirs();
		
		square.getFigureArea();
		square.getFigureCirs();
		
		System.out.println(circular);
		System.out.println(rectangle);
		System.out.println(square);
	}

}
