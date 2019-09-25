package KW.CH02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class ex2_2_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList =new ArrayList<>();
		myList.add("Tommy");
		myList.add("Harry");
		myList.add("Marry");
		myList.add("Harry");
		myList.add("Sally");
		ex2_2.replace(myList,"Harry","Larry" );
		System.out.println(myList);
		
		ex2_2.delete(myList,"Larry" );
		System.out.println(myList);

	}

}
