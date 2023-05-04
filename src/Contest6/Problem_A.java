package Contest6;

import java.util.*;

public class Problem_A{

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int []array = new int[n];
			int flag=0;
			
			for(int i=0;i<n;i++) {
				array[i]=sc.nextInt();
				
				if(array[i]<=(i+1)) {
					flag=1;
				}
			}
			
			if(flag!=1) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
			t--;	
		}
		sc.close();

	}

}
