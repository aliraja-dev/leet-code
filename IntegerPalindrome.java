public class IntegerPalindrome {
    private static boolean isPalindrome(int n) {
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        return temp == sum ? true : false;
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(isPalindrome(number));
    }
}
