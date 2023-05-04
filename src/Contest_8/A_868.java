package Contest_8;

import java.util.*;

public class A_868 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int flag=0,ans=0,ans2=0,n1 =0;
			int x =n;
			
			while(x>0) {
				ans = (x*(x-1))/2;
				n1 = n-x;
				ans2 = (n1*(n1-1))/2;
				if(ans+ans2==k) {
					flag=1;
					break;
				}
				x--;
			}
			if(flag==0) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
				for(int i=1;i<=x;i++) {
					System.out.print(1+" ");
				}
				for(int i=1;i<=n1;i++) {
					System.out.print(-1+" ");
				}
				System.out.println();
			}
		}
		
		sc.close();

	}

}
