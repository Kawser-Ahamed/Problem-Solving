package Contest_3;

import java.util.*;

public class A_144 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			
			String s = "";
			int k = sc.nextInt();
			String str = sc.next();
			
			for(int i=3;i<=2046;i++) {
				if(i%3==0 && i%5==0) {
					s = s.concat("FB");
				}
				else if(i%3==0) {
					s = s.concat("F");
				}
				else if(i%5==0) {
					s = s.concat("B");
				}
			}
			
			if(s.contains(str)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			t--;
		}
		sc.close();

	}

}
