public abstract class Animal {

    private String name;


    public Animal(){
    }
    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " eats");
    }

    public void sleep(){
        System.out.println(name + " sleps");
    }

    public String getName() {
        return name;
    }
}
