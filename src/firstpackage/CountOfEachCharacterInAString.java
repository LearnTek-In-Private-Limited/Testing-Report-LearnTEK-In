package firstpackage;
import java.util.Scanner;
public class CountOfEachCharacterInAString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++) {
        	int count=1;
        	for(int j=i+1;j<str.length();j++) {
        		if((ch[i]!=' ')&&ch[i]==ch[j]) {
        			count++;
        			ch[j]=' ';
        		}
        	}
        	if(ch[i]!=' ') {
        		System.out.println(ch[i]+" "+count);
        	}
        }
        
	}
}
