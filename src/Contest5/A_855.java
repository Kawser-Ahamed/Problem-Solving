package Contest5;

import java.util.*;

public class A_855 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			String str = sc.next();
			str = str.toLowerCase();
			StringBuffer buffer = new StringBuffer(str);
			
			for(int i=0;i<buffer.length()-1;i++) {
				if(buffer.charAt(i)==buffer.charAt(i+1)) {
					buffer.deleteCharAt(i+1);
					i--;
				}
			}
			str = buffer.toString();
			if(str.equals("meow")) {
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
