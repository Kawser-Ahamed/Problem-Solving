package Codeforce7;

import java.util.*;

public class BadPrices {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int []a = new int[n];
			int c=0,min=0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			min = a[n-1];
			
			for(int i=n-2;i>=0;i--) {
				if(a[i]>min) {
					c++;
				}
				else {
					min = a[i];
				}
			}
			
			System.out.println(c);
			
			t--;
		}
		
		sc.close();


	}

}
