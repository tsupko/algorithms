package chapter1.section1;

/**
 * Created by Waylesange on 25.06.17.
 */
public class Euclid {
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(11, 121));
    }
}
