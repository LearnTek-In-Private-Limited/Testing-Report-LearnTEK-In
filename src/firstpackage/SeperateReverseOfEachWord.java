package firstpackage;
import java.util.*;
public class SeperateReverseOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
		String result="";
		for(int i=0;i<str.length;i++) {
			result+=reverse(str[i])+" ";
		}
		System.out.println("Reversed word string is:"+result);
	}
	static String reverse(String str) {
		String reversedString="";
		for(int i=0;i<str.length();i++) {
			reversedString=str.charAt(i)+reversedString;
		}
		return reversedString;
	}

}
