package Codeforce7;

import java.util.*;

public class PairOfToys {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long n = sc.nextLong();
		Long k = sc.nextLong();
		
		if(k<=n) {
			System.out.println((k-1)/2);
		}
		else {
			Long x = ((k-1)-n)*2;
			Long d = (k-1)-x;
			if(d<=0) {                           
				System.out.println(0);
			}
			else {
				System.out.println(d/2);
			}
		}
		
		sc.close();

	}

}
