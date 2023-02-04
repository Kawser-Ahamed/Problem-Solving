package CodeForce4;

import java.util.Scanner;

public class Juicer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = sc.nextInt();
		int d = sc.nextInt();
		int []a = new int[n];
		int w = 0;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
			if(a[i]<=b) {
				sum+=a[i];
			}
			if(sum>d) {
				w++;
				sum=0;
			}
		}
		
		System.out.println(w);

	}

}
