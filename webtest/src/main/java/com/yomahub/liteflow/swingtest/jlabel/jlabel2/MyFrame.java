package com.yomahub.liteflow.swingtest.jlabel.jlabel2;

import javax.swing.*;

public class MyFrame extends JFrame {       //创建新类
	JLabel label;

	public MyFrame() {
		//修改窗口标题
		setTitle("添加标签");

		//创建指定文本的标签对象
		label = new JLabel("我是一个JLabel！", JLabel.CENTER);

		//为标签添加图像
		label.setIcon(new ImageIcon("C:\\Users\\15269\\Desktop\\自行车.png"));

		//设置文本相对于图像的水平位置
		label.setHorizontalTextPosition(JLabel.CENTER);

		//设置文本相对于图像的垂直位置
		label.setVerticalTextPosition(JLabel.BOTTOM);

		//设置标签为不可用
		label.setEnabled(false);

		//设置标签在不可用的情况下显示的图像
		label.setDisabledIcon(new ImageIcon("C:\\Users\\15269\\Desktop\\射箭.png"));

		// 将标签添加到窗口中
		add(label);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 300, 800, 650);
		setVisible(true);
	}

	//main方法
	public static void main(String args[]) {
		new MyFrame();
	}
}
