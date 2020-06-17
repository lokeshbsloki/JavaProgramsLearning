package interview;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

public class PlayGames {

	public static void main(String[] args) {

		secondmax();
		System.out.println();

		sumequalto8();
		System.out.println();

		removeDuplicateChar("anushaallthebest");
		System.out.println();

		onlyDuplicateChar("anushaallltheeeebesttttttt");
		System.out.println();

		sumOfDistinctNumbers();
		System.out.println();

		removeDuplicatesWithoutChangingOrder();
		System.out.println();

		sumDivisiblePairs();
		System.out.println();

	}

	public static void secondmax() {

		int arr[] = { 2, 3, 10, 5, 6, 7, 8, 9 };
		System.out.print("given array is ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ",");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("second max is = " + arr[1]);

	}

	public static void sumequalto8() {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(4);
		al.add(2);
		al.add(6);
		al.add(8);
		System.out.println(al.size());
		System.out.print("given array list is ");
		for (int i = 0; i < al.size(); i++)
			System.out.print(al.get(i) + ",");
		System.out.println();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) != null && al.get(j) != null && al.get(i) + al.get(j) == 8) {
					map.put(al.get(i), al.get(j));
					al.set(j, null);
				}
			}

		}
		System.out.println(map);
		for (Entry<Integer, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + "," + m.getValue());
		}

	}

	public static void removeDuplicateChar(String str) {

		System.out.println(str);
		String res = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (ch[i] == ch[j])
					break;
			}
			if (i == j)
				res = res + ch[i];
		}
		System.out.println(res);

	}

	public static void onlyDuplicateChar(String str) {

		int count;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char character : str.toCharArray()) {

			if (map.containsKey(character)) {
				count = map.get(character);
				map.put(character, count + 1);

			} else {
				map.put(character, 1);
			}
		}
		for (Entry<Character, Integer> map1 : map.entrySet()) {
			if (map1.getValue() > 1) {
				System.out.println(map1.getKey() + " repeats " + map1.getValue() + " times");
			}
		}

	}

	public static void sumOfDistinctNumbers() {

		int ar[] = { 5, 5, 6, 2, 2, 7, 5, 2, 2 };
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					ar[j] = 0;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		System.out.println(sum);
	}

	public static void removeDuplicatesWithoutChangingOrder() {

		int a[] = { -1, 2, 9, 2, 4, 9, 4, 0, 5, 3, 2, 0 };

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int ch : a) {
			if (!set.contains(ch)) {
				set.add(ch);
			}
		}
		// set.forEach( (k) -> list1.add(k));
		for (Integer s : set)
			list1.add(s);

		System.out.println(list1);

	}

	public static void sumDivisiblePairs() {

		int ar[] = { 2, 2, 1, 7, 5 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < ar.length; i++)
			al.add(i, ar[i]);
		int div = 3;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) != null && al.get(j) != null && (ar[i] + ar[j]) % div == 0) {
					map.put(ar[i], ar[j]);
					// al.set(j, null);
				}
			}
		}
		System.out.print("{");
		for (Entry<Integer, Integer> m : map.entrySet()) {
			System.out.print("(" + m.getKey() + "," + m.getValue() + ")");
		}
		System.out.print("}");

	}

}
