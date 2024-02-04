package firstpackage;
import java.util.*;
public class LargestOfFourNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int result=0;
        if((n1>=n2)&&(n1>=n3)&&(n1>=n4)) {
        	result=n1;
        }
        else if((n2>=n1)&&(n2>=n3)&&(n2>=n4)) {
        	result=n2;
        }
        else if((n3>=n1)&&(n3>=n2)&&(n3>=n4)) {
        	result=n3;
        }
        else {
        	result=n4;
        }
        System.out.println("The largest of four numbers is:"+ result);
	}

}
