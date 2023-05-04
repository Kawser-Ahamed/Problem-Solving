package Contest_4;

import java.util.Scanner;

public class A_863 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			char c = sc.next().charAt(0);
			String str = sc.next();
			String s = "",s2 = "";
			int flag=0;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>=c) {
					s = s.concat(String.valueOf(str.charAt(i)));
				}
				else {
					s = s.concat(String.valueOf(c));
					s2 = str.substring(i, str.length());
					flag=1;
					break;
				}
			}
			s = s.concat(s2);
			if(flag==0) {
				s=s.concat(String.valueOf(c)); 
			}
			System.out.println(s);
		}

	}

}
