package firstpackage;
import java.util.*;
public class PrimeNoCounts {
	  public static void main(String[] args) {
	    int count=0;
	  for(int n=2;n<100;n++) {
		  boolean flag = false;
	    for (int i = 2; i < n ; ++i) {
	      if (n % i == 0) {
	        flag = true;
	        break;
	      }
	    }
      
	    if (!flag) {
	      count++;
	    }
	  }
	    System.out.println("Prime number between 0 to 100 is "+count);
	  
	  }
	}
