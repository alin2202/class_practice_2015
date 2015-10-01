package subset_practice;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class subset_algorithm {

	/**
	 * Returns closest to a target subset of integers
	 * @param set
	 * @param target
	 * @return ArrayList<Integer> result_subset
	 */
	public ArrayList<Integer> getSubset(int[] set, int target){	
		// create array list to hold the result
		ArrayList<Integer> new_subset = null;	
		// create array list to hold all sub-sets
		ArrayList<ArrayList<Integer>> subsets_list = new ArrayList<ArrayList<Integer>>();
		subsets_list.add(new ArrayList<Integer>(0));
		// loop through all ints in set:
		for (int i_set = 0; i_set < set.length; i_set++){
			ArrayList<ArrayList<Integer>> temp_list = new ArrayList<ArrayList<Integer>>();
			// loop through all subsets of subsets_list
			for (int i_subset = 0; i_subset < subsets_list.size(); i_subset ++){
				ArrayList<Integer> current_subset = subsets_list.get(i_subset);
				// calculate sum of current subset
				int sum = getArrayListSum(current_subset);
				// get current element of initial set
				int current_i = set[i_set];
				// if sum of current subset and current element of the set
				// is less than target, add one more element
				if ((sum + current_i) <= target){
					// create new subset and add current element of the set to a new subset
					new_subset = new ArrayList<Integer>();
					new_subset.addAll(current_subset);
					// add current element of the set to a new subset
					new_subset.add(current_i);
					// add new subset to our list of subsets
					temp_list.add(new_subset);
				}
				// if sum is equal to target, break out of loops
				if ((sum + current_i) == target){
					return new_subset;
				}
			}
			subsets_list.addAll(temp_list);
		}
		
		return null;
	}
	
	public int getArrayListSum(ArrayList<Integer> list){
		int sum = 0;
		for (int i = 0; i < list.size(); i++){
			int listElement = list.get(i);
			sum = sum + listElement;
		}
		return sum;
	}
}
