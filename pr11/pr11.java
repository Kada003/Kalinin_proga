package pr11;

public class pr11 {

    public static void main(String[] args) {
            int number = 324124;
            int reversed = reverseNumber(number);
            System.out.println("Rеversed number: " + reversed);
        }

        static int reverseNumber(int n) {
            if (n < 10) {
                return n;
            } else {
                int lastDigit = n % 10;
                int remainingDigits = n / 10;
                int reversedRemaining = reverseNumber(remainingDigits);
                int orderOfMagnitude = (int) Math.pow(10, String.valueOf(remainingDigits).length());
                return lastDigit * orderOfMagnitude + reversedRemaining;
            }
        }
    }

