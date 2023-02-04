package CodeForce4;

import java.util.Scanner;

public class DominantPiranha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int []a = new int[n];
			int max = 0;
			int index = -1;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				
				if(a[i]>max) {
					max = a[i];
				}
			}
			
			for(int i=0;i<n;i++) {
				if(i==0) {
					if(a[i]==max && a[i]>a[i+1]) {
						index = i+1;
						break;
					}
				}
				else if(i==n-1) {
					if(a[i]==max && a[i]>a[i-1]) {
						index = i+1;
						break;
					}
				}
				
				else {
					if(a[i]==max && (a[i]>a[i-1] || a[i]>a[i+1])) {
						index = i+1;
						break;
					}
				}
			}
			
			System.out.println(index);
			
			t--;
		}

	}

}
