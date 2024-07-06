
import java.util.HashMap;
import java.util.Objects;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashMap = new HashMap<>();
        hashMap.put("sense", new Book("Some book", 1999, "..."));
        hashMap.put("prejudice", new Book("How to become a Pirate", 1456, "..."));

        printValues(hashMap);
        System.out.println("-----------------");
        printValueIfNameContains(hashMap, "i");
    }

    public static void printValues(HashMap<String, Book> hashmap){
        //which prints all the values in the hashmap given as parameter using toString method of the Book object.
        for (Book k: hashmap.values()) System.out.println(k);
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text){
        //which prints only the books in the given hashmap which name contains the given string.
        for (Book k : hashMap.values()){
            if (k.getName().contains(text)) System.out.println(k);
        }
    }

}
