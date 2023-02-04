import java.util.*;

public class PolycarpAndLetters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		StringBuffer buffer = new StringBuffer(str);
		Vector<Integer> vec = new Vector<Integer>();
		int c =0;
		
		for(int i=0;i<buffer.length();i++) {
			if(buffer.charAt(i)>=97) {
				char ch = buffer.charAt(i);
				c++;
				for(int j=i+1;j<buffer.length();j++) {
					if(buffer.charAt(j)<97) {
						break;
					}
					if(ch==buffer.charAt(j)) {
							buffer.deleteCharAt(j);
							j--;
					}
				}
			}
			else {
				vec.add(c);
				c=0;
			}
		}
		vec.add(c);
		System.out.println(Collections.max(vec));

	}

}
