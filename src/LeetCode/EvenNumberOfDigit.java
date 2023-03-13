package LeetCode;

public class EvenNumberOfDigit {

	public static void main(String[] args) {
		
		int []a = {1,22,3333,44};
		int x = findNumbers(a);
		System.out.println(x);
	}
	public static int findNumbers(int []nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(digit(nums[i])) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean  digit(int n) {
		int x = countDigit(n);
		return x%2==0;
	}
    public static int  countDigit(int n) {
		return (int) (Math.log10(n)+1);
	}
}
