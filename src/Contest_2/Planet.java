package Contest_2;

import java.util.*;

public class Planet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int []a = new int[n];
			int count=1;
			int cost=0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			Arrays.sort(a);
			
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
			}
			
			System.out.println();
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(a[i]==a[j]) {
						count++;
						i++;
					}
				}
				System.out.print(count+" ");
				if(count>=c) {
					cost+=c;
				}
				else {
					cost+=1;
				}
				count=1;
			}
			System.out.println();
			System.out.println(cost);
			t--;
			
		}

	}

}
