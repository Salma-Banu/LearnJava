package StringsCoding;

public class ToFindVowelOfString {
	
	public static void main(String[] args) {

		String str="The Quick Brown Fox Jumps over the Lazy Dog";
		int countVowels = 0;
		str=str.replaceAll(" ", "").toLowerCase();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u') {
				countVowels++;
				
			}
		}
		System.out.println("Vowels "+countVowels);
		
		
}
}
