package com.yomahub.liteflow.swingtest.zonghetest.demo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApplication {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(400, 300);
        frame.setBounds(100,500,400,300);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Name:"));
        panel.add(new JTextField(20));
        panel.add(new JLabel("Age:"));
        panel.add(new JTextField(20));
        panel.add(new JLabel("Gender:"));
        String[] genders = {"Male", "Female"};
        JComboBox comboBox = new JComboBox(genders);
        panel.add(comboBox);

        // panel.add(new JTextArea("文本区域"));

        JButton button = new JButton("Submit");
        JButton button2 = new JButton("Submit2");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // e.getSource()
                String name = ((JTextField) panel.getComponent(1)).getText();
                String age = ((JTextField) panel.getComponent(3)).getText();
                String gender = (String) comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "Name: " + name + "\nAge: " + age + "\nGender: " + gender);
            }
        });

        frame.add(panel, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);
        frame.add(button2, BorderLayout.NORTH);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
    }
}
