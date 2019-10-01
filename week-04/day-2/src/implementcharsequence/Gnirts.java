package implementcharsequence;

public class Gnirts implements CharSequence {
    String gnirt = "example";

    Gnirts(String string){
        this.gnirt = string;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return gnirt.charAt(gnirt.length()-index-1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
