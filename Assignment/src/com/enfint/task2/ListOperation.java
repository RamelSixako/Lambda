package com.enfint.task2;

import java.util.List;

public class ListOperation {

	public int integerSum(List<String> input) {
		int sum = 0;
		for (String string : input) {
			for (String string2 : string.split(" ")) {

				for (String string3 : string2.split(",")) {
					if (isaInteger(string3)) {
						sum += Integer.parseInt(string3);
					}
				}
			}
		}
		return sum;
	}

	private boolean isaInteger(String string) {
		try {
			Integer.parseInt(string);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
