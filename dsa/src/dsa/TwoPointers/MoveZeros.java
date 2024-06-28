package dsa.TwoPointers;

import java.util.Iterator;
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
public class MoveZeros {

	public static void main(String[] args) {
		Solution s1 = new Solution();
		int[] intArray = new int[]{ 4,2,0,4,0,1,7,8,0,10 };
		s1.moveZeroes(intArray);
	}

}

class Solution {
    public void moveZeroes(int[] nums) {
        //ap: Anchor pointer
        int ap = 0;
        //ep: Explore pointer
        int ep = 0;
        //n: length of the arr
        int n = nums.length;
        
        while(ep < n){
            if(nums[ap] != 0){
                //We move both pointers because we need to  prevent an example like this [1,0,1] where we could have ep < ap
                ap++;
                ep = ap;
            }else if(nums[ep] == 0){
                ep++;
            }else{
                //Current conditions: nums[ap] = 0 and nums[ep] != 0 so we swap
                int temp = nums[ap];
                nums[ap] = nums[ep];
                nums[ep] = temp;
            }
        }
        for(int n1:nums) {
			System.out.println(n1);
		}
    }
}
