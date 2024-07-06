import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) break;

            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, pages, year);
            library.add(book);
        }

        System.out.print("What information will be printed (name or everything? ");
        String input = scanner.nextLine();
        for (Book i: library) {
            if (Objects.equals(input, "everything")){
                System.out.println(i);}
            if (Objects.equals(input, "name")){
                System.out.println(i.getTitle());}
        }
    }
}
