package Assignment_Day06;
import java.util.*;
public class ReplaceCharcter {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=input.nextLine();
		String s5="";
		System.out.println("Enter the String which i have to replace");
		char s1=input.next().charAt(0);
		System.out.println("Enter the charcter which i have to place instead with given charcater");
		char s2=input.next().charAt(0);
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==s1) {
				s5=s5+s2;
			}else {
			s5=s5+(s.charAt(i));
		}
	}
		System.out.println(s5);
	}
}
