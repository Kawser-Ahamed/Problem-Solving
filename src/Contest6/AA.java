package Contest6;

import java.util.*;

public class AA {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			int total = 0;
			int total2=0;
			
			
			if(c-1>=1) {
				total+=1;
			}
			if(x-c>=1) {
				total+=1;
			}
			if(d-1>=1) {
				total+=1;
			}
			if(y-d>=1) {
				total+=1;
			}
			
			
			if(a-1>=1) {
				total2+=1;
			}
			if(x-a>=1) {
				total2+=1;
			}
			if(b-1>=1) {
				total2+=1;
			}
			if(y-b>=1) {
				total2+=1;
			}
			
			System.out.println(Math.min(total2, total));
		}

	}

}
