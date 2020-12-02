package com.careerit.cj.day20;

public class TaskManager {

	private static TaskManager obj = null;

	private TaskManager() {}

	public  static TaskManager getInstance() {
		if (obj == null) {
			obj = new TaskManager();
		}
		return obj;

	}

}
