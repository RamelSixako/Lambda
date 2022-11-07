package com.enfint.task3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheMaximumElements {
	public List<BigDecimal> getThreeMaximum(List<String> input) {
		// TODO: task3
		ArrayList<BigDecimal> maximum = new ArrayList<BigDecimal>();
		ArrayList<BigDecimal> result = new ArrayList<BigDecimal>();
		if (input.isEmpty()) {
			return result;
		}
		input.stream().forEach(num -> {
			if (num != null) {
				maximum.add(new BigDecimal(num));
			}
		});
		ArrayList<BigDecimal> maxBigDecimals = (ArrayList<BigDecimal>) maximum.stream().sorted()
				.collect(Collectors.toList());
		System.out.println(maxBigDecimals.toString());
		for (int i = maxBigDecimals.size() - 1; i >= maxBigDecimals.size() - 3; i--) {
			result.add(maxBigDecimals.get(i));
		}
		return result;
	}

}
