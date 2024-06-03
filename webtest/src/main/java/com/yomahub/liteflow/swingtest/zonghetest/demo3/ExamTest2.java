package com.yomahub.liteflow.swingtest.zonghetest.demo3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExamTest2 extends WindowAdapter implements ActionListener {

	public static void main(String[] args) {

		ExamTest2 e = new ExamTest2();
		e.go();

	}


	/**
	 * Invoked when an action occurs.
	 *
	 * @param e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

	}


	JFrame f;
	JButton myButton;
	JLabel myLabel;
	JTextField tfs;

	String ad = "This is a JFrame";

	public void go() {

		f = new JFrame("MY Frame");
		f.setLayout(new GridLayout(6, 1, 10, 10));
		f.setSize(650, 400);
		myLabel = new JLabel("Statement");
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		pan1.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 0));

		tfs = new JTextField(ad);
		pan1.add(myLabel);
		pan1.add(tfs);

		myButton = new JButton("Ok");
		pan2.add(myButton);


		f.add(new JLabel());
		f.add(pan1);
		f.add(pan2);


		// Container contentPane = f.getContentPane();
		// contentPane.add(new JLabel());
		// contentPane.add(pan1);
		// contentPane.add(pan2);

		// contentPane.add(myLabel);
		// contentPane.add(tfs);
		// contentPane.add(myButton);


		f.addWindowListener(this);
		f.setVisible(true);
		f.setAlwaysOnTop(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	/**
	 * Invoked when a window is in the process of being closed.
	 * The close operation can be overridden at this point.
	 *
	 * @param e
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		// super.windowClosing(e);
		System.exit(0);
	}
}
