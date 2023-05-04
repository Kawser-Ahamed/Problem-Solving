package Codeforce7;

import java.util.*;

public class SumOfCubes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			long x = sc.nextLong();
	        int[] result = findIntegers(x);
	        if (result != null) {
	            System.out.println("YES");
	        } else {
	            System.out.println("No");
	        }
	    }
		sc.close();
	}
	    public static int[] findIntegers(long x) {
	        long limit = (long) Math.ceil(Math.pow(x, 1.0/3.0));
	        for (long a = 1; a <= limit; a++) {
	            long low = a;
	            long high = limit;
	            while (low <= high) {
	                long mid = low + (high - low) / 2;
	                long sum = a*a*a + mid*mid*mid;
	                if (sum == x) {
	                    return new int[] {(int) a, (int) mid};
	                } else if (sum < x) {
	                    low = mid + 1;
	                } else {
	                    high = mid - 1;
	                }
	            }
	        }
	        return null;
	    }
	}