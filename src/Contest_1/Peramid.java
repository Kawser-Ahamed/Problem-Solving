package Contest_1;

import java.util.Scanner;

public class Peramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					if(j==1 || j==i) {
						System.out.print(1+" ");
					}
					else
					{
						System.out.print(0+" ");
					}
				}
				System.out.println();
			}
			t--;
		}

	}

}
