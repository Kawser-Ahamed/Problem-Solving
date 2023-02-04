package CodeForce5;

import java.util.Scanner;

public class DevuChiru {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		int a = 0;
		int sum=0;
		int c = 0;
		int b = 0;
		
		for(int i=0;i<n;i++) {
			a = sc.nextInt();
			sum+=a;
		}
		int r = (n-1)*10;
		sum+=r;
		
		if(sum>d) {
			System.out.println(-1);
		}
		else {
			c = r/5;
			b = d-sum;
			c+=b/5;
			System.out.println(c);
		}
		
		
		

	}

}
