package com.careerit.cj.day19;

public final class IdGenerator {

	private static int count = 1001;

	private IdGenerator() {
	}

	public static int newId() {
		return count++;
	}

}
