package com.yomahub.liteflow.swingtest.zonghetest.demo5;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 *
 * @author Joy
 * @date 2024/4/8
 * @param 
 * 
 */

@Slf4j
public class BorderExample {
    public static void main(String[] args) {
        // 创建一个 JPanel
        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(200, 100));

        // 创建一个 JPanel
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(200, 100));

        // 创建一个 EtchedBorder 边框
        Border etched = BorderFactory.createEtchedBorder();

        // 创建一个 TitledBorder
        TitledBorder border1 = BorderFactory.createTitledBorder(etched, "Uneditable");
        panel1.setBorder(border1);

        // 将 panel2 的边框设置为和 panel1 相同的边框对象
        panel2.setBorder(border1);

        // 修改 border1 的标题
        border1.setTitle("Result");

        // 打印 panel1 和 panel2 的边框
        System.out.println("Panel 1 Border: " + panel1.getBorder().toString());
        System.out.println("Panel 2 Border: " + panel2.getBorder().toString());
    }
}
