public class Main {
    public static void main(String[] args) {
        String[] words = {"submarine", "computer", "exception", "starship", "continent", "turbocharger", "geometry", "certificate", "whiteboard", "cowboy"};
        System.out.println(randomWord(words));
    }

    public static String randomWord(String[] words) {
        int randomNum = (int) (Math.random() * 10);
        return words[randomNum];
    }

    public static void stars(String[] args) {
        for (int j = 0; j < args.length; j++) {
            System.out.print("*");
        }
    }

}