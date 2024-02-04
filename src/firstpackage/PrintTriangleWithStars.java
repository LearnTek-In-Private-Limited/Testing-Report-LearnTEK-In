package firstpackage;

import java.util.Scanner;

public class PrintTriangleWithStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();int sp=0;
		for(int i=1;i<=n;i++) {
			for(sp=0;sp<n-i;sp++) {
				System.out.print(" ");
			}
			for(int j=sp;j<n;j++) {
				System.out.print("* " );
			}
			System.out.println();
		}
	}

}
