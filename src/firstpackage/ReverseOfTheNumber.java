package firstpackage;
import java.util.*;
public class ReverseOfTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=0;
		while(n>0) {
			int rem=n%10;
			result=result*10+rem;
			n=n/10;
		}
     System.out.println(result);
	}

}