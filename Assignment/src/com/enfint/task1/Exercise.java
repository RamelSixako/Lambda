package com.enfint.task1;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
	private int count = 0;

	public List<Integer> findDuplicates(List<Integer> integerList, int numberOfDuplicates) {
		// TODO: task1
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		integerList.stream().forEach(num1 -> {
			count = 0;
			integerList.stream().forEach(num2 -> {
				if (num1 == num2 && num1 != null) {
					count++;
				}
			});
			if (count == numberOfDuplicates && !duplicates.contains(num1)) {
				duplicates.add(num1);
			}
		});
		return duplicates;

	}

}
