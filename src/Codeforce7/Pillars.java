package Codeforce7;

import java.util.*;

public class Pillars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a ;
		int flag2=0;
		int p =0;
		@SuppressWarnings("unused")
		int max=0;
		int flag=0;
		
		for(int i=0;i<n;i++) {
			a = sc.nextInt();
			
			if(flag==1) {
				if(a>p) {
					flag2=1;
				}
				p=a;
			}
			else {
				if(a>p) {
					max = a;
					p=a;
				}
				else {
					flag=1;
					p = a;
				}
			}
			
		}
		if(flag2==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		sc.close();
		
	}

}
