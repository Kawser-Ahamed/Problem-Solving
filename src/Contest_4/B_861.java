package Contest_4;

import java.util.*;

public class B_861 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			String str = "";
			
			if(n%2==0) {
				System.out.println(-1);
				continue;
			}
			
			while(n!=1) {
				if((n/2)%2==0) {
					n = (n/2)+1;
					str = str.concat("1"+" ");
				}
				else {
					n/=2;
					str = str.concat("2"+" ");
				}
			}
			StringBuffer buffer = new StringBuffer(str);
			buffer.reverse();
			buffer.deleteCharAt(0);
			System.out.println(str.length()/2);
			System.out.println(buffer);
			
		}
		
		sc.close();

	}

}
