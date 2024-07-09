package arrays;

//Given an array of integers nums, calculate the pivot index of this array.
//The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
//Return the leftmost pivot index. If no such index exists, return
public class FindPivotIndex {

	public static void main(String[] args) {
		Solution s1 = new Solution();
		int[] arr1 = new int[]{1,7,3,6,5,6};
		System.out.println("Index is "+s1.pivotIndex(arr1));
	}

}

class Solution {
	public int pivotIndex(int[] nums) {
		// 1. Get Sum of the array
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		// 2. Define the leftSum & rightSum
		int leftSum = 0, rightSum = sum;

		// Find the pivot index
		for (int i = 0; i < nums.length; i++) {
			rightSum -= nums[i];
			if (leftSum == rightSum)
				return i;
			leftSum += nums[i];
		}
		// 3. return -1 if can't find it
		return -1;
	}
}