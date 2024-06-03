package com.yomahub.liteflow.swingtest.jcombobox;

import javax.swing.*;

public class JComboBoxFrame extends JFrame {
    JPanel root;
    JLabel messageLabel;
    JComboBox comboBox;

    public JComboBoxFrame(String title) {
        super(title);

        //定义面板容器
        root = new JPanel();
        setContentPane(root);
        //设置面板为绝对布局
        setLayout(null);

        //定义标签组件
        messageLabel = new JLabel("请选择你的星座：");
        //设置标签组件大小
        messageLabel.setBounds(31, 25, 130, 15);
        root.add(messageLabel);

        //定义字符串数组对象
        String[] constellations = {
                "白羊座", "金牛座", "双子座", "巨蟹座",
                "狮子座", "处女座", "天秤座", "天蝎座",
                "射手座", "摩羯座", "双鱼座", "水瓶座"
        };
        //定义下拉列表框组件
        comboBox = new JComboBox(constellations);
        //设置列表大小
        comboBox.setBounds(130, 22, 100, 21);
        //将下拉列表添加到面板
        root.add(comboBox);

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 310, 230);
        setVisible(true);
    }

    //main方法
    public static void main(String[] args) {
        new JComboBoxFrame("JComboBox");
    }
}
