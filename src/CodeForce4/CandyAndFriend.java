package CodeForce4;

import java.util.Scanner;

public class CandyAndFriend {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int []a = new int[n];
			int sum=0,count=0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				sum+=a[i];
			}
			
			if(sum%n==0) {
				int div = sum/n;
				for(int i=0;i<n;i++) {
					if(a[i]>div) {
						count++;
					}
				}
				System.out.println(count);
			}
			else {
				System.out.println(-1);
			}
			t--;
		}
	}

}
