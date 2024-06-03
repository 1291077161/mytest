package com.yomahub.liteflow.swingtest.jbutton.jtogglebutton;

import javax.swing.*;

public class ToggleTestButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		JToggleButton jToggleButton = new JToggleButton("aaa");

		frame.add(jToggleButton);

		frame.pack();
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
