import java.util.*;

public class BasketballTogether {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		Long []a = new Long[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		
		Arrays.sort(a);
		
		int s = 0;
		int j = n-1;
		int c = 0;
		
		for(int i=j;i>=0;i--) {
			Long x = d/a[i];
			s+=x;
			if(s>i) {
				break;
			}
			c++;
		}
		
		System.out.println(c);

	}

}
