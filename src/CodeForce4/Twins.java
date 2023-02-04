package CodeForce4;

import java.util.*;

public class Twins {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum1=0;
		int sum2=0;
		int count=0;
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum1+=a[i];
		}
		Arrays.sort(a);
		
		sum2+=a[n-1];
		count++;
		sum1-=sum2;
		if(sum1<sum2) {
			count=1;
		}
		else {
				for(int i=n-2;i>=0;i--) {
					sum2+=a[i];
					sum1-=a[i];
					count++;
					if(sum2>sum1) {
						break;
					}
			}
			
		}
		System.out.println(count);
	}

}
