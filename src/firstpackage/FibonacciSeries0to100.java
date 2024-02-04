package firstpackage;
import java.util.Scanner;
public class FibonacciSeries0to100 {
	static int temp1=0,temp2=1,temp3=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
         System.out.print(temp1+" "+temp2+" ");
           fibonacciSeries(temp1,temp2,temp3) ;
    	}
    static void fibonacciSeries(int temp1,int temp2,int temp3) {
    	temp3=temp1+temp2;
    	if(temp3<=100) {
    	System.out.print(temp3+" ");
    	temp1=temp2;
    	temp2=temp3;
    	fibonacciSeries(temp1,temp2,temp3);
    	}
    	else {
    		return;
    	}
    	
    }
}