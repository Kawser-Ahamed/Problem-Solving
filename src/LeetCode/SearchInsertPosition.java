package LeetCode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,8,9,10,11};
		int ans = searchInsert(a,12);
		System.out.println(ans);
	}
    public static int searchInsert(int[] nums, int target) {
    	
    	int start = 0;
    	int end = nums.length-1;
    	
    	while(start<=end) {
    		int mid = start+(end-start)/2;
    		
    		if(nums[mid]==target) {
    			return mid;
    		}
    		else if(target<nums[mid]) {
    			end = mid -1;
    		}
    		else {
    			start = mid+1;
    		}
    	}
		return start;
        
    }
	

}
