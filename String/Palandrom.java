package String;

import java.util.Scanner;

public class Palandrom {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        palandrom(str);

    }

    public static void palandrom(String str) {

        int n = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break; // exit the loop as soon as a mismatch is found
            }
        }

        if (isPalindrome) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}
