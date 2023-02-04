package CodeForce6;

import java.util.*;

public class BearAndFindingCriminals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		int c=0;
		k--;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		if(a[k]==1) {
    		c++;
		}
		int i=k-1,j=k+1;
		
		while(true) {
			
			if(i>=0 && j<n) {
				if(a[i]==1 && a[j]==1) {
					c+=2;
				}
			}
			else if(i>=0 && j>=n) {
				if(a[i]==1) {
					c++;
				}
			}
			else if(i<0 && j<n) {
				if(a[j]==1) {
					c++;
				}
			}
			else if(i<0 && j>=n){
				break;
			}
			i--;
			j++;
		}
		
		System.out.println(c);

	}

}
