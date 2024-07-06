
import java.util.Objects;
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "Caput Draconis";
        System.out.println("Password?");
        String gotPass = scan.nextLine();
        if (Objects.equals(gotPass, password)){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
