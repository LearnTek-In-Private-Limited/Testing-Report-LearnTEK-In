package firstpackage;
import java.util.*;
public class RemoveComma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		        String str=sc.nextLine();
		        String temp="";
		        for(int i=0;i<str.length();i++) {
		        	if(str.charAt(i)==',') {
		        		continue;
		        	}
		        	else {
		        	temp+=str.charAt(i);
		        	}
		        }
		        System.out.println("The new string is "+temp);
			}

	}


