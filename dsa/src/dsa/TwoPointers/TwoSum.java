package dsa.TwoPointers;

import java.security.DomainCombiner;
import java.util.HashMap;
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.*/
public class TwoSum {
	
	public static void main(String args[]){
		int[] intArray = new int[]{ 4,2,1,4,5,1,7,8,1,10 };
		int[] finalsum = twoSum(intArray,2);
		for(int sum:finalsum) {
			System.out.println(sum);
		}
	}
	
	public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            hm.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(hm.containsKey(difference) && hm.get(difference) != i){
                return new int[]{hm.get(difference), i};
            }
        }
        return new int[] {-1,-1};
    }

}
    