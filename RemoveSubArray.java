// Question1 : Given an integer array arr, remove a subarray (can be
// empty) from the array such that the remaining elements in arr are
// non-decreasing.
// A subarray is a contiguous subsequence of the array.
// Return the length of the shortest subarray to remove.
// Example 1:
// Input: arr = [1,2,3,10,4,2,3,5]
// Output: 3
// Explanation: The shortest subarray we can remove is [10,4,2]
// of length 3. The remaining elements after that will be
// [1,2,3,3,5] which are sorted.
// Another correct solution is to remove the subarray [3,10,4].

import java.util.Scanner;

class RemoveSubArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int []arr = new int[sc.nextInt()];
		for(int i = 0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		System.out.println(removeArray(arr));
		
	}
	static int removeArray(int[] arr){
		int left = 0;
		int n = arr.length; 
		int right = n -1;
		while(left < right && arr[left] <= arr[left + 1])
			left++;
		if(left == right) 
			return 0;
		while(right > left && arr[right] >= arr[right-1])
			right--;
		int min = (n-left-1) < right? n-left-1: right;
		int j = right;
		for(int i = 0; i <= left; i++){
			if(arr[i] <= arr[j])
				min = min < (j-i-1)? min : j-i-1;
			else if(j < n -1)
				j++;
			else
				break;
		}
		return min;
	}
}