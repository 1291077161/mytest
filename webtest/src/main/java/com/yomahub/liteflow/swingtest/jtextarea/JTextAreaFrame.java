package com.yomahub.liteflow.swingtest.jtextarea;

import javax.swing.*;

public class JTextAreaFrame extends JFrame {
    JPanel root;
    JTextArea textArea;

    public JTextAreaFrame(String title) {
        super(title);

        //定义面板容器
        root = new JPanel();
        setContentPane(root);
        //设置面板为绝对布局
        setLayout(null);

        //定义文本域组件
        textArea = new JTextArea();
        //设置文本域自动换行
        textArea.setLineWrap(true);
        textArea.setBounds(20, 10, 290, 200);
        //将文本域添加到面板
        root.add(textArea);

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 340, 260);
        setVisible(true);
    }

    //main方法
    public static void main(String[] args) {
        new JTextAreaFrame("JTextArea");
    }
}
