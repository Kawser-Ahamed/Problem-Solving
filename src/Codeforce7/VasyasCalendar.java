package Codeforce7;

import java.util.*;

public class VasyasCalendar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long d = sc.nextLong();
		int n = sc.nextInt();
		Long a;
		Long sum=0L;
		
		for(int i=0;i<n-1;i++) {
			a=sc.nextLong();
			sum+=d-a;
		}
		System.out.println(sum);
		sc.close();

	}

}
