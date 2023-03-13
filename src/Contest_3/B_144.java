package Contest_3;

import java.util.*;

public class B_144 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			String str = sc.next();
			String str2 = sc.next();
			String x ="",y="";
			int flag=0;
			
			if(str.equals(str2)) {
				System.out.println("YES");
				System.out.println(str);
			}
			else if(str.charAt(0)==str2.charAt(0)) {
				System.out.println("YES");
				System.out.println(str.charAt(0)+"*");
			}
			else if(str.charAt(str.length()-1)==str2.charAt(str2.length()-1)) {
				System.out.println("YES");
				System.out.println("*"+str.charAt(str.length()-1));
			}
			else {
				for(int i=0;i<str.length()-1;i++){
					x = String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i+1));
					for(int j=0;j<str2.length()-1;j++) {
						y = String.valueOf(str2.charAt(j))+String.valueOf(str2.charAt(j+1));
						if(x.equals(y)) {
							flag=1;
							break;
						}
					}
					if(flag==1) {
						break;
					}
					
				}
				if(flag==1) {
					System.out.println("YES");
					System.out.println("*"+x+"*");
				}
				else {
					System.out.println("NO");
				}
			}
			
			t--;
		}
		
		sc.close();

	}

}
