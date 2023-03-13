package LeetCode;

public class FindSmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		
		char c [] = {'c','c','c','g','j'};
		char target = nextGreatestLetter(c,'c');
		System.out.println(target);
	}
	
    public static char nextGreatestLetter(char[] letters, char target) {
    	
    	int start = 0;
    	int end = letters.length-1;
    	
    	while(start<=end) {
    		int mid = start+(end-start)/2;
    		
    		 if(target<letters[mid]){
    			end = mid-1;
    		}
    		else {
    			start=mid+1;
    		}
    	}
    	return letters[start%letters.length];
    }

}
