package CodeForce4;

import java.util.Scanner;

public class MultipleBy2DivideBy6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			long n = sc.nextLong();
			int flag = 1;
			int count = 0;
			while(n!=1) {
				
				if(n%6==0) {
					n/=6;
					count++;
				}
				else if(n%3==0) {
					n*=2;
					count++;
				}
				else {
					flag=0;
					break;
				}
			}
			
			if(flag==1) {
				System.out.println(count);
			}
			else {
				System.out.println(-1);
			}
			t--;
		}
	}

}
