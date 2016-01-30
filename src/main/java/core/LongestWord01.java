package core;

public class LongestWord01 {
	public static void main(String[] args) {
		String myString = "apple banana pear orange peack greap strawberry plum apricot melon watermelon";
		String[] words = myString.split(" ");
		int maxLength = 0;
		String longestWord = null;
		for (String s : words) {
			if (s.length() > maxLength) {
				maxLength = s.length();
				longestWord = s;
			}
		}
		System.out.println("Longest word: " + longestWord);
	}
}