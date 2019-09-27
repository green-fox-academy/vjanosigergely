public class SumDigits {
    public static void main(String[] args) {

        System.out.println(digitAdder(123456789));

    }
    public static int digitAdder (int n) {

        if (n < 10) {
            return n;
        } else {
        return n % 10 + (digitAdder(n/10));
        }
    }

}


//Sum Digits
//Given a non-negative integer n, return the sum of its digits recursively (without loops).
//
//Hint
//Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//
//Java, C++, C#, Python
//Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).