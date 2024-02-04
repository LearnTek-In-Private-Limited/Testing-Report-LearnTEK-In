package firstpackage;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("1 * "+n+" = "+n);
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				int no=n/i;
				System.out.println(i+" * "+no+" = "+n);
			}
		}
		System.out.println(n+" * 1"+" = "+n);

	}
}
