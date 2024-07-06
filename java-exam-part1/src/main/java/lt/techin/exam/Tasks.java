package lt.techin.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Tasks {


    /* Paduotus duomenis kilometrais ir metrais konvertuoja į metrus ir rezultatą išveda į ekraną
     * pvz. kilometers = 4, meters = 67 =>
     * Atspausdina:
     * 4067 metrų
     */
    public static void convertToMeters(int kilometers, int meters) {
        int distance = kilometers * 1000 + meters;
        System.out.println(distance + " metrų");
    }


    /*Kasininkė grąžą pirkėjui pabėrė centais ct. Reikia apskaičiuoti kiek tai yra eurų  ir centų .
    * pvz. 234 ct => atspausdina:
    * Gauta: 2 Eur ir 34 ct
    */
    public static void convertCentsToEuros(int cents) {
        int euro = cents / 100;
        int cent = cents % 100;
        System.out.println("Gauta: " + euro + " Eur ir " + cent + " ct");
    }


    /* Raskite skaičių a, b ir c vidurkį
     */
    public static double averageOf(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }


    /* Duoti trys skaičiai. Parašykite metodą, kuris nustatytų, ar bent vienas iš jų yra lyginis.
    Pvz.:
     a = 1, b = 3, c = 5 => false
     a = 1, b = 3, c = 6 => true

    * */
    public static boolean isEven(int a, int b, int c) {
        return a % 2 == 0 || b % 2 == 0 || c % 2 == 0;
    }


    /*
     * Metodas parodo ar iš duotų trijų atkarpų (įvedami jų ilgiai) galima sudaryti trikampį.
     */
    public static boolean isTriangleValid(int a, int b, int c) {
        boolean bool = false;
        if (a > b && a > c) bool = a < (b+c);
        if (c > b && c > a) bool = c <(a+b);
        return bool;
    }


    /* Metodas spausdina  nelyginius skaičius nuo pateikto skaičiaus 'number' iki 1
     * pvz. number = 8 =>
     * 7
     * 5
     * 3
     * 1
     *  */
    public static void printOddNumbers(int number) {
        for (int i= number; i >= 0; i--){
            if (i%2 != 0) System.out.println(i);
        }
    }


    /* Paskaičiuoti kiek masyve yra skaičių didesnių nei skaičius 'number'
     * Pvz. array =  {5, 2, 4, 1} number = 3 => 2
     */
    public static int countLargerThanNumber(int[] array, int number) {
        int counter = 0;
        for (int num: array) if (num > number) counter++;
        return counter;
    }


    /* Surasti mažiausią skaičių ArrayListe
     * Pvz {6.7, 3.5, 8.2, 4.3} => 8.2
     */
    public static double findSmallest(ArrayList<Double> numbers) {
        double smallest = numbers.get(0);
        for (double num: numbers) {
            if(num < smallest) smallest = num;
            return smallest;
        }
        return 0;
    }


    /*
     * Paskaičiuokite kiek simbolių yra String'ų List'e
     */
    public static int countLettersInList(List<String> words) {
        int counter = 0;
        for (String word: words) counter += word.length();
        return counter;
    }


    /* Paskaičiuoti kiek ArrayListe yra stringų, kuriuose yra žodis word
        pvz: {"iphone 12", "IPHONE 12", "samsung s23"} word = "iphone" => 2
     */
    public static int countStringsContainingWord(ArrayList<String> strings, String word) {
        int count = 0;
        for (String item: strings)
            if (item.toLowerCase().contains(word)) count++;
        return count;
    }


    /*
     * Paskaičiuokite kiek liste elementų, kur savybė displayed yra true
     */
    public static int countDisplayedElements(List<Element> elements) {
       int count = 0;
        for (Element element: elements)
            if (element.isDisplayed()) count++;
       return count;
    }

    /*
     * Grąžinkite listą elementų kurių tekstas nėra tuščias arba sudarytas tik iš tarpų
     */
    public static List<Element> findElementsWithNonEmptyTexts(List<Element> elements) {
        ArrayList<Element> newList = new ArrayList<>();
        for (Element element: elements) {
            if(!element.getText().isBlank()) newList.add(element);
        }
        return newList;
    }


    /*
     * Elementų tekste užrašytos prekių kainos, pvz. "$10.52"
     * Raskite d̶i̶d̶ži̶a̶u̶s̶i̶ą k̶a̶i̶n̶ą Sumą
     */
    public static double findSumOfPrices(List<Element> elements) {
        double sum = 0.0;
        double itemPrice;
        for (Element price: elements) {
           itemPrice = Double.parseDouble(price.getText().replace("$", "").trim());
           sum += itemPrice;
        }
        return sum;
    }


}
