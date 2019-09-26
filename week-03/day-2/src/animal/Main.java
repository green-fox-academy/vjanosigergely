package animal;

public class Main {
    public static void main(String[] args) {
        Animal zebra = new Animal();
        Animal monkey = new Animal();
        Animal spinyLumpSucker = new Animal();

        zebra.eat();
        monkey.drink();
        monkey.drink();
        monkey.play();
        zebra.play();
        monkey.play();
        for (int i = 0; i < 20 ; i++) {
            zebra.eat();
        }

        Farm aholElunk = new Farm();

        aholElunk.farm.add(zebra);
        aholElunk.farm.add(monkey);

        for (int i = 0; i < 8 ; i++) {
            aholElunk.farm.add(spinyLumpSucker);
        }

        aholElunk.breed(monkey);
        aholElunk.slaughter();
        aholElunk.breed(monkey);
    }
}
