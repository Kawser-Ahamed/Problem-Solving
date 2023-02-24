package Codeforce7;

import java.util.*;

public class YoungPhotographer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int k = sc.nextInt();
		int min = -1;
		int max = Integer.MAX_VALUE;
		
		for(int i=1;i<=n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(min<Math.min(a, b)) {
				min = Math.min(a,b);
			}
			if(max>Math.max(a, b)) {
				max = Math.max(a, b);
			}
		}
		
		if(min>max) {
			System.out.println(-1);
		}
		else if(k <= min)
			System.out.println(min-k);
		else if(k>=max)
			System.out.println(k-max);
		else 
			System.out.println(0);
		
		sc.close();

	}

}
