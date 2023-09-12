package Assignment_Day06;
import java.util.*;
public class CountWords {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
        s=s.trim();
        int count=1;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==' ') {
        		count++;
        	}
        }
        System.out.println(count);
		
	}

}
