package Codeforce7;

import java.util.*;

public class LLPS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		str = String.valueOf(temp);
		char c = str.charAt(str.length()-1);
		String s = binarySearch(str,c);
		System.out.println(s);
		sc.close();

	}
	
	public static String binarySearch(String str,char c) {
		
		int start = 0;
		int end = str.length()-1;
		String s = "";
		int a =-1;
		int b = -1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(str.charAt(mid)==c) {
				end = mid-1;
				a = mid;
			}
			else if(str.charAt(mid)<c) {
				start= mid+1;
			}
		}
		start =0;
		end = str.length()-1;
        while(start<=end) {
			int mid = start+(end-start)/2;
			if(str.charAt(mid)==c) {
				start = mid+1;
				b = mid;
			}
			else if(str.charAt(mid)<c) {
				start= mid+1;
			}
		}
        
        s = str.substring(a, b+1);
		
		return s;
	}

}
