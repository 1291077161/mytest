package com.test1688;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestHtml {
	public static void main(String[] args) {

		File file = new File("D:\\\\爬虫");
		if (!file.exists()) {
			file.mkdir();
		}
		try{
			// FileWriter fileWriter = new FileWriter("D:\\\\爬虫\\\\1688店铺详情链接.xlsx");
			File file2 = new File("D:\\\\爬虫");
			File[] files = file2.listFiles();
			if (files.length > 0) {
				String fileName = "D:\\\\爬虫\\\\1688店铺详情链接" + (files.length + 1) + ".xlsx";
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
				bw.write("Hello World!");
				bw.close();//一定要关闭文件,否则会导致创建文件内容写入失败，即看不到写入的内容
			} else {
				//如果文件夹下没有该文件就会创建该文件,这里写文件路径，如：src/main/java/document/test.txt
				BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\\\爬虫\\\\1688店铺详情链接1.xlsx"));
				bw.write("Hello World!");
				bw.close();//一定要关闭文件,否则会导致创建文件内容写入失败，即看不到写入的内容
			}
		}catch(IOException e){
			e.printStackTrace();
		}



	}
}
