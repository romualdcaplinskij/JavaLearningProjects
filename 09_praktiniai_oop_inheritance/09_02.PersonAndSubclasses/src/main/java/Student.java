public class Student extends Person{

    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public void credits(){
        this.credits++;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits: " + getCredits();
    }
}
