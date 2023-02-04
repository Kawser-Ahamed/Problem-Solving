package Contest5;

import java.util.*;

public class ASpellCheck 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			String str = sc.next();
			char C[] = str.toCharArray();
            
			Arrays.sort(C);
			String s = String.valueOf(C);
			
			if(s.equals("Timru"))
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			t--;
		}

	}

}
