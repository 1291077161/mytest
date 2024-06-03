package com.yomahub.liteflow.swingtest.demo1;

import javax.swing.*;
import java.awt.*;

/**
 * @param
 * @author Joy
 * @date 2024/4/7
 */

//定义一个类继承JFrame类
public class MyFrame extends JFrame {

	//定义一个CreateJFrame()方法
	public void CreateJFrame(String title) {

		//实例化一个JFrame对象
		JFrame frame = new JFrame(title);
		// 获取一个容器
		Container container = frame.getContentPane();
		//设置容器的背景颜色
		container.setBackground(Color.CYAN);

		//创建一个JLabel标签
		JLabel jl = new JLabel("这是一个JFrame窗体");
		//使标签上的文字居中
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		// 将标签添加到容器中
		container.add(jl);

		// frame.add(jl);


		frame.setAlwaysOnTop(true);
		//使窗体可视
		frame.setVisible(true);
		//设置窗体显示位置和大小
		frame.setBounds(80, 300, 400, 300);
		//设置窗体关闭方式
		// frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		//在主方法中调用createJFrame()方法
		new MyFrame().CreateJFrame("一个JFrame标题");
	}
}
