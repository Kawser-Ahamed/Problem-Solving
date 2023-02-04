package CodeForce4;

import java.util.Scanner;

public class MakeAp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			
			if(b>a && b>c) {
				int d = b-c;
				int x = a;
				a=(b+d);
				if(a%x==0 && (a-b)==(b-c)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			else if(a>b && a>c) {
				int d = a-c;
				int x = b;
				b=d;
				if(b%x==0 && (a-b)==(b-c)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			else if(c>a && c>b){
				int d = c-a;
				int x = b;
				b = d;
				if(b%x==0 && (a-b)==(b-c)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			else if(b==c) {
				int x = a;
			    a = b;
			    if((a-b)==(b-c)) {
			    	System.out.println("YES");
			    }
			    else {
			    	System.out.println("NO");
			    }
				
			}
			else if(a==b) {
				int x = c;
			    c = b;
			    if((a-b)==(b-c)) {
			    	System.out.println("YES");
			    }
			    else {
			    	System.out.println("NO");
			    }
				
			}
			else {
				if((a-b)==(b-c)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			
			
			t--;
		}

	}

}
