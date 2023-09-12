package Assignment_Day06;

import java.util.Scanner;

public class Pg_15ConverFirstLetterInUppercase {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String");
		String x=input.nextLine();
		String a[]=x.split(" ");
		x="";
		for(int i=0;i<a.length;i++) {
			a[i]=a[i].substring(0,1).toUpperCase()+a[i].substring(1);
			x+=a[i]+" ";
		}
		x=x.trim();
		System.out.println(x);
	}
}
