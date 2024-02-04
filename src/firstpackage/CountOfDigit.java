package firstpackage;

import java.util.Scanner;

public class CountOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		System.out.println("The count of digit is"+count);
	}

}
