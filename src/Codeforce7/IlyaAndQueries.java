package Codeforce7;

import java.util.*;

public class IlyaAndQueries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int m = sc.nextInt();
		
		while(m>0)
		{
			int l = sc.nextInt();
			int r = sc.nextInt();
			int c = 0;
			
			for(int i=l-1;i<r-1;i++) {
				if(str.charAt(i)==str.charAt(i+1)) {
					c++;
				}
			}
			System.out.println(c);
			m--;
		}
		sc.close();

	}

}
