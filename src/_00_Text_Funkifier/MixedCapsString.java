package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
		String example = "";
		
	
		
		for (int i = 0; i < s.length(); i++) {
			
			String answer = s.substring(i, i+1);
			
			
			
			if(i%2==0) {
				
				example+=answer.toLowerCase();
				
			}
			
			if(i%2==1) {
				
				example+=answer.toUpperCase();	
				
			}
			
		}
		
		return example;
	}

}
