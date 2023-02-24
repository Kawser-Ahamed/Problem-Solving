package Codeforce7;

import java.util.*;

public class Permutation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a;
		HashSet<Integer> hash = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			a = sc.nextInt();
			if(a<=n){
				hash.add(a);
			}
		}
		System.out.println(n-hash.size());
		sc.close();

	}

}
