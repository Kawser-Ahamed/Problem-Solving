package HackerEarth;

import java.util.Scanner;

public class EqualParity {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int []a = new int[2*n];
			int c2=0;
			
			for(int i=0;i<2*n;i++) {
				a[i]=sc.nextInt();
				if(a[i]%2==0) {
					a[i]/=2;
					c2++;
				}
				while(a[i]%2==0) {
					c2++;
					a[i]/=2;
				}
			}
			if(c2>=n) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			t--;
		}
		sc.close();
	}

}

