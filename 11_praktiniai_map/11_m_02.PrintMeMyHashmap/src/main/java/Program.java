
import java.util.HashMap;
import java.util.Iterator;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("e.g.", "For example");
        hashMap.put("etc.", "And so on");
        hashMap.put("lol", "Laughing out loud");
        hashMap.put("i.e.", "more precisely");

        printKeys(hashMap);
        System.out.println("--------------");
        printKeysWhere(hashMap, "l");
        System.out.println("--------------");
        printValuesOfKeysWhere(hashMap, ".g");

    }
    public static void printKeys(HashMap<String, String> hashMap){
        //prints all keys in the hashMap given as parameter
        for (String k: hashMap.keySet()) {
            System.out.println(k);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashMap, String text){
        //prints the keys in the hashMap given as parameter, witch contain the string given as parameter
        for (String k: hashMap.keySet()){
            if (k.contains(text)) System.out.println(k);
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text){
        //Prints the values in the hashMap given as parameter, witch key contains given string as parameter
        for (String k: hashMap.keySet()) {
            if(k.contains(text)) System.out.println(hashMap.get(k));
        }
    }

}
