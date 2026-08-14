
import java.util.Scanner;
import java.util.TreeSet;
public class TokenizeAndSort {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line of text:");
		//String inputText ="this is unit2 java program"
		String inputText = scanner.nextLine();
		String[] tokens = inputText.split("\\s+");
		TreeSet<String> tokenSet = new TreeSet<>();
		for (int i = 0; i < tokens.length; i++)
		{
			tokenSet.add(tokens[i]);
		}
		System.out.println("Tokens in scending sorted order:");
		for (String token : tokenSet)
		{
			System.out.println(token);
		}
		scanner.close();
	}
}

