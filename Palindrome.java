import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome() {
		Scanner scanner = new Scanner(System. in);
		String x = scanner.nextLine();
		int j = x.length() - 1;
		for(int i = 0; i <=x.length() - 1; i++) {
			if(!(x.charAt(i) == (x.charAt(j)))) {
				return false;
			}
			
			j --;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome());
	}

}
