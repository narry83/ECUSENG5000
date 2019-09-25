package KW.CH02;

public class EX2_3_Directory_Entry {
	
	private final String aName;	
	private String number;
	
	public EX2_3_Directory_Entry(String aName, String number){
		this.aName=aName;
		this.number=number;		
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getName() {
		return aName;
	}

	public void setNumber(String number) {
		this.number=number;
	}
	
	@Override
    public String toString() {
        return "[" + aName + "; " + number + "]";
     }
	
   

}
