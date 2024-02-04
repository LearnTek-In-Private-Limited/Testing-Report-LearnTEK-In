package firstpackage;
import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		System.out.print("The armstrong numbers are ");
		for(int i=0;i<1000;i++) {
		int n=i;int temp=n;
		int result=0;int length=0;
		while(n>0) {
			length++;
			n=n/10;
		}
		n=temp;
		while(n>0) {
			int rem=n%10;
			result+=Math.pow(rem, length);
			n=n/10;
		}
		if(temp==result) {
            System.out.print(temp+" ");
		}
		
		}
	}

}
	