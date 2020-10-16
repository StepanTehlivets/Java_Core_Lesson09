package ua.academy.lgs1;

public class Application {
	public static void main(String[] args) {
		String sentence = "Gold is a chemical element with the symbol Au (from Latin: aurum) and atomic number 79,"
				+ " making it one of the higher atomic number elements that occur naturally.";

		System.out.println(sentence.replace("o", "-").replace("a", "-").replace("e", "-")
				.replace("i", "-").replace("u", "-").replace("A", "-"));

		String[] senten = sentence.split(" ");
		int words = senten.length;
		for (int i = 0; i < senten.length; i++) {
			String string = senten[i];
			if (string.length() <= 2) {
				words--;
			}
		}

		System.out.println(words);

	}

}
