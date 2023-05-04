package Contest_8;

import java.util.*;

public class A_867 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			int sec = sc.nextInt();
			int []a = new int [n];
			int []b = new int[n];
			int c = 0,max=-1,index=-1;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				b[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				if(a[i]<=sec && max<b[i] && (c+a[i])<=sec) {
					max = b[i];
					index = i+1;
				}
				c++;
			}
			System.out.println(index);
		}
		
		
		sc.close();

	}

}
