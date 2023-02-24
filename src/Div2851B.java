import java.util.*;

public class Div2851B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			Long n = sc.nextLong();
			Long c = n, b = 0L, e = 0L, a = 10L, d = 0L;
			while(c>0){
				d += c % 10;
				c /= 10;
			}
			while(e < d){
				if(n % a == 0){
					a *= 10;
				}else{
					b += a / 10;
					n -= a / 10;
					d -= 1;
					e += 1; 
				}
			}
			System.out.println(n+" "+b);
			
			t--;
		}

	}

}
