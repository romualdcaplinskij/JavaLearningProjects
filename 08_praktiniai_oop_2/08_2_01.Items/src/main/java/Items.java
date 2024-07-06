
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<String> items = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.print("Name: ");
            String input = scanner.nextLine();

            if(input.isEmpty()) break;

            Item name = new Item(input);
            items.add(String.valueOf(name));

        }

        for (String i: items) {
            System.out.println(i);
        }

    }
}
