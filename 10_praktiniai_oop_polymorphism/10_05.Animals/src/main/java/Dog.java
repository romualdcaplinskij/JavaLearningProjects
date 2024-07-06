public class Dog extends Animal implements NoiseCapable{



    public Dog(String name) {
        super(name);
    }

    public Dog(){
        super("Dog");
    }

    public void bark() {
        System.out.println("bark");
    }


    public void makeNoise() {
        System.out.println(getName() + " barks");
    }
}
