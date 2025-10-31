import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] freq = new int[10];
        while (n > 0) {
            freq[(int)(n % 10)]++;
            n /= 10;
        }
        for (int i = 0; i < 10; i++)
            if (freq[i] > 0)
                System.out.println(i + " → " + freq[i]);
    }
}
