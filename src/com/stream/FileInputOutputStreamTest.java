package com.stream;

import java.io.*;


public class FileInputOutputStreamTest {
	/*
	 * 测试FileInputStream和FileOutputStream的使用
	 *
	 * 结论： 
	 * 1. 对于文本文件(.txt,.java,.c,.cpp)，使用字符流处理 
	 * 2. 对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt,...)，使用字节流处理
	 */

	// 使用字节流FileInputStream处理文本文件，可能出现乱码。
	public static void main(String[] args) {
		testFileInputStream();
		testFileInputOutputStream();
		//copyFile(, );
		
	}

	public static void testFileInputStream() {
		FileInputStream fis = null;
		try {
			// 1.创建文件
			File file = new File("hello.txt");

			// 2.创建文件流
			fis = new FileInputStream(file);

			// 3.读数据
			byte[] buffer = new byte[5];
			int len;// 记录每次读取的字节的个数
			while ((len = fis.read(buffer)) != -1) {

				String str = new String(buffer, 0, len);
				System.out.print(str);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				// 4.关闭资源
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

	}

	/*
	 * 实现对图片的复制操作
	 */

	public static void testFileInputOutputStream() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//
			File srcFile = new File("ACID.png");
			File destFile = new File("ACID1.png");

			//
			fis = new FileInputStream(srcFile);
			fos = new FileOutputStream(destFile);

			// 复制的过程
			byte[] buffer = new byte[5];
			int len;
			while ((len = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				//
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

	}

	// 指定路径下文件的复制
	public static void copyFile(String srcPath, String destPath) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//
			File srcFile = new File(srcPath);
			File destFile = new File(destPath);

			//
			fis = new FileInputStream(srcFile);
			fos = new FileOutputStream(destFile);

			// 复制的过程
			byte[] buffer = new byte[1024];
			int len;
			while ((len = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				//
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

	}

 
}
