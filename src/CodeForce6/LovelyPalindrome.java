package CodeForce6;

import java.util.Scanner;

public class LovelyPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		StringBuffer buffer = new StringBuffer(str);
		buffer = buffer.reverse();
		System.out.println(str+""+buffer);

	}

}
