package Codeforce7;

import java.util.*;

public class MinimumLCM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long t = sc.nextLong();
		
		while(t>0) {
			
			Long n = sc.nextLong();
			Long min = 1000000000000000000L;
			Long l=0L;
			Long v1=1L;
			//Long v2=0L;
			
			if(n%2==0) {
				System.out.println(n/2+" "+n/2);
			}
			else {
				for(Long a=1L;a*a<=n;a++) {
					Long b = n-a;
					if(b%a==0) {
						l=b;
					}
					else if(a%3==0 && b%3==0) {
						l = (a*b)/3;
					}
					else {
						l = a*b;
					}
					
					if(l<min) {
						min = l;
						v1 = a;
						//v2 = b;
					}
				}
				System.out.println(v1+" "+(n-v1));
			}
			
			t--;
		}
		
		sc.close();

	}

}
