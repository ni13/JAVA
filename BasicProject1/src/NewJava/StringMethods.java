package NewJava;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sample strings
		String str = "java programing";
		String str2 = "java programming";
		String emptyStr = "";
		String blankstr= "";
		//length()
		System.out.println("lengeth of str:" +str.length());
		
		//toCharArray()
		char[] chars = str.toCharArray();
		System.out.println("character in str:");
		for (char c: chars) {
			System.out.println(c+ "");
			
		}
		System.out.println();
		
		// compareTo()
		int comparison = str.trim().compareTo(str2);
		System.out.println("Comparison result: " + comparison);
		
		// 4. isEmpty()
		System.out.println("Is emptyStr empty? " + emptyStr.isEmpty()); // true

		// 5. isBlank()
		System.out.println("Is blankStr blank? " + blankstr.isBlank()); // true

		// 6. charAt()
		System.out.println("Character at index 2: " + str.charAt(2));

		// 7. startsWith() and endsWith()
		System.out.println("Starts with 'a'? " + str.startsWith("a"));
		System.out.println("Ends with 'ing'? " + str.endsWith("ing"));

		// 8. toLowerCase()
		System.out.println("Lowercase: " + str.toLowerCase());

		// 9. toUpperCase()
		System.out.println("Uppercase: " + str.toUpperCase());

		// 10. trim()
		System.out.println("Trimmed str: '" + str.trim() + "'");

		// 11. strip()
		System.out.println("Stripped str: '" + str.strip() + "'");

		// 12. stripLeading()
		System.out.println("Leading stripped str: '" + str.stripLeading() + "'");

		// 13. stripTrailing()
		System.out.println("Trailing stripped str: '" + str.stripTrailing() + "'");
		
		//14. repeat()
		String repeated = "java ".repeat(4);
		System.out.println("repeated string:" + repeated);
		
		//15. contentEquals()
		boolean contentEqual = str.trim().contentEquals(str2);
		System.out.println("content equals? " +contentEqual);
	}

}