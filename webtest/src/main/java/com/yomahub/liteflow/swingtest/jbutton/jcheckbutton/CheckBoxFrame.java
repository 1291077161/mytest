package com.yomahub.liteflow.swingtest.jbutton.jcheckbutton;

import javax.swing.*;

public class CheckBoxFrame extends JFrame {
    JPanel root;
    JCheckBox checkBox,checkBox_1,checkBox_2,checkBox_3;

    public CheckBoxFrame() {
        //定义面板容器
        root = new JPanel();
        setContentPane(root);
        //设置面板为绝对布局
        setLayout(null);

        //定义复选框组件
        checkBox = new JCheckBox("C");
        checkBox_1 = new JCheckBox("C++");
        checkBox_2 = new JCheckBox("Java");
        checkBox_3 = new JCheckBox("Python");

        //设置复选框显示位置和大小
        checkBox.setBounds(31, 28, 73, 23);
        checkBox_1.setBounds(132, 28, 73, 23);
        checkBox_2.setBounds(31, 75, 54, 23);
        checkBox_3.setBounds(132, 75, 74, 23);

        //往面板中添加复选框
        root.add(checkBox);
        root.add(checkBox_1);
        root.add(checkBox_2);
        root.add(checkBox_3);

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 271, 161);
        setVisible(true);
    }

    //main方法
    public static void main(String args[]) {
        new CheckBoxFrame();
    }
}
