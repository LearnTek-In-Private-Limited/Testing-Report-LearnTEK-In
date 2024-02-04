package firstpackage;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int sum=0;
		while(n!=0) {
			sum+=n%10;
			n=n/10;
		}
		System.out.println("The sum of digit is"+sum);
	}

}
