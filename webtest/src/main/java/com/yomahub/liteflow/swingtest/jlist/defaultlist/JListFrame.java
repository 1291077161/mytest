package com.yomahub.liteflow.swingtest.jlist.defaultlist;

import javax.swing.*;

public class JListFrame extends JFrame {
    JPanel root;
    JList list;
    DataModel mode;

    public JListFrame(String title) {
        super(title);

        //定义面板容器
        root = new JPanel();
        setContentPane(root);

        mode = new DataModel();

        list = new JList(mode);

        list.setBorder(BorderFactory.createTitledBorder("配件"));

        root.add(new JScrollPane(list));

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(400, 300, 260, 230);
        setVisible(true);
    }

    class DataModel extends DefaultListModel {

        String[] s = {"主板", "显示器", "内存", "CPU", "硬盘", "电源", "键盘", "鼠标", "显卡"};

        @Override
        public int getSize() {
            return s.length;
        }

        @Override
        public String getElementAt(int index) {
            return (index + 1) + "." + s[index++];
        }
    }

    //main方法
    public static void main(String[] args) {
        new JListFrame("JList");
    }
}
