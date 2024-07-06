import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        Person ada = new Person("Ada Lovelace", "Some address in Vilnius, Lithuania");
        Person esko = new Person("Some Esko", "Far far kingdom");

        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie Shomolie", "University of Nowhere");
        System.out.println(ollie);
        System.out.println("Study credits: " + ollie.getCredits());
        ollie.credits();
        System.out.println(ollie);

        Teacher prada = new Teacher("Prada Lovelace", "Some address in Vilnius, Lithuania", 1200);
        Teacher eskimo = new Teacher("Some Eskimo", "Far far kingdom", 1400);

        for (int i = 0; i < 25; i++){
            ollie.credits();
        }

        System.out.println(prada);
        System.out.println(eskimo);
        System.out.println(ollie);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Prada Lovelace", "Some address in Vilnius, Lithuania", 1200));
        persons.add(new Teacher("Some Eskimo", "Far far kingdom", 1400));

        printPersons(persons);

    }

    public static void printPersons(ArrayList<Person> person){
        for (Person i : person) {
            System.out.println("---------------------------");
            System.out.println(i);
            System.out.println("----------------------------");
        }

    }

}
