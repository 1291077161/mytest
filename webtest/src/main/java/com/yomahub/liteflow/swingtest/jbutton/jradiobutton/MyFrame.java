package com.yomahub.liteflow.swingtest.jbutton.jradiobutton;

import javax.swing.*;

public class MyFrame extends JFrame {       
    JPanel root;
    JRadioButton radioButton, radioButton_1, radioButton_2, radioButton_3;

    public MyFrame() {
        //定义面板容器
        root = new JPanel();
        setContentPane(root);
        //设置面板为绝对布局
        setLayout(null);

        //定义单选按钮
        radioButton = new JRadioButton("学习");
        radioButton_1 = new JRadioButton("打豆豆");
        radioButton_2 = new JRadioButton("运动");
        radioButton_3 = new JRadioButton("旅行");

        //定义按钮显示位置和大小
        radioButton.setBounds(45, 29, 73, 23);
        radioButton_1.setBounds(134, 29, 121, 23);
        radioButton_2.setBounds(45, 74, 73, 23);
        radioButton_3.setBounds(134, 74, 121, 23);

        //将按钮添加到面板中
        root.add(radioButton);
        root.add(radioButton_1);
        root.add(radioButton_2);
        root.add(radioButton_3);

        //定义按钮组控件
        ButtonGroup group = new ButtonGroup();

        //将单选按钮添加到按钮组中
        group.add(radioButton);
        group.add(radioButton_1);
        group.add(radioButton_2);
        group.add(radioButton_3);

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 271, 161);
        setVisible(true);
    }

    //main方法
    public static void main(String args[]) {
        new MyFrame();
    }
}
