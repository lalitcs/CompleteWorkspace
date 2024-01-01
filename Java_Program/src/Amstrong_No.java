public class Amstrong_No {
    static int power(int base, int exp) {
        int pow = 1;
        for (int i = 1; i <= exp; i++) {
            pow = pow * base;
        }
        return pow;
    }

    public static void main(String[] args) {
        int n = 153; // Change this number to the one you want to check
        int n1 = n;
        int exp = countDigits(n);
        int rem = 0;
        int sum = 0;

        while (n != 0) {
            rem = n % 10;
            sum = sum + power(rem, exp);
            n = n / 10;
        }

        if (n1 == sum) {
            System.out.println(n1 + " is an Armstrong number.");
        } else {
            System.out.println(n1 + " is not an Armstrong number.");
        }
    }

    static int countDigits(int c) {
        int count = 0;
        while (c != 0) {
            count++;
            c = c / 10;
        }
        return count;
    }
}
