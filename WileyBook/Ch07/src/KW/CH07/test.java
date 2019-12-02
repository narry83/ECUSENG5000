package KW.CH07;

import java.io.*;
import java.util.*;
class test{
	private SortedMap<String, ArrayList<Integer>> index;
	public test() {
		index = new TreeMap<String, ArrayList<Integer>>();
	}
	public void buildIndex(Scanner scan) {
		int lineNum= 0; // Line number
		// Keep reading lines until done.
		while (scan.hasNextLine()) {
			lineNum++;
			//Extract each token and store it in index.
			String token;
			while ((token = scan.findInLine("[\\p{L}\\p{N}']+")) != null) {
				token = token.toLowerCase();
				ArrayList<Integer> lines = index.get(token);
				if (lines == null) {
					lines = new ArrayList<Integer>();
				}
				lines.add(lineNum);
				index.put(token, lines); //Store new list
			}
			scan.nextLine();
		}
	}
	void showIndex() {
		for (Map.Entry<String, ArrayList<Integer>> entry : index.entrySet()){
			System.out.print(entry.getKey());
			System.out.print(":\t");
			ArrayList<Integer> refs = entry.getValue();
			System.out.print(refs.get(0));
			for (int i= 1; i< refs.size(); i++) {
				System.out.print(", ");
				System.out.print(refs.get(i));
			}
			System.out.println();
			//System.out.println();
		}
	}



	public static void main(String[] args)  {
		
		Scanner in = new Scanner(System.in);
		Scanner scan = null;
		try {
			scan = new Scanner(new FileReader("test.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		test indexGenerator = new test(); 
		indexGenerator.buildIndex(scan); 
		indexGenerator.showIndex();
		
	}
}