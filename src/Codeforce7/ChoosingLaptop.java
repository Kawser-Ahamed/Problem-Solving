package Codeforce7;

import java.util.*;

public class ChoosingLaptop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n*4];
		int c=1,pos=-1,flag=0,max = Integer.MAX_VALUE;
		for(int i=0;i<n*4;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n*4;i+=4) {
			for(int j=0;j<n*4;j+=4) {
				if(a[i]<a[j] && a[i+1]<a[j+1] && a[i+2]<a[j+2]) {
					flag=1;
				}
			}
			if(flag==0 && a[i+3]<max) {
				max=a[i+3];
				pos=c;	
			}
			else {
				flag=0;
			}
			c++;
		}
		System.out.println(pos);
		sc.close();
	}

}
