package CodeForce5;

import java.util.*;

public class MakeThemEqual {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			char c = sc.next().charAt(0);
			String str = sc.next();
			int x = n;
			int flag=0;
			int flag2=0;
			int e=0;
			int o=0;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)!=c) {
					flag2=1;
					if((i+1)%2==0) {
						e=1;
					}
					if((i+1)%2==1) {
						o=1;
					}
				}
				
			}
			
			
			if(n%2==0) {
				x--;
			}
			
			if(str.charAt(x-1)!=c) {
				flag=1;
			}
			
			if(flag2==0) {
				System.out.println(0);
			}
			else if(flag==0) {
				System.out.println(1);
				System.out.println(x);
			}
			
			else if(e==0) {
				System.out.println(1);
				System.out.println(2);
			}
			else {
				System.out.println(2);
				System.out.println(2+" "+x);
			}
			
			t--;
		}

	}

}
