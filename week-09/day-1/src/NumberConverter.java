import java.util.HashMap;

public class NumberConverter {

  public static void main(String[] args) {
    String s = amountConverter(11);
    System.out.println(s);
  }

  public static String amountConverter(int amount) {

    String[] stuffAsWords = new String[]{"one", "ten", "hundred", "thousand", "million", "billion",
        "trillion", "quintillion", "toomuchillion"};
    String word = "";
    HashMap<Character, String> numberMap = new HashMap<>();
    numberMap.put('0', "");
    numberMap.put('1', "one");
    numberMap.put('2', "two");
    numberMap.put('3', "three");
    numberMap.put('4', "four");
    numberMap.put('5', "five");
    numberMap.put('6', "six");
    numberMap.put('7', "seven");
    numberMap.put('8', "eight");
    numberMap.put('9', "nine");

    HashMap<Character,String> tenMap = new HashMap<>();
    tenMap.put('0', "");
    tenMap.put('1', "");
    tenMap.put('2', "twenty");
    tenMap.put('3', "thirty");
    tenMap.put('4', "forty");
    tenMap.put('5', "fifty");
    tenMap.put('6', "sixty");
    tenMap.put('7', "seventy");
    tenMap.put('8', "eighty");
    tenMap.put('9', "ninety");

    HashMap<Character,String> tenToTwentyMap = new HashMap<>();
    tenToTwentyMap.put('0', "ten");
    tenToTwentyMap.put('1', "eleven");
    tenToTwentyMap.put('2', "twelve");
    tenToTwentyMap.put('3', "thirteen");
    tenToTwentyMap.put('4', "fourteen");
    tenToTwentyMap.put('5', "fifteen");
    tenToTwentyMap.put('6', "sixteen");
    tenToTwentyMap.put('7', "seventeen");
    tenToTwentyMap.put('8', "eighteen");
    tenToTwentyMap.put('9', "nineteen");

    char[] numArray = String.valueOf(amount).toCharArray();
    for (int i = 0; i < numArray.length - 2; i++) {
      if (numArray[i] == '0') {
        word = word + " " + numberMap.get(numArray[i]);
      } else {
        word = word + " " + numberMap.get(numArray[i]) + stuffAsWords[numArray.length - i - 1];
      }
    }
    if (numArray[numArray.length-2] != '0'&& numArray[numArray.length-1] != '0') {
      if (numArray[numArray.length - 2] != '1') {
        word = word + " " + tenMap.get(numArray[numArray.length - 2]) + numberMap
            .get(numArray[numArray.length - 1]);
      } else {
        word = word + " " + tenToTwentyMap.get(numArray[numArray.length - 1]);
      }
    }

    return word.replaceFirst("\\s","");
  }

}



//It occurs now and then in real life that people want to write about money, especially about a certain amount of money.
// If it comes to cheques or contracts for example some nations have laws that state that you should
// write out the amount in words additionally to the amount in numbers to avoid fraud and mistakes.
// So if you want to transfer 745 $ to someone via cheque you have to fill out to fields:
//
//745.00 $ (amount in numbers)
//
//seven hundred and fourty five dollars (amount in words)
//
//The Kata is now to write a little converter class or function (depends on your favourite language and flavour)
// to convert numbers into words.
//Convert it back.