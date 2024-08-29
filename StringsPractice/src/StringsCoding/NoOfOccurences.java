


package StringsCoding;

import java.util.HashMap;

public class NoOfOccurences {
	public static void main(String[] args) {
		
		String str="aabbbcaa";
		HashMap<Character, Integer>map=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(map.containsKey(c)) {
				int count=map.get(c);
				count++;
				map.replace(c,count);
				
			}
			else {
				map.put(c, 1);
			}
			
			
		}
		//for(chracter.key:map.getKeyset()) {
			
		}
	}


