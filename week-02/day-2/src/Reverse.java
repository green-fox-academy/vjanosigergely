import java.util.Arrays;

public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(reversed));
    }
    public static String reverse (String basetext) {
        int length = basetext.length();
        char [] original = new char[length];
        for (int i = 0; i < length ; i++) {
            original[i] = basetext.charAt(i);
        }

        char [] reversed = new char[length];
        for (int i = 0; i <length ; i++) {
            reversed[i] = original[length-i-1];
        }



        /*StringBuilder builder = new StringBuilder();

        for (String string : reversed) {
            if (builder.length() > 0) {
                builder.append("");
            }
            builder.append(string);
        }
        String string = builder.toString()

        String string;*/

        String backwards = Arrays.toString(reversed).replace(", " , "").replace("[", "").replace("]", "");


        return backwards;
    }

}
