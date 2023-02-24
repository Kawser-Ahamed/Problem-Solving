package Codeforce7;

import java.util.*;

public class Emotes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Long k = sc.nextLong();
		Long r = sc.nextLong();
		Long []a = new Long[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		
		Arrays.sort(a);
		Long x = k/(r+1);
		Long y = k%(r+1);
		Long sum = (a[n-1]*r)+a[n-2];
		System.out.println((sum*x)+(a[n-1]*y));
		
		sc.close();

	}

}
