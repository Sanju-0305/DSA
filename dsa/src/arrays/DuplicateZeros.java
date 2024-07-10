package arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
//Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
//Input: arr = [1,0,2,3,0,4,5,0]
//Output: [1,0,0,2,3,0,0,4]
//Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

public class DuplicateZeros {

	public static void main(String[] args) {
		Duplicate s1 = new Duplicate();
		int[] arr1 = new int[]{1,0,3,6,0,6};
		s1.duplicateZeros1(arr1);
//		System.out.println(s1.duplicateZeros(arr1));
	}

}

class Duplicate {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                queue.add(0);
                queue.add(0);
            }else{
                queue.add(arr[i]);
            }
            Integer first = queue.poll();
            arr[i] = first;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public void duplicateZeros1(int[] arr) {
        int[] temp = arr.clone();
        int i = 0;
        
        for (int j = 0; j < arr.length; j++) {
            arr[j] = temp[i];
            if (temp[i] == 0 && j+1 < arr.length) {
                arr[j+1] = 0;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}