package firstpackage;
import java.util.*;
public class DuplicateCountInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        Set <Integer>set=new HashSet<Integer>();
        for(int i=0;i<n;i++) {
        	ar[i]=sc.nextInt();
        	set.add(ar[i]);
        }
       for(Integer s:set) {
    	   int count=0;
    	  // System.out.println(s);
    	   for(int j=0;j<n;j++) {
    		   if(s.equals(ar[j])) {
    			   count++;
    		   }
    	   }
    	   if(count>1) {
    		   System.out.println("Duplicates of "+s+" is: "+count);
    	   }
       }
	}

}
