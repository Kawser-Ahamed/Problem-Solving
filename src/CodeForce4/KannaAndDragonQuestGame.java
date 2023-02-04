package CodeForce4;

import java.util.Scanner;

public class KannaAndDragonQuestGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int h = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = h;
			int l = b;
			b*=10;
			
			if(h<=b) {
				h-=b;
			}
			else {
				h=k;
				b=l;

				for(int i=a;i>=1;i--) {
					h = (h/2)+10;
				}
				
				h-=b*10;
			}
			
			if(h<=0) {
				System.out.println("YES");
			}
			else {	
				System.out.println("NO");
			}
			t--;
		}

	}

}
