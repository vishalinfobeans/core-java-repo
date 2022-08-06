package ipa;


// convert tochar array
//remove char from string, then check its there of not
// if not : output
//if there: remove/replace that char with blank
public class FirstNonRepeating {
	public static void main(String[] args) {
		String s1 = "vviisyshhal";
		char blank='\u0000';
		char[] charArray = s1.toCharArray();
		int count = 1;
		for(char c1: charArray) {
			if(s1.indexOf(c1)!=-1) {
				s1= s1.substring(0,s1.indexOf(c1)).concat(s1.substring(s1.indexOf(c1)+1, s1.length()));
				if(s1.indexOf(c1)==-1) {
					System.out.println("first nr=="+c1);
					break;
				}else {
					s1=s1.replace(c1, blank).trim();
				}
			}
			
		}
	}
}