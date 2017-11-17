import java.util.Scanner;

public class AllSubsequences {
	
	
	private static int c =0;
	private static Scanner scan;

	public static void main(String args[]) {
		
		scan = new Scanner(System.in);
		String str = scan.next();
		printSubsequences(str);
	}

	private static void printSubsequences(String str) {
		
		printSubsequences(str,"");
		System.out.println("the no of subsequences are :"+c);
		
	}

	private static void printSubsequences(String input, String output) {
		
		if(input.isEmpty()) {
			System.out.println(output);
			c++;
			return ;
		}
		String s = input.substring(1);
		printSubsequences(s, output);
		printSubsequences(s, output+input.charAt(0));
	}

}
