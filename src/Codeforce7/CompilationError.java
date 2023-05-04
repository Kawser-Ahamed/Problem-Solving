package Codeforce7;

import java.util.*;

public class CompilationError {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Long sum1 = 0L,sum2 = 0L, sum3 = 0L;
		
		for(int i=1;i<=n;i++) {
			Long a = sc.nextLong();
			sum1+=a;
		}
		for(int i=1;i<=n-1;i++) {
			Long a = sc.nextLong();
			sum2+=a;
		}
		for(int i=1;i<=n-2;i++) {
			Long a = sc.nextLong();
			sum3+=a;
		}
		System.out.println(sum1-sum2);
		System.out.println(sum2-sum3);
		
		sc.close();
	}

}
