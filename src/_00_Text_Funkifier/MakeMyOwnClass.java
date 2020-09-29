package _00_Text_Funkifier;

public class MakeMyOwnClass extends SpecialString{

	public MakeMyOwnClass(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		
		String allCaps = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			
			String give = s.substring(i, i+1);
			
			allCaps+=give.toUpperCase();
			
			
		}
		
		return allCaps;
	}

	
	
	
}
