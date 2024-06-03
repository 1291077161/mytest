package com.yomahub.liteflow.swingtest.jbutton;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

//创建新类
public class MyFrame extends JFrame {
	JPanel root;
	JButton messageButton, imageButton;

	public MyFrame() throws IOException {
		//定义面板容器
		root = new JPanel();
		setContentPane(root);
		//设置面板为绝对布局
		setLayout(null);

		//按钮添加文字
		//定义显示文本内容的按钮
		messageButton = new JButton("普通按钮");
		//设置按钮显示位置和大小
		messageButton.setBounds(54, 68, 100, 40);
		//将按钮添加到面板容器中
		root.add(messageButton);

		//按钮添加图标
		//定义图片对象
		ImageIcon icon = new ImageIcon(ImageIO.read(new File("C:\\Users\\Administrator\\Desktop\\Snipaste_2023-09-08_15-22-55.png")));
		//定义显示图片的按钮对象
		imageButton = new JButton(icon);
		//定义按钮显示位置
		imageButton.setBounds(196, 40, 120, 120);
		//就按钮显示在面板中
		root.add(imageButton);

		JButton jb = new JButton("一个按钮");
		// jb.setBounds(154, 168, 100, 40);

		root.add(jb);

		//设置窗口风格
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 400, 800, 600);
		setVisible(true);
	}

	//main方法
	public static void main(String args[]) throws IOException {
		new MyFrame();
	}
}
