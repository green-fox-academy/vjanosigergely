public class Strings {
    public static void main(String[] args) {

        String s = "xanaxalXanaXosxanaXotxanaxolok";

        System.out.println(xReplacer(s));


    }
    public static String xReplacer (String original) {
        String replaced = "";
        if (original.contains("x") == false) {
            replaced = replaced + original;
        } else {
            replaced = original.replace('x', 'y');
        }

        return replaced;

    }
    public static String xRecReplacer (String original) {
    
    }
}


//Given a string, compute recursively (no loops)
// a new string where all the lowercase 'x' chars have been changed to 'y' chars.