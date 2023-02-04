package CodeForce5;

import java.io.*;
import java.util.*;

public class StrangePartition {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		
		while(t>0) {
			
			long n =sc.nextLong();
			long x = sc.nextLong();
			long []a = new long[(int) n];
			long max = 0;
			long min = 0;
			long sum = 0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
				
				if(a[i]%x==0) {
					max+=a[i]/x;
				}
				else {
					max+=(a[i]/x)+1;
				}
				sum+=a[i];
			}
			
			min = sum/x;
			if(sum%x>0) {
				min++;
			}
			System.out.println(min+" "+max);
			
			t--;
		}
	}

}
