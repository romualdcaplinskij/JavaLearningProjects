
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here
        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();
        dog.sleep();
        System.out.println();

        Dog fido = new Dog("Fido");
        fido.eat();
        fido.makeNoise();
        fido.sleep();
        System.out.println();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.makeNoise();
        garfield.eat();
        garfield.purr();

    }

}
