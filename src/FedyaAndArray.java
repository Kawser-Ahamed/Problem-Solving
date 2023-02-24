import java.util.*;

public class FedyaAndArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			Long x = sc.nextLong();
			Long y = sc.nextLong();
			Long m = x;
			Long n = y;
			Long a=0L;
			
			if((x<0 && y<0) || (x>0 && y>0)) {
				System.out.println(Math.abs(Math.abs(x)-Math.abs(y))*2);
				a = Math.abs(Math.abs(x)-Math.abs(y))*2;
			}
			else {
				System.out.println(Math.abs(Math.abs(x)+Math.abs(y))*2);
				a = Math.abs(Math.abs(x)+Math.abs(y))*2;
			}
			
			for(int i=1;i<=a/2;i++) {
				System.out.print(x+" ");
				x--;
			}
			for(int i=1;i<=a/2;i++) {
				System.out.print(y+" ");
				y++;
			}
			System.out.println();
			t--;
		}

	}

}
