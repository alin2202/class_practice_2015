package subset_practice;

import java.util.ArrayList;

public class subset_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] set = {5, 7, 13, 14, 3, 17, 9, 3, 11, 20};
		int target = 37;
		subset_algorithm subsetobj = new subset_algorithm();
		ArrayList<Integer> subset = subsetobj.getSubset(set, target);
		
		System.out.println(subset);
	}

	
}
