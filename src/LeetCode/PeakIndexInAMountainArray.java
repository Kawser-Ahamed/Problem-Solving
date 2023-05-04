package LeetCode;

public class PeakIndexInAMountainArray {

	public static void main(String[] args) {
		
		int a[] = {1};
		int index = peakIndexInMountainArray(a);
		System.out.println(index);
	}
	
	public static int peakIndexInMountainArray(int []arr) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]>arr[mid+1]) {
				end = mid;
			}
			else {
				start = mid+1;
			}
			
		}
		
		return start;
	}

}
