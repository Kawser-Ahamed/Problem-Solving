package HackerEarth;

import java.util.*;

public class EmployeeRating {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		int c=0,max=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]>6) {
				c++;
			}
			else {
				if(c>max) {
					max=c;
				}
				c=0;
			}
		}
		if(c>max) {
			max=c;
		}
		System.out.println(max);
		sc.close();
	}

}
