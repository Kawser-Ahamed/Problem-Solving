package CodeForce4;

import java.util.*;

public class TwoGram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		Vector <String> vec = new Vector<String>();
		int max =0;
		String y = "";

		for(int i=0;i<str.length()-1;i++){
			String x = String.valueOf(str.charAt(i));
			x = x.concat(String.valueOf(str.charAt(i+1)));
			vec.add(x);
			x="";
			
		}
		
		for(int i=0;i<vec.size();i++) {
			int count=0;
			String a = vec.elementAt(i);
			for(int j=0;j<vec.size();j++) {
				String b = vec.elementAt(j);
				if(a.equals(b)) {
					count++;
				}
			}
			if(count>max) {
				y=a;
				max = count;
			}
		}
		
		System.out.println(y);
		

	}
}
