package CodeForce2;

import java.util.*;

public class SumOfRoundNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			String str = String.valueOf(n);
			String s = "";
			int len = str.length();
			int Count=0;
			List <String> list = new ArrayList<String>();
			
			for(int i=0;i<str.length()-1;i++)
			{
				if(str.charAt(i)!='0')
				{
					s=String.valueOf(str.charAt(i));
					Count = len-i;
					for(int j=1;j<Count;j++)
					{
						s = s.concat("0");
					}
					list.add(s);
					s="";
				}
			}
			
			if(str.charAt(str.length()-1)!='0')
			{
				list.add(String.valueOf(str.charAt(str.length()-1)));
			}
			
			System.out.println(list.size());
			for(String i : list)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			t--;
		}

	}

}
