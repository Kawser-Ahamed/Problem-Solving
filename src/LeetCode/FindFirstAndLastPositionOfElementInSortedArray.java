package LeetCode;

public class FindFirstAndLastPositionOfElementInSortedArray {

	public static void main(String[] args) {
		
		int nums[] = {5,7,7,7,8,8,10};
		int x[] = searchRange(nums,8);
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		
	}
	
    public static int[] searchRange(int[] nums, int target) {
    	
    	int a[]  = {-1,-1};
    	int start = 0;
    	int end = nums.length-1;
    	int s = -1;
    	int e = -1;
    	
    	while(start<=end) {
    		
    		int mid = start+(end-start)/2;
    		
    		if(nums[mid]==target) {
    			end = mid-1;
    			s = mid;
    		}
    		else if(nums[mid]>target) {
    			end = mid-1;
    		}
    		else {
    			start = mid+1;
    		}
    	}
    	a[0]=s;
    	
    	start = 0;
    	end = nums.length-1;
    	
        while(start<=end) {
    		int mid = start+(end-start)/2;
    		
    		if(nums[mid]==target) {
    			start = mid+1;
    			e = mid;
    		}
    		else if(nums[mid]>target) {
    			end = mid-1;
    		}
    		else {
    			start = mid+1;
    		}
    	}
    	a[1]=e;
    	
        return a;
    }

}
