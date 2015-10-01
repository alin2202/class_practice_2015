package subset_practice;

import java.util.ArrayList;

public class subset_practice {

	public static void main(String[] args) {
		int[] intSet = {5, 7, 1, 2};
		// int[] set = {5, 7, 13, 14, 3, 17, 9, 3, 11, 20};
		
//		ArrayList<Integer> arraySet = new ArrayList<Integer>();
//		for (int i = 0; i < intSet.length; i++){
//			arraySet.add(intSet[i]);
//		}
		
		int target = 16;
		
		subset_algorithm subsetobj = new subset_algorithm();
//		//DEBUG: checking sum function
//		int sum = subsetobj.getArrayListSum(arraySet);
		
		ArrayList<Integer> subset = subsetobj.getSubset(intSet, target);
		System.out.println(subset);
	}
}
