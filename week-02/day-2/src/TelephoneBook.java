import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String , String> phoneBook = new HashMap<String, String>();

        phoneBook.put("William A. Lathan" ,	"405-709-1865");
        phoneBook.put("John K. Miller" , "402-247-8568");
        phoneBook.put("Hortensia E. Foster" , "606-481-6467");
        phoneBook.put("Amanda D. Newland", "319-243-5613");
        phoneBook.put("Brooke P. Askew" , "307-687-2982");

        //What is John K. Miller's phone number?
        System.out.println("The phone number of John K. Miller is: " + phoneBook.get("John K. Miller"));
        //Whose phone number is 307-687-2982?

        for (Map.Entry<String,String> obj: phoneBook.entrySet()){
            if (obj.getValue() == "307-687-2982" ) {
                System.out.println("307-687-2982 is the phone number of " + obj.getKey());
            }

        }


        //Do we know Chris E. Myers' phone number?*/
        phoneBook.containsKey("Chris E. Myers");





    }
}
/*
    We are going to represent our contacts in a map where the keys are going to be strings and the values are going to be strings as well.

        Create a map with the following key-value pairs.

        Name (key)	Phone number (value)
        William A. Lathan	405-709-1865
        John K. Miller	402-247-8568
        Hortensia E. Foster	606-481-6467
        Amanda D. Newland	319-243-5613
        Brooke P. Askew	307-687-2982
        Create an application which solves the following problems.

        What is John K. Miller's phone number?
        Whose phone number is 307-687-2982?
        Do we know Chris E. Myers' phone number?*/
