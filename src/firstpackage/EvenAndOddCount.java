package firstpackage;

import java.util.Scanner;

public class EvenAndOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int oddcount=0;int evencount=0;
		while(n!=0) {
			if(n%2!=0) {
				oddcount++;
			}
			else {
			evencount++;
			}
			n=n/10;
		}
		if(oddcount>0) {
		System.out.println("Odd count is"+oddcount);
		}
		if(evencount>0) {
			System.out.println("Even count is"+evencount);
		}
	}

}
