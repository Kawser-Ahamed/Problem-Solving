package CodeForce2;

import java.util.*;

public class ASoftDrinks {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();
		int nl = sc.nextInt();
		int np = sc.nextInt();
		
		long total = (k*l)/nl;
		long slice = c*d;
		long salt = p/np;
		
		long min = Math.min(total, slice);
		long mainMin = Math.min(salt, min);
		
		int toast = (int) (mainMin/n);
		
		System.out.println(toast);
		
	}

}
