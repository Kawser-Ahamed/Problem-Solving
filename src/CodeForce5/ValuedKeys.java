package CodeForce5;

import java.io.*;

public class ValuedKeys {

	public static void main(String[] args) throws IOException {
		
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		String s1 = br.readLine();
		String s2 = br.readLine();
		String s4 = "";
		int flag=0;
		
		int p = s1.compareTo(s2);
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)==s2.charAt(i)) {
					s4 = s4.concat("z");
				}
				else if(s1.charAt(i)>s2.charAt(i)){
					char x = (char) Math.min(s1.charAt(i),s2.charAt(i));
					s4 = s4.concat(String.valueOf(x));
				}
				else {
					flag=1;
					break;
				}
			}
		
			if(flag==1) {
				System.out.println(-1);
			}
			else {
				System.out.println(s4);
			}
		

	}

}
