package LeetCode;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		
		int nums[] = {5,1,3};
		int index = search(nums,1);
		System.out.println(index);
	}
	
    public static int search(int[] nums, int target) {
    	
    	int start = 0;
    	int end = (nums.length-1)/2;
    	
    	while(start<=end) {
    		int mid = (start+end)/2;
    		if(nums[mid]==target) {
    			return mid;
    		}
    		else if(nums[start]==target) {
    			return start;
    		}
    		else if(nums[end]==target) {
    			return end;
    		}
    		else if(target<nums[mid]){
    			end = mid-1;
    		}
    		else {
    			start = mid+1;
    		}
    	}
    	start = ((nums.length-1)/2)+1;
    	end = nums.length-1;
    	
    	while(start<=end) {
    		int mid = (start+end)/2;
    		if(nums[mid]==target) {
    			return mid;
    		}
    		else if(nums[start]==target) {
    			return start;
    		}
    		else if(nums[end]==target) {
    			return end;
    		}
    		else if(target<nums[mid]){
    			end = mid-1;
    		}
    		else {
    			start = mid+1;
    		}
    	}
       return -1; 
    }

}
