import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Irasykite teksta: ");
        String name = input.nextLine();
        System.out.println("Vardas: " + name);
    }
}
