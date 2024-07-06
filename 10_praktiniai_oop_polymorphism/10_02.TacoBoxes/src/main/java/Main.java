
public class Main {

    public static void main(String[] args) {
        // Test your code here!

        TripleTacoBox tacoBox = new TripleTacoBox();
        System.out.println(tacoBox);
        tacoBox.eat();
        tacoBox.eat();
        tacoBox.eat();
        tacoBox.eat();
        System.out.println(tacoBox);

        CustomTacoBox bigBox = new CustomTacoBox(2);
        System.out.println(bigBox);
        bigBox.eat();
        bigBox.eat();
        bigBox.eat();
        System.out.println(bigBox);

    }
}
