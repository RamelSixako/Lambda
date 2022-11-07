package com.enfint.task4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvenAndOddFinder {

	Map<CharacterType, Set<String>> findFromCollection(List<Set<String>> input) {
		// TODO: task4
		HashMap<CharacterType, Set<String>> result = new HashMap<CharacterType, Set<String>>();
		Set<String> odd = new HashSet<String>();
		Set<String> even = new HashSet<String>();
		for (Set<String> set : input) {
			set.stream().forEach(i -> {
				if (i != null) {
					if (i.length() % 2 == 0) {
						even.add(i);
					} else {
						odd.add(i);
					}
				}

			});
		}
		result.put(CharacterType.EVEN, even);
		result.put(CharacterType.ODD, odd);
		return result;
	}

}
