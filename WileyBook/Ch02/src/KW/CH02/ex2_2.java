package KW.CH02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;


public class ex2_2 {	
	

	public static void replace(ArrayList<String> aList, String oldItem,String newItem){
		// TODO Auto-generated method stub
		for (int i=0;i<aList.size();i++) {
			if( aList.get(i).equals(oldItem)) {
			aList.set(i, newItem);
			System.out.println("Replaced");			
			}

		}
	}
	
	
	public static void delete(ArrayList<String> aList, String Target){
		int index=aList.indexOf(Target);
		aList.remove(index);
	}
		
}
