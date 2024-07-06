
public class HealthStation {

    private int counter;

    public HealthStation(){
        counter = 0;
    }

    public int weigh(Person person) {
        counter += 1;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings(){
        return counter;
    }
}
