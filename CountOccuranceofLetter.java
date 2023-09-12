package Assignment_Day06;

import java.util.Scanner;

public class CountOccuranceofLetter {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		String s=input.next();
		String s1="";
		for (int i=0;i<s.length();i++) {
			 int count = 1;
            while(i+1<s.length()&&s.charAt(i)==s.charAt(i + 1)) {
                i++;
                count++;
            }
            	s1=s1+("'"+s.charAt(i)+"'"+":"+ count+"," );	
            
            
		}
		String s5="";
		s5="{"+s1+"}";
		System.out.println(s5);
		}
}

