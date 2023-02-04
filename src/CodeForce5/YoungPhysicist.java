package CodeForce5;

import java.util.*;

public class YoungPhysicist {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for(int i=1;i<=n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			sum1+=a;
			sum2+=b;
			sum3+=c;
		}
		
		if(sum1==0 && sum2==0 && sum3==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
