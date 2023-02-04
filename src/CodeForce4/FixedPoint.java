package CodeForce4;

import java.util.*;

public class FixedPoint {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
    	int count = 0;
		int flag=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();	
			if(i==a[i]) {
				count++;
			}
		}
		
		for(int i=0;i<n;i++) {
			int index = a[i];
			if(a[i]!=i) {
				if(a[index]==i) {
					count+=2;
					flag=1;
					break;
				}	
			}
				
		}	
		if(flag==0 && count!=n) {
			count++;
		}
		
		System.out.println(count);

	}

}
