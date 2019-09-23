package com.mpw;

/**
 * 输出99乘法表的4个方向
 * 
 * @author mopeiwen
 * @version 2019年9月19日 下午11:54:18
 */
public class ChengFaBiao {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i, j;
		// 左上
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=");
				System.out.printf("%-4d", i * j);// -+代表左右对齐
			}
			System.out.println();
		}
		System.out.println();// 空一行，方便看清
		// 左下
		for (i = 9; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=");
				System.out.printf("%-4d", i * j);
			}
			System.out.println();
		}
		// 右上
		for (i = 1; i <= 9; i++) {
			// 打印空格内容
			for (j = i; j < 9; j++) {
				System.out.print("\t");
			}

			// 打印空格之后的内容
			for (j = i; j > 0; j--) {
				// 判断输出值是否小于10 小于则加一个空格
				if ((i * j) < 10)
					System.out.print(" " + j + "*" + i + "=" + (i * j) + "\t");
				else
					System.out.print(+j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();// 空一行，方便看清
		// 右下
		for (i = 9; i > 0; i--) {
			// 打印空格内容
			for (j = 0; j < 9 - i; j++) {
				System.out.print("\t");
			}

			// 打印空格之后的内容
			for (j = i; j > 0; j--) {
				// 判断输出值是否小于10 小于则加一个空格
				if ((i * j) < 10)
					System.out.print(" " + j + "*" + i + "=" + (i * j) + "\t");
				else
					System.out.print(+j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}

	}

}
