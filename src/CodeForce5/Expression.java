package CodeForce5;

import java.util.*;

public class Expression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Vector<Integer> vec = new Vector<Integer>();
		
		vec.add(a*b*c);
		vec.add(a+b+c);
		vec.add((a+b)*c);
		vec.add(a*(b+c));
		
		System.out.println(Collections.max(vec));
	}

}
