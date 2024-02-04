package firstpackage;
import java.util.*;
public class ThirdLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++) {
        	ar[i]=sc.nextInt();
        }
        int first=ar[0],second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
        for(int i=1;i<n;i++) {
        	if(ar[i]>first) {
        		third=second;
        		second=first;
        		first=ar[i];
        	}
        	else if(ar[i]>second) {
        		third=second;
        		second=ar[i];
        	}
        	else {
        		third=ar[i];
        	}
        }
        System.out.println("Third largest number is"+third);
	}

}
