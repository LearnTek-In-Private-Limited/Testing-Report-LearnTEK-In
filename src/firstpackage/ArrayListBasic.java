package firstpackage;
import java.util.*;
import java.io.*;
public class ArrayListBasic {
	List<String> l=new ArrayList<String>();
	List<String> l2=new ArrayList<String>();
	ArrayList <String> c=new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
        ArrayListBasic ab=new ArrayListBasic();
        int ch=0;
        while(ch<=22) {
        	System.out.println("1. Add elements in array list\n"
        			+ "2. Iterate through all elements in array list\n"
        			+ "3.Add elements into the array list at first position\n"
        			+ "4.Retrive an element for given index\n"
        			+ "5.update element\n"
        			+ "6.Remove 3rd element\n"
        			+ "7.Search for an element\n"
        			+ "8.Sort\n"
        			+ "9.Create a copy of list\n"
        			+ "10.Shuffle elements\n"
        			+ "11.Reverse element\n"
        			+ "12.Extract portion of list\n"
        			+ "13.compare two list\n"
        			+ "14.swap elements\n"
        			+ "15.join 2 arraylist\n"
        			+ "16.clone\n"
        			+ "17.Empty an array list\n"
        			+ "18.List is empty or not\n"
        			+ "19.Trim to size\n"
        			+ "20.Increase size\n"
        			+ "21.Replace 2nd element with new element\n"
        			+ "22.Elements of an ArrayList using the elements' position\n"
        			);
        	System.out.println("Enter your choice\n");
            ch=sc.nextInt();
            switch(ch){
            	case 1:ab.addElements();
            	break;
            	case 2:ab.iteration();
            	break;
            	case 3:
            		System.out.println("Enter string");
            		String s=sc.next();
            		ab.addAtFirst(0, s);
            		break;
            	case 4:
            		System.out.println("Enter index");
            		int index=sc.nextInt();
            		ab.getElement(index);
            		break;
            	case 5:
            		System.out.println("Enter index");
            		index=sc.nextInt();
            		System.out.println("Enter element");
            		s=sc.next();
            		ab.updateElement(index,s);
            		break;
            	case 6: ab.removeThirdElement();
            	break;
            	case 7: 
            		System.out.println("Enter string to search");
            	   s=sc.next();
        		   ab.search(s);
        		   break;
            	case 8:ab.sort();
            	break;
            	case 9: ab.copyList();
            	break;
            	case 10:ab.shuflleElements();
            	break;
            	case 11: ab.reverse();
            	break;
            	case 12: 
            		System.out.println("Enter start index");
            		int sindex=sc.nextInt();
            		System.out.println("Enter end index");
            		int eindex=sc.nextInt();
            		ab.extractPortionOfList(sindex,eindex);
            		break;
            	case 13:ab.compare();
            	break;
            	case 14: System.out.println("Enter first index");
        		int firstindex=sc.nextInt();
        		System.out.println("Enter second index");
        		int secondindex=sc.nextInt();
        		ab.swap(firstindex,secondindex);
        		break;
            	case 15:ab.join();
            	break;
            	case 16:ab.cloneList();
            	break;
            	case 17:ab.emptyList();
            	break;
            	case 18:ab.check();
            	break;
            	case 19:ab.trimListsize();
            	break;
            	case 20:ab.increase();
            	break;
            	case 21:
            		System.out.println("Enter string ");
             	   s=sc.next();
            		ab.updateSecondElement(s);
            	break;
            	case 22:ab.iterateUsingPosition();
            	break;
            	
            } 
        }
        
	}
    void addElements() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter no of elements to be added");
	   int n=sc.nextInt();
	   System.out.println("Enter elements");
	   for(int i=0;i<n;i++) {
       	l.add(sc.next());
       }
	   l2=l;
   }
    void addAtFirst(int n,String s) {
    	l.add(0,s);
    }
    void iteration() {
    	for(String s: l) {
        	System.out.print(s+" ");
        }System.out.println();
    }
    void getElement(int index) {
    	System.out.println(l.get(index));
    }
    void updateElement(int index,String s) {
    	       l.remove(l.get(index));
    			l.add(index,s);
    		}
    void removeThirdElement() {
    	l.remove(l.get(2));
    }
    void search(String s) {
    	boolean flag=false;
    	for(String i:l) {
    		if(i.equals(s)) {
    			System.out.println("Element is found");
    			flag=true;
    			break;
    		}
    	}
    	if(!flag) {
    		System.out.println("Element is not found");
    	}
    }
    void sort() {
    	l.sort(null);
    }
    void copyList() {
    	List<String> copy=new ArrayList<String>(l);
    	System.out.println(copy);
    }
    void shuflleElements() {
    	Collections.shuffle(l);
    }
    void reverse() {
    	Collections.reverse(l);
    }
    void extractPortionOfList(int sindex,int eindex) {
    	if(sindex>=0 && eindex<l.size()) {
    	System.out.println(l.subList(sindex, eindex));
    	}
    	else {
    		System.out.println("Mention correct index");
    	}
    }
    void compare() {
    	if(l.equals(l2)) {
    		System.out.println("They are equal");
    	}
    	else {
    		System.out.println("They are not equal");
    	}
    }
    void swap(int index1,int index2) {
    	Collections.swap(l, index1, index2);
    }
    void join() {
        l.addAll(l2);
    }
    void cloneList() {
    	
    	c=(ArrayList<String>) ((ArrayList<String>) l).clone();
    	System.out.println(c);
    }
    void emptyList() {
    	c.clear();
    	System.out.println(c);
    }
    void check() {
    	if(l2.isEmpty()) {
    		System.out.println("IsEmpty");
    	}
    	else {
    		System.out.println("Is not Empty");
    	}
    }
    void trimListsize() {
    	((ArrayList<String>) l).trimToSize();
    	
    }
    void increase() {
    	((ArrayList<String>) l).ensureCapacity(100);
    }
    void updateSecondElement(String s) {
    	l.remove(l.get(2));
    			l.add(2,s);
    }
    void iterateUsingPosition() {
    	for(int i=0;i<l.size();i++) {
    		System.out.print(l.get(i)+" ");
    	}
    	System.out.println();
    }
}
