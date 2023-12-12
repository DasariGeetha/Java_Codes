package ListCollections;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Repeat {
	public static void main(String[] args) {
		String s1 = "Apart from counting words and characters, our online editor can help you to improve word choice and writing style, and, optionally, help you to detect grammar mistakes and plagiarism. To check word count, simply place your cursor into the text box above and start typing. You'll see the number of characters and words increase or decrease as you type, delete, and edit them. You can also copy and paste text from another program over into the online editor above. The Auto-Save feature will make sure you won't lose any changes while editing, even if you leave the site and come back later.";
		String[] a1 = s1.split(" ");

		Map<String, Integer> w1 = new HashMap<String, Integer>();
		for (String string : a1) {

			if (w1.containsKey(string)) {
				Integer i = w1.get(string);
				w1.put(string, i + 1);
			} else {
				w1.put(string, 1);

			}
		}

		System.out.println("List of duplicate words");
		Set<Entry<String, Integer>> e1 = w1.entrySet();
		for (Entry<String, Integer> entry : e1) {
			if (entry.getValue() > 1) {
				String s3 = entry.getKey();
				Integer v1 = entry.getValue();
				System.out.println(s3 + " " + v1);

			}
		}

	}

}
