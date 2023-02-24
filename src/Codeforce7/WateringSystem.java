package Codeforce7;

import java.util.*;

public class WateringSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int []a = new int [n];
		int sum=0;
		int flag=0;
		int c=0;
		int f;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		f=a[0];
		Arrays.sort(a);
		
		if(A*f/sum>=B) {
			System.out.println(0);
		}
		else {
			for(int i=n-1;i>=0;i--) {
				if(a[i]==f && flag==0) {
					flag=1;
					continue;
				}
				else {
					sum-=a[i];
					c++;
					if(A*f/sum>=B) {
						System.out.println(c);
						break;
					}
				}
				
			}
		}
		sc.close();
	}

}
