package CodeForce6;

import java.util.*;

public class DoubleEndedString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			String str = sc.next();
			String str2 = sc.next();
			Vector<Integer> vec = new Vector<Integer>();
			int index = 0;
			int max = 0;
			String s2 = "";
			
			for(int i=0;i<str.length();i++) {
				for(int j=index;j<str2.length();j++) {
					if(str.charAt(i)==str2.charAt(j)) {
						index = j+1;
						j = str2.length();
						max++;
						s2=s2.concat(String.valueOf(str.charAt(i)));
					}
					else {
						if(max>0) {
							i = i-(max);
							vec.add(max);
							System.out.print(s2+" ");
							s2="";
						}
						max=0;
						index=0;
					}
				}
			}
			vec.add(max);
			System.out.println(Collections.max(vec));
			System.out.println(vec);
			System.out.println((str.length()+str2.length())-(Collections.max(vec)*2));
			
			t--;
		}

	}

}
