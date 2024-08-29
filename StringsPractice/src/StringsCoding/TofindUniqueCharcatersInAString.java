package StringsCoding;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class TofindUniqueCharcatersInAString {
	//given unique characters from strings without using switch case
	//input:The Quick Brown Fox Jumps over the Lazy Dog
	//output:26
	public static void main(String[] args) {
	
	//String str="The Quick Brown Fox Jumps over the Lazy Dog";
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String: ");
	String str=sc.nextLine();
	
	int countVowels=0;
	str=str.replaceAll(" ","").toLowerCase();
	
	Set<Character>charset=new HashSet<>();
	
	for(int i=0;i<str.length();i++) 
	{
		char c=str.charAt(i);
		charset.add(c);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			countVowels++;
			
	}
	
	}
	System.out.println("vowels no is:"+countVowels);
	System.out.println("unique character no. is::"+charset.size());
	
	
	
}
}

