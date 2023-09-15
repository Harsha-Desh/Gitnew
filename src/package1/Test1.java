package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		
		char c [] = {'a','b','c','d'};
		System.out.println(	Arrays.toString(c)); //[a,b,c,d]
		
		String arr;
		System.out.println(c);
		Character.toUpperCase(3);
		System.out.println(Character.toUpperCase(3));
System.out.println(" hii made some changes");
		//reverse a string on place 
		String s1 = "hey! how are you?";
		String rev;
		
		String[] s2 = s1.split(" ");
		
		//System.out.println(s2);// error , you cant access directy , you need for loop
		
		for(String a:s2) {
			System.out.print(a + " ");
			}
		System.out.println();
		
		ArrayList<Integer> arl = new ArrayList<Integer>();
		
		for(int i=0; i<=10; i++) {
			arl.add(i);	
			}
		
		System.out.println(arl);//arraylist
		System.out.println();
		Iterator itr = arl.iterator();
		while(itr.hasNext()) {
			int i1 =  (int) itr.next();
			//System.out.print(i1 +" ");// only numbers without brackets
			if (i1%2!=0) {
				
				itr.remove();
				System.out.print(i1 +" ");
		
		
	
}}}}
