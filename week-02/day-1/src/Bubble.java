import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] numberList = {34, 12, 24, 9, 5};
        boolean descending = true;

        for (int i = 0; i <numberList.length ; i++) {
            System.out.print(bubble(numberList,descending)[i] + " ");
        }
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        //System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        //System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }
    public static int[] bubble (int[] numberList, boolean decending){
        Arrays.sort(numberList);
        int [] reverse = new int[numberList.length];
        for (int i = 0; i <reverse.length ; i++) {
            reverse[i] = numberList[numberList.length-1-i];
        }

        int [] sendBackList = new int [numberList.length];

        if (decending) {
            sendBackList = reverse;
        } else {
            sendBackList = numberList;
        }

        return sendBackList;
    }
}