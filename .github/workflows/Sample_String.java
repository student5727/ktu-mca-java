package instruction;

public class Sample_String {
	public static void main(String[] args){
		//String Concatenation
		String str1 = "Rock";
		String str2 = "Star";
		//Method 1 : Using concat
		String str3 = str1.concat(str2);
		System.out.println(str3);
		//Method 2 : Using "+" operator
		String str4 = str1 + str2;
		System.out.println(str4);
		String str_Sample = "RockStar";
		  //Length of a String
		  System.out.println("Length of String: " + str_Sample.length());
		  String str_Sample1 = "RockStar";
		  System.out.println("Character at position 5: " + str_Sample1.charAt(5));
		  //Index of a given character
		  System.out.println("Index of character 'S': " + str_Sample1.indexOf('S'));
		  String str_Sample5 = "RockStar";
		  //System.out.println("Compare To 'ROCKSTAR': " + str_Sample5.compareTo("rockstar"));
		  //Compare to - Ignore case
		  System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample5.compareToIgnoreCase("ROCKSTAR"));
		  String str_Sample7 = "RockStar";
		  System.out.println("Contains sequence 'tar': " + str_Sample7.contains("tar"));
		}
		}


