package Contest_5;

import java.util.*;

public class A {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			String str = sc.next();
			LinkedList<Character> lk = new LinkedList<>();
			int c =0;
			
			lk.add('0');
			for(int i=0;i<str.length();i++) {
				lk.add(str.charAt(i));
			}
			lk.add('0');
			
			for(int i=1;i<lk.size();i++) {
				if(lk.get(i)=='^' && lk.get(i+1)=='_') {
					lk.add(i+1, '^');
					c++;
				}
				else if(lk.get(i)=='_') {
					if(lk.get(i-1)!='^') {
						lk.add(i-1, '^');
						c++;
					}
					if(lk.get(i+1)!='^') {
						lk.add(i+1, '^');
						c++;
					}
				}
			}
			System.out.println(lk);
		}
		
		sc.close();

	}

}
