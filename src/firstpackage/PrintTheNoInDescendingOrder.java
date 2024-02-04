package firstpackage;

import java.util.Scanner;

public class PrintTheNoInDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements");
			int n=sc.nextInt();
			System.out.println("Enter the elements");
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n-1;j++) {
					if(arr[i]<arr[j]) {
						int t=arr[i];
						arr[i]=arr[j];
						arr[j]=t;
					}
				}
			}
			System.out.print("The Sorted Array is ");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" "+ "");
			}
	}

}
