package Codeforce8;

import java.util.*;

public class InterestingDrink {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		int q = sc.nextInt();
		
		while(q-->0) {
			int c = sc.nextInt();
			int ans = binarySearch(a,c);
			System.out.println(ans);
		}
		
		sc.close();

	}
	
	public static int binarySearch(int []a ,int target) {
		
		int start = 0;
		int end = a.length-1;
		
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			if(a[mid]==target || target>a[mid]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		
		if(end == -1)
			return 0;
		
		return end+1;
	}

}
