package CodechefContest1;

import java.util.Scanner;

public class CountingProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int []a = new int[n];
			int count=0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				if(a[i]%2==1) {
					count++;
				}
			}
				if(count%2==1 || count==0) {
					System.out.println("NO");
				}
				else {
					System.out.println("YES");
				}
			t--;
		}

	}

}
