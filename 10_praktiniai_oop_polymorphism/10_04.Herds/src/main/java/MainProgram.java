public class MainProgram {

    public static void main(String[] args) {
        Organism organism = new Organism(-5, 3);
        System.out.println("Prints organizm cordinates");
        System.out.println(organism);
        //moving by organism
        organism.move(10, 2);
        System.out.println("Coordinates after moving by x = 10, y = 2");
        System.out.println(organism);

        //testing Herd
        Herd herd = new Herd();
        herd.addToHerd(new Organism(1, 5));
        herd.addToHerd(new Organism(0,0));
        herd.addToHerd(new Organism(2,2));
        System.out.println("Prints herd coordinates");
        System.out.println(herd);

        herd.move(10,10);
        System.out.println("Prints new herd cooridantes after moving x = 10, y = 10");
        System.out.println(herd);

    }
}
