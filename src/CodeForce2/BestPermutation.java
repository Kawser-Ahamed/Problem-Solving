package CodeForce2;

import java.util.*;

public class BestPermutation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		
		if(n%2==1) {
			System.out.println(-1);
		}
		else
		{
			for(int i=0;i<n;i++) {
				a[i]=i+1;
			}
			for(int i=0;i<n;i+=2) {
				int temp = a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
