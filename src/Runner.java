
public class Runner {

	public static void main(String[] args) {

		String word = "WASSUP";

		System.out.println(wordManipulator(word));
		;

	}

	static String wordManipulator(String word) {

		char manipulatedLetter;
		String manipulatedWord = "";

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		char letter;

		int wordLength = word.length() - 1;

		for (int i = 0; i <= wordLength; i++) {

			letter = word.charAt(i);

			int indexOfLetter = alphabet.indexOf(letter);

			if (indexOfLetter <= 13) {

				manipulatedLetter = alphabet.charAt(indexOfLetter + 13);

			} else {

				manipulatedLetter = alphabet.charAt(indexOfLetter - 13);

			}

			manipulatedWord = manipulatedWord + manipulatedLetter;
		}

		return manipulatedWord;

	}

}
