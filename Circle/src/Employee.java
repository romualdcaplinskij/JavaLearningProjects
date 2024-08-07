public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int newSalary){
        salary = newSalary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raiseSalary(int percent){
        salary += salary/100*percent;
        return salary;
    }

    public String toString(){
        return String.format("Eployee: id %s\nEmployee name: %s\nEmployee salary: %d", id, getName(), salary);
    }


}
