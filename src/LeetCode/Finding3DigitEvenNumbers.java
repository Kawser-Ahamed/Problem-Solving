package LeetCode;

public class Finding3DigitEvenNumbers {

	public static void main(String[] args) {
		
		int a[] = {2,1,3,0};
		StringBuffer buffer = new StringBuffer();
		StringBuffer buffer2 = new StringBuffer();
				
		for(int i=0;i<a.length;i++) {
			buffer.append(a[i]);
		}
		
		for(int i=100;i<=104;i++) {
			buffer2 = buffer;
			System.out.println(buffer2);
			int count=0;
			int x = i;
			while(x>0) {
				int r = x%10;
				x/=10;
				char c = (char)(r+'0');
				for(int j=0;j<buffer2.length();j++) {
					if(buffer2.charAt(j)==c) {
						count++;
						buffer2.deleteCharAt(j);
						j--;
					}
				}
			}
			if(count==3) {
				System.out.println(i);
			}
		}

	}

}
