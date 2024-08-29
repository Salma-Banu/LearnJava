package StringsCoding;

public class RemoveCharOccurence {

//    public static void main(String[] args) {
//        
//        String str = "salma";
//        char c = 'a';
//        StringBuilder finalstr = new StringBuilder();  // Use StringBuilder for efficiency
//        
//        for (int i = 0; i < str.length(); i++) {
//            char c1 = str.charAt(i);
//            if (c1 != c) {
//                finalstr.append(c1);  // Append only the current character, not the whole string
//            }
//        }
//        
//        System.out.println(finalstr.toString());  // Convert StringBuilder to String for output
//    }
//}


public static void main(String[] args) {
	String str = "CloudTeCh";
	char c = 'C';
	removeChar(str, c);
}

public static void removeChar(String str, char c) {
	String finalStr = "";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i) != c)
			finalStr += str.charAt(i);
	}
	
	System.out.println(finalStr);
}

}