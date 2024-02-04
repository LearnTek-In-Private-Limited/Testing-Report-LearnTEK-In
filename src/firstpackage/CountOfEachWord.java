package firstpackage;
import java.util.Scanner;
public class CountOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        for(int i=0;i<str.length;i++) {
        	int count=1;
        	for(int j=i+1;j<str.length;j++) {
        		if(str[i]!=" " && str[i].equals(str[j])) {
        			count++;
        			str[j]=" ";
        		}
        	}
        	if(str[i]!=" ") {
        		System.out.println(str[i]+" "+count);
        	}
        }
	}

}
