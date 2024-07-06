
public class Main {

    public static void main(String[] args) {
        // Test your program here!
        Abbreviations abbreviation = new Abbreviations();
        abbreviation.addAbbreviation("e.g.", "For example");
        abbreviation.addAbbreviation("etc.", "And so on");
        abbreviation.addAbbreviation("lol", "Laughing out loud");

        System.out.println(abbreviation);

        String text = "e.g. etc. lol";

        for (String part: text.split(" ")){
            if(abbreviation.hasAbbreviation(part)){
                part = abbreviation.findExplanationFor(part);
            }

            System.out.println(part);
            System.out.println();
        }


    }
}
