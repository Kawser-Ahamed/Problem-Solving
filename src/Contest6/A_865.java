package Contest6;

import java.util.Scanner;

public class A_865 {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int gcd = Gcd(a,b);
			
			if(gcd!=1) {
				System.out.println(2);
				System.out.println((a-1)+" "+1);
				System.out.println(a+" "+b);
			}
			else {
				System.out.println(1);
				System.out.println(a+" "+b);
			}
			
		}
		
		sc.close();
	}
	
	public static int Gcd(int a,int b) {
		if(a==0) {
			return b;
		}
		return Gcd(b % a, a);
	}


}
