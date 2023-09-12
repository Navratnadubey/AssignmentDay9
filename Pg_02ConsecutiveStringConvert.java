package Assignment_Day06;
import java.util.*;
public class Pg_02ConsecutiveStringConvert {
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
            if(count==1) {
            	s1=s1+(s.charAt(i));
            }else {
            	s1=s1+(s.charAt(i)+""+ count );	
            }
            
		}
		System.out.println(s1);
	}

}