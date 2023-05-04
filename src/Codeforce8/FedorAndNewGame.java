package Codeforce8;

import java.util.*;

public class FedorAndNewGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int []a = new int[m+1];
		int f=0;
		
		for(int i=0;i<=m;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<m;i++) {
			if(Integer.bitCount(a[i] ^ a[m])<=k) {
				f++;
			}
		}
		
		System.out.println(f);
		
		sc.close();

	}

}
