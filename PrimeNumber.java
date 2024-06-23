public class PrimeNumber {
    public static void main(String[] args) {
        int number = 36; // You can change this number to test other values
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; ++i) {
            // condition for nonprime number
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}
