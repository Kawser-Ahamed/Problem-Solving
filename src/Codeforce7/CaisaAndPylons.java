package Codeforce7;

import java.util.*;

public class CaisaAndPylons {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int [n+1];
		int sum=0,dollar=0;
		a[0]=0;
		
		for(int i=1;i<=n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i-1]-a[i];
			if(sum<0) {
				dollar+=Math.abs(sum);
				sum=0;
			}
		}
		System.out.println(dollar);
		sc.close();

	}

}
