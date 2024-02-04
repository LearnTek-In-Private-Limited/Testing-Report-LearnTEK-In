package firstpackage;
import java.util.*;
public class GivenNoIsArmstrong {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int temp=n;
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
	            System.out.print(temp+"is armstrong number");
			}
			else {
				System.out.print(temp+"is not an armstrong number");
			}
		}

	
}
