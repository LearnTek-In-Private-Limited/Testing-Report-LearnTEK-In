package firstpackage;
import java.util.Scanner;
public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=0;i<str.length();i++) {
        	rev=str.charAt(i)+rev;
        }
        System.out.println("The reverse string is "+rev);
	}

}
