package Codeforce7;

import java.util.*;

public class SequentialNim {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int []a = new int [n];
			int flag=0,c=0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				
				if(a[i]==1 && flag==0 && i<n-1) {
					c++;
				}
				else {
					flag=1;
				}
			}
			
			if(c%2==0) {
				System.out.println("First");
			}
			else {
				System.out.println("Second");
			}
		}
		
		sc.close();

	}

}
