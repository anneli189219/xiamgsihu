package com.file;

import java.io.File;

/**
 * <p>Title: FindJpgFile</p>  
 * <p>Description: 判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称</p>  
 * @author  wpf  
 * @date  2019年9月28日
 * 
 *
 */
public class FindJpgFile {
	public static void main(String[] args) {
		test1();
		test2();
	}

	
	public static void test1(){
		File srcFile = new File("d:\\code");
		
		String[] fileNames = srcFile.list();
		for(String fileName : fileNames){
			if(fileName.endsWith(".jpg")){
				System.out.println(fileName);
			}
		}
	}
	
	public static void test2(){
		File srcFile = new File("d:\\code");
		
		File[] listFiles = srcFile.listFiles();
		for(File file : listFiles){
			if(file.getName().endsWith(".jpg")){
				System.out.println(file.getAbsolutePath());
			}
		}
	}
	/* 补充：
	 * File类提供了两个文件过滤器方法
	 * public String[] list(FilenameFilter filter)
	 * public File[] listFiles(FileFilter filter)

	 */
	
	
	
}
