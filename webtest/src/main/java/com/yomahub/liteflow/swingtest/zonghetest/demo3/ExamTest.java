package com.yomahub.liteflow.swingtest.zonghetest.demo3;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.im.InputContext;

/**
 * @param
 * @author Joy
 * @date 2024/4/8
 */


@Slf4j
public class ExamTest implements ActionListener {

	public static void main(String[] args) {
		ExamTest e = new ExamTest();
		e.go();

	}

	JFrame frame = new JFrame("JComboBox Demo");

	JComboBox<String> jcb;
	JTextArea ta = new JTextArea(0, 50);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();

	String[] itemList = {"One", "Two", "Three", "Four", "Five"};

	public void go() {
		jcb = new JComboBox<String>(itemList);
		p1.add(jcb);

		// 考试加的
		jcb.setSelectedIndex(2);

		Border etched = BorderFactory.createEtchedBorder();
		TitledBorder border = BorderFactory.createTitledBorder(etched, "Uneditable");
		p1.setBorder(border);

		JScrollPane jp = new JScrollPane(ta);
		p2.setLayout(new BorderLayout());
		p2.add(jp);
		border = BorderFactory.createTitledBorder(etched, "Result");
		p2.setBorder(border);


		// 考试加的
		jcb.addActionListener(this);

		// p3.setLayout(new BorderLayout());
		// p3.add(p1);

		Container cp = frame.getContentPane();
		cp.setLayout(new GridLayout(0, 1));
		cp.add(p1);
		// cp.add(p3);
		cp.add(p2);


		frame.setAlwaysOnTop(true);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	/**
	 * Invoked when an action occurs.
	 *
	 * @param e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {


		JComboBox jcbcurrent = (JComboBox) e.getSource();
		if (jcbcurrent == jcb) {
			ta.append("\n Item\t" + jcbcurrent.getSelectedItem() + "\t" + " inserted");
			InputContext inputContext = ta.getInputContext();
			System.out.println("inputContext = " + inputContext);
			System.out.println("ta.toString() = " + ta.toString());
			log.info("aaaa" + " 操作了");
		}

	}
}
