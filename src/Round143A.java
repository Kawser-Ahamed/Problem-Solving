import java.util.*;

public class Round143A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			String str1 = sc.next();
			String str2 = sc.next();
			StringBuffer buffer = new StringBuffer(str1);
			StringBuffer buffer2 = new StringBuffer(str2);
			String str3 = "";
			String str4 = "";
			int c1=0;
			int c2 = 0;	
			
			str3 = str1+buffer2.reverse();
			str4 = str2+buffer.reverse();
			
			for(int i =0;i<str3.length()-1;i++) {
				if(str3.charAt(i)==str3.charAt(i+1)) {
					c1++;
				}
			}
			for(int i =0;i<str4.length()-1;i++) {
				if(str4.charAt(i)==str4.charAt(i+1)) {
					c2++;
				}
			}
			
			if(c1<=1 || c2<=1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			t--;
		}
	}

}
