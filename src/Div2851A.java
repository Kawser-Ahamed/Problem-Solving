import java.util.*;

public class Div2851A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int []a = new int[n];
			int c=0;
			int c2=0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				if(a[i]==2) {
					c++;
				}
			}
			
			if(c%2==1) {
				System.out.println(-1);
			}
			else {
				for(int i=0;i<n;i++) {
					if(a[i]==2) {
						c2++;
					}
					
					if(c2==c/2) {
						System.out.println(i+1);
						break;
					}
				}
			}
			
			
			t--;
		}

	}

}
