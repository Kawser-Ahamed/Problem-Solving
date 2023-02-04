package CodeForce6;

import java.util.*;

public class BeautifulArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			Long n = sc.nextLong();
			Long k = sc.nextLong();
			Long b = sc.nextLong();
			Long s = sc.nextLong();
			
			if((k*b)+((n-1)*(k-1))<s || (k*b)>s || (s-(k*b))>((n-1)*(k-1))) {
				System.out.print(-1);
			}
			else {
				Long x = s-(k*b);
				System.out.print(k*b+" ");
				for(int i=1;i<n;i++) {
					if(x>=(k-1)) {
						System.out.print((k-1)+" ");
						x-=(k-1);
					}
					else if(x<(k-1) && x>0) {
						System.out.print(x+" ");
						x-=x;
					}
					else {
						System.out.print(0+" ");
					}
				}
			}
			System.out.println();
			
			t--;
		}

	}

}
