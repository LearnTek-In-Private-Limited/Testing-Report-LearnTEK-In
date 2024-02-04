package firstpackage;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(palindromeCheck(str)) {
        System.out.println("The given string "+str+" is a palindrome String");
        }
        else {
        	System.out.println("The given string "+str+" is not a palindrome String");
        }
	}
	
	static boolean palindromeCheck(String str) {
		String rev="";
        for(int i=0;i<str.length();i++) {
        	rev=str.charAt(i)+rev;
        }
        if(!rev.equals(str)) {
        	return false;
        }
        return true;
	}

}
