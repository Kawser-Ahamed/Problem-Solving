package CodeForce2;

import java.util.Scanner;

public class StroneGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int []ar = new int[n];
			int max = 0;
			int min = 100000;
			int x = 0;
			int y = 0;
			
			for(int i=0;i<n;i++) {
				ar[i]=sc.nextInt();
				
				if(ar[i]<min) {
					min = ar[i];
					x=i+1;
				}
				if(ar[i]>max) {
					max = ar[i];
					y=i+1;
				}
				
			}
			
			int pos1,pos2=1,pos3,pos4=1,a,b,mm,total=0;
			
			pos1 = x;
			pos2 += n-x;
			
			if(pos1<pos2) {
				a=pos1;
			}
			else {
				a=pos2;
			}
			
			pos3 = y;
			pos4 += n-y;
			
			if(pos3<pos4) {
				b=pos3;
			}
			else {
				b=pos4;
			}
			int div = Math.abs(y-x);
			if(div<a || div<b) {
				mm = Math.min(a, b);
				total+=mm+div;
			}
			else {
				total += a+b;
			}
			
			System.out.println(total);
			
			t--;
		}
		

	}

}
