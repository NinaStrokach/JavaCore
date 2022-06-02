package HW3;

public class main {
    public static void main(String[] args) {
        doFruits();
    }
    private static void doFruits() {
        BoxFruit<Apple> appleBox = new BoxFruit<>(1);
        BoxFruit<Orange> orangeBox = new BoxFruit<>(1.2);
        BoxFruit<Apple> appleBox2 = new BoxFruit<>(0.5);

        for (int i = 0; i < 4; i++ ) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox2.addFruit(new Apple());

        System.out.println("Weight appleBox: " + appleBox.getBoxWeight());
        System.out.println("Weight orangeBox: " + orangeBox.getBoxWeight());
        System.out.println("Weights equals - " + appleBox.compare(orangeBox));
        System.out.println("-----------------------------------------------------------");

        appleBox.addFruits(appleBox2);
    }
}
