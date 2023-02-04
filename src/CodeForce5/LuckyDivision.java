package CodeForce5;

import java.util.*;

public class LuckyDivision {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = {4,7,44,47,74,77,444,447,474,744,477,747,774,777};
		int flag=0;
		
		for(int i=0;i<a.length;i++) {
			//int d = n/a[i];
			int r = n%a[i];
			
			if(r==0 || n==a[i]) {
				flag=1;
				break;
			}
		}
		
		if(flag==1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
