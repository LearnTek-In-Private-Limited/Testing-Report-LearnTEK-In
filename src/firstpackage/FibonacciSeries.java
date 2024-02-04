package firstpackage;
import java.util.Scanner;
public class FibonacciSeries {
	static int temp1=0,temp2=1,temp3=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1) {
    		System.out.print(temp1);
    	}
        else if(n==2) {
    		System.out.print(temp1+" "+temp2+" ");
    	}
    	else if(n>3){
    	    System.out.print(temp1+" "+temp2+" ");
           fibonacciSeries(n) ;
    	}
	}
    static void fibonacciSeries(int n) {
    	if(n<3) {
    		return;
    	}
    	temp3=temp1+temp2;
    		System.out.print(temp3+" ");
    		temp1=temp2;
    		temp2=temp3;
    		fibonacciSeries(n-1);
    	
    }
}
