package Codeforce7;

import java.util.*;

public class EffectiveApproach {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Long []a = new Long[1000000];
		Long sum1=0L,sum2=0L;
		
		for(int i=1;i<=n;i++) {
			a[sc.nextInt()] = (long) i;
		}
		
		int m = sc.nextInt();
		
		for(int i=1;i<=m;i++) {
			int x = sc.nextInt();
			sum1+=a[x];
			sum2+=(n+1)-a[x];
		}
		
		System.out.println(sum1+" "+sum2);
		
		sc.close();

	}

}
