package LeetCode;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int []nums = {1,2};
		int a = missingNumber(nums);
		System.out.println(a);

	}
	
   public static int missingNumber(int[] nums) {
	   
	   int start = 0;
	   int end = nums.length-1;
	   Arrays.sort(nums);
	   int mid=0;
	   
	   
	   while(start<=end) {
		   
		   mid = start+(end-start)/2;
		   
		   if(nums[mid]==mid) {
			   start= mid+1;
		   }
		   else {
			   end = mid -1;
		   }
	   }
	   if(end==-1) {
		   return 0;
	   }
	   int a = nums[end]+1;
       return a;
    }

}
