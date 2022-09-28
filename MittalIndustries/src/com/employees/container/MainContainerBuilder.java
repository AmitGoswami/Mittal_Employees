package com.employees.container;

import java.awt.BorderLayout;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import com.employees.data.EmployeesData;

public class MainContainerBuilder {

	private JFrame jframe;
	private JTabbedPane jTabbedPane = new JTabbedPane();

	public MainContainerBuilder(JFrame jframe) {
		super();
		this.jframe = jframe;
	}

	public JFrame build() {
		addJTabbedPane(jframe, jTabbedPane);
		addCreateEmployeePanel(jTabbedPane);
		addViewEmployeePanel(jTabbedPane);
		addUpdateEmployeePanel(jTabbedPane);
		return jframe;
	}

	private static JFrame addJTabbedPane(JFrame frame, JTabbedPane jTabbedPane) {
		GroupLayout layout = new GroupLayout(frame.getContentPane());
		frame.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jTabbedPane));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jTabbedPane));
		return frame;
	}

	private static void addCreateEmployeePanel(JTabbedPane jTabbedPane) {
		JPanel createEmp = new JPanel();
		createEmp.setLayout(null);
		jTabbedPane.addTab("Create Employee", createEmp);
	}

	private static void addViewEmployeePanel(JTabbedPane jTabbedPane) {
		JPanel viewEmp = new JPanel();
		viewEmp.setLayout(new BorderLayout());
		JTable table = new JTable(EmployeesData.getEmployeeData(), EmployeesData.getHeaders());
		JScrollPane tableContainer = new JScrollPane(table);
		viewEmp.add(tableContainer, BorderLayout.CENTER);
		jTabbedPane.addTab("View Employees", viewEmp);
	}

	private static void addUpdateEmployeePanel(JTabbedPane jTabbedPane) {
		JPanel updateEmp = new JPanel();
		updateEmp.setLayout(null);
		jTabbedPane.addTab("Update Employees", updateEmp);
	}
}
