package com.absa.utilities;


public abstract class BaseUtil {
	protected static PageController controller = new PageController();

	public static PageController getController() {
		return controller;
	}
}
