public class palindrome {
    public static void main(String[] args) {
        int n = 525;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n) {
        int rev = 0, original = n;

        while (n > 0) {
            // Multiply the current reversed value by 10 and add the last digit of n
            rev = rev * 10 + n % 10;
            // Example: rev = 0 * 10 + 525 % 10; (rev = 5)
            //          rev = 5 * 10 + 52 % 10;  (rev = 52)
            //          rev = 52 * 10 + 5 % 10;  (rev = 525)
            
            // Remove the last digit from n
            n = n / 10;
        }

        // Check if the original number is equal to the reversed number
        return original == rev;
    }
}
