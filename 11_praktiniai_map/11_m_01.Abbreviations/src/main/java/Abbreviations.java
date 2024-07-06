import java.util.HashMap;
import java.util.Objects;

public class Abbreviations {

    private HashMap<String, String> newAbbreviation = new HashMap<>();
    public Abbreviations() {
    }

    public void addAbbreviation(String abbreviation, String explanation){
        //ads new abbreviation and explanation
        newAbbreviation.put(abbreviation, explanation);

    }

    public boolean hasAbbreviation(String abbreviation){
        return newAbbreviation.containsKey(abbreviation);
    }

    public String findExplanationFor(String part){
        //finds the explanation for abbreviation. Returns null if abbreviation has not added yet.
        if (newAbbreviation.containsKey(part)) return  newAbbreviation.get(part);
        return null;
    }

    @Override
    public String toString() {
        return "" + newAbbreviation + "";
    }
}
