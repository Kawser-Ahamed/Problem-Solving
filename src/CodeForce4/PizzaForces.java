package CodeForce4;

import java.util.Scanner;

public class PizzaForces {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long t = sc.nextLong();
		
		while(t>0) {
			
			long n = sc.nextLong();
			long ans = 0;
			long d = 0;
			long e =0;
			
			if(n<=6)
			{
				ans = 15;
			}
			else {
				if(n%6==0) {
					d = n/6;
					ans = d*15;
				}
				else {
					d = n/6;
					long x = n%6;
					
					if(x>4) {
						d++;
						d*=15;
						ans = d;
					}
					else {
						d--;
						ans=d;
						ans*=15;
						d*=6;
						if(d+8>=n) {
							ans+=20;
						}
						else {
							ans+=25;
						}
					}
				}
			}
		     System.out.println(ans);
			
			t--;
		}

	}

}
