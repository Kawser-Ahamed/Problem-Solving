package CodeForce;

import java.util.Scanner;
import java.util.Vector;

public class ASortSubstring 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			String str = sc.next();
			StringBuffer buffer = new StringBuffer(str);
			for(int i=2;i<buffer.length();i+=2)
			{	
					buffer.deleteCharAt(i);
					i--;
			}		
			System.out.println(buffer);
			t--;
		}

	}

}
