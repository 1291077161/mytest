package com.yomahub.liteflow.swingtest.zonghetest.demo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 演示小球通过键盘上下左右的移动-》讲解java的事件控制
 */
//窗口
public class BallMove extends JFrame {
	MyPanel mp = null;

	public static void main(String[] args) {
		BallMove ballMove = new BallMove();
	}

	public BallMove() {
		mp = new MyPanel();
		this.add(mp);
		this.setSize(400, 400);
		//窗口JFrame对像可以监听键盘事件
		this.addKeyListener(mp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

//画板，KeyListener监听键盘事件
class MyPanel extends JPanel implements KeyListener {
	//为了让小球可以移动，把他的左上坐标设置成变量
	int x = 10;
	int y = 10;

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 20, 20);//默认黑色
	}

	//有字符输入时，该方法就会触发
	@Override
	public void keyTyped(KeyEvent e) {

	}

	//当某个键按下时
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println((char) e.getKeyCode() + "被按下。。。");
		//根据用户按下的不同键来处理小球的移动
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			//KeyEvent.VK_DOWN对应向下的箭头，Java中会给每一个值分配对应的（int）值
			y++;
			//向上的箭头
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			y--;
			//右箭头
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x++;
			//左箭头
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			x--;
		}


		//重绘
		this.repaint();
	}

	//当某个键释放
	@Override
	public void keyReleased(KeyEvent e) {

	}
}

