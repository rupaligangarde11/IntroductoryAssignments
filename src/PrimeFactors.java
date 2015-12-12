import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rupalig on 09/12/15.
 */
class PrimeFactorDemo {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number :");
        n = scanner.nextInt();
        generate(n);

        for (Integer integer : generate(n)) {
            System.out.println(integer);
        }
    }
    public static ArrayList<Integer> generate(int n) {

        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return (ArrayList<Integer>) factors;
    }
}