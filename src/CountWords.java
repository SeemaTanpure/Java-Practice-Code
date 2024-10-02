
public class CountWords {

	public static void main(String[] args) {
		String words="one two three four five";
		int countWords=words.split("\\s").length;
		System.out.println(countWords);
	}

}
