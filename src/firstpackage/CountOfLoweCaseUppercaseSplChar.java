package firstpackage;
import java.util.*;
public class CountOfLoweCaseUppercaseSplChar {
static int lcount=0,upcount=0,spl=0,dig=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in) ;
      String str =sc.nextLine();
      for(int i=0;i<str.length();i++) {
    	  checkCharCount(str.charAt(i));
      }
      System.out.println("lower case="+lcount+"  uppercase="+upcount+"  spl char="+spl+" "
      		+ " digit="+dig);
	}
  static void checkCharCount(char ch) {
	  if(ch>='a'&&ch<='z') {
		  lcount++;
	  }
	  else if(ch>='A'&&ch<='Z') {
		  upcount++;
	  }
	  else if(ch>='0' && ch<='9') {
		  dig++;
	  }
	  else {
		  if(ch!=' ') {
		  spl++;
		  }
	  }
  }
}
