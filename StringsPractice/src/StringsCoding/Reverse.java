package StringsCoding;

public class Reverse {
	public static void main(String[] args) {
		//Given String "i am salma"
		//o/p:: salma am i
		
		String s1="i am salma";
		String[] s2=s1.split(" ");
		String res="";
		for(int i=s2.length-1;i>=0;i--) {
			res+=s2[i]+" ";
		}
			System.out.print(res);
			
		}
	}


