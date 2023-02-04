package CodeForce5;

import java.util.Scanner;

public class AllMostMultiple {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int x = sc.nextInt();
			
			if(x==1 || n%x==1) {
				System.out.println(-1);
			}
			else {
				int p=0;
				System.out.print(x+" ");
				for(int i=2;i<n;i++) {
					if(i==x) {
						System.out.print(i*2+" ");
						p=i*2;
					}
					else if(p==i) {
						System.out.print(i*2+" ");
						p=i*2;
					}
					else {
						System.out.print(i+" ");
					}
				}
				System.out.println(1);
			}
			
			t--;
		}

	}

}
