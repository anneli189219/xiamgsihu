package com.file;

import java.io.File;

/**
 * <p>
 * Title: ListFilesTest
 * </p>
 * <p>
 * Description: 遍历指定目录所有文件名称，包括子文件目录中的文件。 补充：删除指定文件目录及其下的所有文件
 * </p>
 * 
 * @author wpf
 * @date 2019年9月28日
 * 
 *
 */

public class ListFilesTest {

	public static void main(String[] args) {
		// 递归:文件目录
		/** 打印出指定目录所有文件名称，包括子文件目录中的文件 */
		// 1.创建目录对象
		File dir = new File("D:\\teach");
		// 2.打印目录的子文件
		printSubFile(dir);
		//第二种方式
		listSubFiles(dir);
		listAllSubFiles(dir);
		deleteDirectory(dir);
	}

	public static void printSubFile(File dir) {
		// 打印目录的子文件
		File[] subfiles = dir.listFiles();
		for (File f : subfiles) {
			if (f.isDirectory()) {// 文件目录
				printSubFile(f);
			} else {// 文件
				System.out.println(f.getAbsolutePath());
			}

		}
	}
/***********************************************************/
	// 方式二：循环实现
	// 列出file目录的下级内容，仅列出一级的话
	// 使用File类的String[] list()比较简单
	public static void listSubFiles(File file) {
		if (file.isDirectory()) {
			String[] all = file.list();
			for (String s : all) {
				System.out.println(s);
			}
		} else {
			System.out.println(file + "是文件！");
		}
	}

	// 列出file目录的下级，如果它的下级还是目录，接着列出下级的下级，依次类推
	// 建议使用File类的File[] listFiles()
	public static void listAllSubFiles(File file) {
		if (file.isFile()) {
			System.out.println(file);
		} else {
			File[] all = file.listFiles();
			// 如果all[i]是文件，直接打印
			// 如果all[i]是目录，接着再获取它的下一级
			for (File f : all) {
				listAllSubFiles(f);// 递归调用：自己调用自己就叫递归
			}
		}
	}

	// 补充：删除指定的目录
	public static void deleteDirectory(File file) {
		// 如果file是文件，直接delete
		// 如果file是目录，先把它的下一级干掉，然后删除自己
		if (file.isDirectory()) {
			File[] all = file.listFiles();
			// 循环删除的是file的下一级
			for (File f : all) {// f代表file的每一个下级
				deleteDirectory(f);
			}
		}
		// 删除自己
		file.delete();
	}

}
