package Contest5;

import java.util.*;

public class B_855 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			String str = sc.next();
			StringBuffer buffer = new StringBuffer(str);
			int total=0,ex=0;
			int c1=0,c2=0;
			
			for(int i=0;i<buffer.length();i++) {
				String x = String.valueOf(buffer.charAt(i));
				x = x.toUpperCase();
				for(int j=i+1;j<buffer.length();j++) {
					String y = String.valueOf(buffer.charAt(j));
					if(buffer.charAt(i)==buffer.charAt(j)) {
						c1++;
						buffer.deleteCharAt(j);
						j--;
					}
					else if(x.equals(y)) {
						c2++;
						j--;
						buffer.deleteCharAt(j);
					}
					
				}
				total+=Math.min(c1, c2);
				System.out.println(c1+" "+c2);
				int max = Math.max(c1, c2);
				max-=Math.min(c1, c2);
				ex+=max/2;
				c1=0;
				c2=0;
			}
			System.out.println(total);
			t--;
		}
		
		
		
		sc.close();

	}

}
