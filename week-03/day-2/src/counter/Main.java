package counter;

public class Main {
    public static void main(String[] args) {
        Counter first = new Counter(3);

        first.add(2);
        first.add();

        System.out.println(first.get());
        first.reset();


    }
}
