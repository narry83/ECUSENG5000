package KW.CH02;

import java.util.ArrayList;

public class Ex2_3DirectoryEntryNew {

	private String aName;
	private String number;

	public Ex2_3DirectoryEntryNew(String aName, String number) {
		this.aName = aName;
		this.number = number;
	}

	public String toString() {
		return "[" + aName + "; " + number + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ex2_3DirectoryEntryNew> theDirectory = new ArrayList<>();
		

		theDirectory.add(new Ex2_3DirectoryEntryNew("Jane Smith", "5555491234"));
		theDirectory.add(new Ex2_3DirectoryEntryNew("Tom Holland", "555-124-1234"));
		theDirectory.add(new Ex2_3DirectoryEntryNew("Mary Cog", "755-124-1234"));
		theDirectory.add(new Ex2_3DirectoryEntryNew("Janey Smith", "785-124-1234"));

		int index1 = theDirectory.indexOf(new Ex2_3DirectoryEntryNew("Jane Smith", "5555491234"));//Does not return Index

		int index2 = theDirectory.indexOf(new Ex2_3DirectoryEntryNew("Jane Smith", "")); //Does not return Index

		Ex2_3DirectoryEntryNew element2 = new Ex2_3DirectoryEntryNew("Jane Smith", "5555491234");
		int index3 = theDirectory.indexOf(element2); //Does not return Index

		Ex2_3DirectoryEntryNew element1 = theDirectory.get(0);
		int index4 = theDirectory.indexOf(element1); //Returns

		System.out.println("index1 " + index1 + " index2 " + index2 + " index3 " + index3+" index4 " + index4 );

		System.out.println(theDirectory);

	}

}