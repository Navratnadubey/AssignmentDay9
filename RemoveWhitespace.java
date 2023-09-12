package Assignment_Day06;
import java.util.*;
public class RemoveWhitespace {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String Name : ");
		String s=input.nextLine();
		String s1="";
		String c[]=s.split(" ");
		for(int i=0;i<c.length;i++) {
			s1=s1+c[i];
		}
		System.out.println(s1);
	}

}
