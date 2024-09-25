package Week_2;

import java.math.*;

public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        BigInteger n1 = new BigInteger(a,2);
        BigInteger n2 = new BigInteger(b, 2);

        BigInteger sum = n1.add(n2);
        return sum.toString(2);
    }
}
