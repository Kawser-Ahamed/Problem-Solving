package HackerEarth;

import java.util.*;																																																																																																																																																																																																																																																																																																																																																							;

public class CandyInTheBox {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();

			if(k<=n) {
				System.out.println(k);
			}
			else {
				int candy = k-n;
				int div = candy/(n-1);
				if(div%2==0) {
					System.out.println(n-(candy%(n-1)));
				}
				else {
					System.out.println(1+(candy%(n-1)));
				}
			}
			t--;
		}
		sc.close();
	}

}
