package com.wizardgame.main;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Window {

	public Window(int width, int height, String title, Game game) {
		
		JFrame frame = new JFrame(title);
		
		Dimension dimension = new Dimension(width, height);
		
		frame.setPreferredSize(dimension);
		frame.setMinimumSize(dimension);
		frame.setMaximumSize(dimension);
		
		frame.add(game);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	
}
