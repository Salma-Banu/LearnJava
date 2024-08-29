package StringsCoding;

//	create a List of Strings add values in it if the length of the String is 3 or 4 then add join the string with hypen(-) and print only those values in a new String called namelist 
//	and do this using stream 
//
//
//	import java.util.Arrays;
//	import java.util.List;
//	import java.util.stream.Collectors;
//
//	public class StringJoiner {
//	    public static void main(String[] args) {
//	        List<String> names = Arrays.asList("5", "Jerry", "Bob", "6", "Sam", "Johna", "Mike", "Suee");
//
//	        String namelist = names.stream()
//	                               .filter(name -> name.length() == 3 || name.length() == 4)
//	                               .collect(Collectors.joining("-"));
//
//	        System.out.println(namelist);
//	    }
//	}
//
//	
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import java.util.stream.Collectors;

	public class StringJoiner {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<String> names = new ArrayList<>();
	        List<String> tempNames = new ArrayList<>();

	        System.out.println("Enter names (type 'exit' to stop):");

	        // First loop: Collect input in temp variable and store in tempNames list
	        while (true) {
	            String temp = scanner.nextLine();
	            if (temp.equalsIgnoreCase("exit")) {
	                break;
	            }
	            tempNames.add(temp);
	        }

	        // Second loop: Add values to the names list if the length is 3 or 4
	        for (String name : tempNames) {
	            if (name.length() == 3 || name.length() == 4) {
	                names.add(name);
	            }
	        }

	        // Using streams to join the filtered names with hyphen
	        String namelist = names.stream()
	                               .collect(Collectors.joining("-"));

	        System.out.println("Filtered and joined names: " + namelist);
	    }
	}



