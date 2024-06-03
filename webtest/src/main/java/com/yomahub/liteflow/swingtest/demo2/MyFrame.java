package com.yomahub.liteflow.swingtest.demo2;

import javax.swing.*;
import java.awt.*;

/**
 * 创建新类继承JDialog类
 * @author Joy
 * @date 2024/4/7
 * @param
 *
 */

class MyJDialog extends JDialog {

	public MyJDialog(MyFrame frame) {
		//实例化一个JDialog类对象，指定对话框的父窗体、窗体标题和类型
		super(frame, "JDialog窗体", true);

		//创建一个容器
		Container container = getContentPane();
		//在容器中添加标签
		container.add(new JLabel("这是一个对话框"));
		//设置对话框窗体大小
		setBounds(120, 120, 150, 100);
	}
}


/**
 * 创建新类
 */
public class MyFrame extends JFrame {

	public MyFrame() {
		//创建一个容器
		Container container = getContentPane();
		container.setLayout(null);

		//在窗体中设置标签
		JLabel label = new JLabel("这是一个JFrame窗体");
		//将标签的文字置于标签中间位置
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 100, 150, 20);
		container.add(label);

		//定义一个按钮
		JButton button = new JButton("点我弹出对话框");
		button.setBounds(10, 10, 150, 20);

		//为按钮添加鼠标单击事件
		button.addActionListener(e -> {
			//使MyJDialog窗体可见
			new MyJDialog(MyFrame.this).setVisible(true);
		});

		button.addActionListener(e -> System.out.println("这是事件监听"));

		// 将按钮添加到容器中
		container.add(button);
		container.setBackground(Color.white);

		setSize(400, 300);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		setVisible(true);
	}


	/**
	 * main方法
	 * @param args
	 */
	public static void main(String[] args) {
		// 实例化MyJDialog类对象
		new MyFrame();
	}
}

