package com.circular;

/**
 * 类的描述
 * 
 * @author mopeiwen
 * @version 2019年9月25日 下午6:58:46
 */
public class Main {
	public static void main(String[] args) {
		Graphical[] graphicals = new Graphical[10];
		
		graphicals[0] = new Circular("红色","填充",3.0);
		graphicals[1] = new Circular("红色","填充",4.0);
		graphicals[2] = new Circular("红色","填充",5.0);
		
		graphicals[3] = new Rectangle("绿色","填充",3.0,4.0);
		graphicals[4] = new Rectangle("绿色","填充",2.0,6.0);
		graphicals[5] = new Rectangle("绿色","填充",3.0,5.0);
		
		graphicals[6] = new Square("蓝色","填充",1.0);
		graphicals[7] = new Square("蓝色","填充",2.0);
		graphicals[8] = new Square("蓝色","填充",3.0);
		graphicals[9] = new Square("蓝色","填充",4.0);
		
		Graphical graTest = null;
		
		for (int i = 0; i < graphicals.length; i++) {
			if (i==0) {
				graTest = graphicals[i];
			}
			else{
				if (graTest.compareTo(graphicals[i])==-1) {
					graTest = graphicals[i];
				}
			}
		}
		System.out.println(graTest.getFigureArea());
	}
}
