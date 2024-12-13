import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me an int and I'll print out all primes less than or equal to that num");
        int num = sc.nextInt();
        printPrimes(num);
    }

    public static boolean checkPrime(int check) {
        if (check <= 1) {
            return false;
        }
        int i = 2;
        while (i * i <= check) {
            if (check % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void printPrimes(int max) {
        int i = 2;
        while (i <= max) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }
}