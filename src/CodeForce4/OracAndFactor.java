package CodeForce4;

import java.util.Scanner;

public class OracAndFactor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int flag=0;
			
			for(int i=2;i<=n;i++) {
				if(n%i==0) {
					flag=i;
					break;
				}
			}
			n+=flag;
			n+=(2*(k-1));
			System.out.println(n);
			t--;
		}

	}

}
