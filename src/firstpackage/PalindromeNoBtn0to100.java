package firstpackage;

public class PalindromeNoBtn0to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Palindrome numbers are: ");
      for(int i=10;i<100;i++) {
    	  int no=0;int temp=i;
    	  while(temp!=0) {
    		  int rem=temp%10;
    		  no=no*10+rem;
    		  temp=temp/10;
    	  }
    	  if(i==no) {
    		  System.out.print(no+" ");
    	  }
      }
	}

}
