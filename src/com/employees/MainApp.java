package com.employees;

import com.employees.container.MainContainer;
import com.employees.container.MainContainerBuilder;

public class MainApp {

	public static void main(String[] args) {
		MainContainer container = new MainContainer();
		MainContainerBuilder builder = new MainContainerBuilder(container);
		builder.build();
	}
}
