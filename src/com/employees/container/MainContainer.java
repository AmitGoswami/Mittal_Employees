package com.employees.container;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainContainer extends JFrame {

	private static final long serialVersionUID = -964153772670573115L;
	
	Dimension minimumSize = new Dimension(700, 900);
	
	public MainContainer() {
		super("Employees Details (Mittal Industries)");
		setLocationRelativeTo(null);
		setMinimumSize(minimumSize );
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
