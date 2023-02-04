package CodeForce4;

import java.util.*;

public class BusinessTrip {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int []a = new int[12];
		int sum = 0;
		int count=0;
		
		
		for(int i=0;i<12;i++) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		

		for(int i=11;i>=0;i--) {
			if(sum>=k) {
				break;
			}
			else {
				sum+=a[i];
				count++;
			}
		}
		
		if(sum<k) {
			count=-1;
		}
		
		System.out.println(count);

	}

}
