package implementcharsequence;

public class Shifter implements CharSequence {
    String shifter;
    int shiftWith;

    Shifter(String word, int index){
        shifter = word;
        shiftWith = index;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        int n = (index + shiftWith) % shifter.length();
        //String twiceshifter = shifter + shifter;
        return shifter.charAt(n);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
