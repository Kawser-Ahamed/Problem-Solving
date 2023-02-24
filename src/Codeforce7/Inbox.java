package Codeforce7;

import java.util.*;

public class Inbox {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		int flag=0;
		int c=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]==1) {
				c++;
				flag=1;
			}
			if(a[i]==0 && flag==1) {
				c++;
				flag=0;
			}
		}
		if(a[n-1]!=1 && c>0) {
			c--;
		}
		System.out.println(c);
		
		sc.close();

	}

}
