import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;
    private ArrayList<String> setOfWords = new ArrayList<>();

    public void add(String word, String translation){
        //adds the translation for the word and preserves old translations
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put(word, translation);
    }

    public ArrayList<String> translate(String word){
        //returns a list ot the translations added for the word. If the word has no translations, the method
        //should return an empty list.
        if (!setOfWords.isEmpty())
            for(String k: dictionary.keySet()){
                dictionary.get(word);
            }
        return null;
    }

    public void remove(String word){
        //removes the word and all its translations from the dictionary.
    }
}
