public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int cd = Math.max(a,b);

        System.out.println(commonDivisor(a, b, cd));
    }

    public static int commonDivisor (int a, int b, int cd){

        if ( a % cd == 0 && b % cd ==0) {
            return  cd;

        } else {
            return  commonDivisor(a, b, cd-1);
        }
    }
}

//Find the greatest common divisor of two numbers using recursion.
