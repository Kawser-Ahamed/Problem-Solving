package CodeForce5;

import java.io.*;

public class StringTask {

	public static void main(String[] args) throws IOException {
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		String str = rd.readLine();
		String s = "";
		str = str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='o' ||
			   str.charAt(i)=='y' || str.charAt(i)=='e' ||
			   str.charAt(i)=='u' || str.charAt(i)=='i'
			   ) {
				continue;
			}
			
			s=s.concat(".");
			s=s.concat(String.valueOf(str.charAt(i)));
		}
		System.out.println(s);

	}

}
