package firstpackage;

import java.util.*;


public class PalindromeNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int temp=n;
		int result=0;
		while(n>0) {
			int rem=n%10;
			result=result*10+rem;
			n=n/10;
		}
		if(temp==result) {
            System.out.println("The given number "+temp+" is a palindrome");
		}
		else {
			System.out.println("The given number "+temp+" is not a palindrome");
		}
	}

}

