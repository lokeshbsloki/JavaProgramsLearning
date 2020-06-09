package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Interview {

	public static void main(String[] args) {

		interview1();
	}

	//input ar1=2,3,4,5,6
	//ar2=3,4,5,8
	//output=2=1,3=2,4=2
	public static void interview1() {
		int arr1[] = { 2, 3, 4, 5, 8, 4 };
		for(int i=0;i<arr1.length;i++)
		System.out.print(arr1[i]+" ");
		System.out.println();
		int arr2[] = { 1, 4, 8, 6, 4, 2, 5 };
		for(int i=0;i<arr2.length;i++)
		System.out.print(arr2[i]+" ");
		System.out.println();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println(arr1.length);
		for (int i = 0; i < arr1.length; i++) {
			int count = 1;
			if (arr1[i] != 0) {
				for (int j = i + 1; j < arr1.length; j++) {
					if (arr1[i] == arr1[j]) {
						count++;
						arr1[j] = 0;
					}
				}
				for (int k = 0; k < arr2.length; k++) {
					if (arr1[i] == arr2[k]) {
						count++;
						arr2[k] = 0;
					}
				}
				map.put(arr1[i], count);
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			int count = 1;
			if (arr2[i] != 0) {
				for (int j = i + 1; j < arr2.length; j++) {
					if (arr2[i] == arr2[j]) {
						count++;
						arr2[j] = 0;
					}
				}
				map.put(arr2[i], count);
			}
		}
		System.out.println(map);

	}
	
}
