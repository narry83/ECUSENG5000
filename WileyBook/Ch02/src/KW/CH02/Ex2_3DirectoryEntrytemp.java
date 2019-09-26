package KW.CH02;

import java.util.ArrayList;

public class Ex2_3DirectoryEntrytemp {
	
	private final String aName;	
	private String number;
	
	public Ex2_3DirectoryEntrytemp(String aName, String number){
		this.aName=aName;
		this.number=number;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ex2_3DirectoryEntrytemp> theDirector = new ArrayList<>();
		
		theDirector.add(new Ex2_3DirectoryEntrytemp("Jane Smith", "5555491234"));
		theDirector.add(new Ex2_3DirectoryEntrytemp("Tom Holland", "555-124-1234"));
		theDirector.add(new Ex2_3DirectoryEntrytemp("Mary Cog", "755-124-1234"));
		theDirector.add(new Ex2_3DirectoryEntrytemp("Janey Smith", "785-124-1234"));
		
		int index = theDirector.indexOf(new Ex2_3DirectoryEntrytemp("Tom Holland", ""));
		
		System.out.println(index);
		
	}

}
