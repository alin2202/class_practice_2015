package subset_practice;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class subset_algorithm {

	public ArrayList<Integer> getSubset(int[] set, int target){
		ArrayList<Integer> subset = new ArrayList<Integer>();
		subset.add(0);
		// implementation
		// outer loop: through all ints in set:
		for (int set_i = 0; set_i < set.length; set_i++){
			for (int subset_i = 0; subset_i < subset.size(); subset_i ++){
				// get sum of subset items
				int sum = getArrayListSum(subset);
				int current_i = set[set_i];
				// if sum is less than target, add one more element
				if ((sum + current_i) < target){
					subset.add(current_i);
					// DEBUG STATEMENT
					System.out.println(subset);
				}
				// if sum is equal to target, break out of loops
				if ((sum + current_i) == target){
					return subset;
				}
			}
		}
		
		/*
		 * Col = {}
		1) 	// outer loop: 0 element (5)
		0.1 inner loop: Col(0) = {}
		if sum({}) + 5 < 37 == true: Col = {}, {5}
		is sum({}) + 5 == 37: false

		Col = {}, {5}
		2)  //outer loop: 1 element (7)
		1.1 inner loop: Col(0) = {0}
		if sum(0) + 7 < 37 == true: Col = {}, {7}
		if sum(0) + 7 == 37: false
		
		1.2 inner loop" Col(1) = {5}
		if sum(5) + 7 < 37 == true: Col = {}, {5}, {7}
		if sum(5) + 7 == 37: false
		 */
		
		return subset;		
	}
	
	public int getArrayListSum(ArrayList<Integer> list){
		int sum = 0;
		for (int i = 0; i < list.size(); i++){
			sum = sum + list.get(i);
		}
		return 0;
	}
}
