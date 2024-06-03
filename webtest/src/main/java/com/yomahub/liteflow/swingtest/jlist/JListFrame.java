package com.yomahub.liteflow.swingtest.jlist;

import javax.swing.*;

public class JListFrame extends JFrame {
	JPanel root;
	JList list;
	JScrollPane js;

	public JListFrame(String title) {
		super(title);

		//定义面板容器
		root = new JPanel();
		setContentPane(root);
		//设置面板为绝对布局
		setLayout(null);

		list = new JList(new MyListModel());
		js = new JScrollPane(list);
		js.setBounds(10, 10, 100, 100);
		root.add(js);

		//设置窗口风格
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 300, 260, 230);
		setVisible(true);
	}

	//继承抽象类AbstractListModel
	class MyListModel extends AbstractListModel {
		private String[] constellations = {
				"白羊座", "金牛座", "双子座", "巨蟹座",
				"狮子座", "处女座", "天秤座", "天蝎座",
				"射手座", "摩羯座", "双鱼座", "水瓶座"
		};

		//设置列表框内容
		//重写getElementAt()方法
		@Override
		public Object getElementAt(int x) {
			if (x < constellations.length)
				return constellations[x++];
			else
				return null;
		}

		//重写getSize()方法
		@Override
		public int getSize() {
			return constellations.length;
		}
	}

	//main方法
	public static void main(String[] args) {
		new JListFrame("JList");
	}
}
