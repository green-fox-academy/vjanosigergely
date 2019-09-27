public class Bunnies {
    public static void main(String[] args) {

        System.out.println(earCounter(10));

    }
    public static int earCounter (int bunnies) {
        if (bunnies == 1){
            return 2;
        } else {
            return 2 + earCounter(bunnies-1);
        }
    }
}

//We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).