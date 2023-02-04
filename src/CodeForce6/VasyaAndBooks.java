package CodeForce6;

import java.io.PrintWriter;
import java.util.*;

public class VasyaAndBooks {
	
	static PrintWriter pr;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		pr = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int b;
		int index=0;
		int max=0;
		Vector<Integer> a = new Vector<Integer>();
		
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		for(int i=0;i<n;i++) {
			b = sc.nextInt();
			index = a.indexOf(b);
			index++;
			if(index>=max) {
				pr.print(index-max+" ");
				max = index;
			}
			else if(index<max) {
				pr.print(0+" ");
			}
			
		}
		
		pr.close();
		//sc.close();

	}

}
