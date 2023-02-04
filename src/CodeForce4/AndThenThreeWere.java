package CodeForce4;

import java.util.Scanner;

public class AndThenThreeWere {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int sum=n,p=0;
			
			for(int i=n-1;i>=0;i--) {
				sum&=i;
				if(sum==0) {
					p=i;
					break;	
				}
			}
			
			//System.out.println(p);
			t--;
		}
	
		
		

	}

}
