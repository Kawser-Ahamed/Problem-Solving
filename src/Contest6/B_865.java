package Contest6;

import java.util.*;

public class B_865 {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			int a = n*2;
			int b = 2;
			for(int i=1;i<=(n/2);i++) {
				System.out.print(a+" "+b+" ");
				a-=2;
				b+=2;
			}
			
			System.out.println();
			b=0;
			a=1;
			for(int i=1;i<=(n/2);i++) {
				System.out.print(a+" "+(a+n)+" ");
				a+=2;
			}
			System.out.println();
		}
		
		sc.close();
		

	}

}
