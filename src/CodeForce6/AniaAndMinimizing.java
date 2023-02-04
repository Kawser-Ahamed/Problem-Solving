package CodeForce6;

import java.util.*;

public class AniaAndMinimizing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		StringBuilder buffer = new StringBuilder(sc.next());
		
	    if(n==1 && k!=0) {
			buffer.setCharAt(0, '0');
		}
		else if(k!=0){
			if(buffer.charAt(0)!='1') {
				k--;
				buffer.setCharAt(0, '1');
			}
			int i=1;
			while(k>0) {
				if(buffer.charAt(i)!='0') {
					buffer.setCharAt(i, '0');
					k--;
				}
				i++;
				if(i==n) {
					break;
				}
			}
		}
		
		System.out.println(buffer);
		sc.close();

	}

}
