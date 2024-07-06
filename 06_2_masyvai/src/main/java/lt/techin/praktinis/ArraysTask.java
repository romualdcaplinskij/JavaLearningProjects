package lt.techin.praktinis;

import java.util.Arrays;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        System.out.println(getFirstElement(arr));

        System.out.println(getLastElement(arr));

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);

        int maxMark = getMax(arr);
        System.out.printf("Max mark: %d\n", maxMark);

        System.out.println(getSum(arr));

        System.out.println(getAverage(arr));

        System.out.println(countElements(arr, 2));

        System.out.println(contains(arr, 0));

        System.out.println(lastIndexOf(arr, 6));
    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        return Arrays.stream(arr).findFirst().orElseThrow();
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        return arr[arr.length - 1];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        /*
        Veikimas:
        Kviečiame klasę Arrays, jos metodą stream() ir paduodam mūsų masyvą. Metodas min() suranda mažiausią masyvo skaičių.
        Galima naudoti castAsInt() metodą, bet jei ne ras skaičiaus mes exception error, todėl rekomenduojama naudoti
        metodą orElseThrow().
         */
        return Arrays.stream(arr).min().orElseThrow();
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        //galima naudoti getAsInt() metoda, jeigu neras reiksmes mes exception error,
        //rekomenduojama siuo atveju naudoti orElseThrow() metoda.
        return Arrays.stream(arr).max().orElseThrow();
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        /*
        Veikimas:
        Tam kad gauti virdurkį reikia grąžinti atsakymą kaip double. Pirmiausia sukuriamas naujas masyvas į kuri kopijuojamas kaip double
        arr masyvas naudojant asDoubleStream(). Rezultatui grąžinti naudojamas metodas average().
         */
        double[] castToDoubleArray = Arrays.stream(arr).asDoubleStream().toArray();
        return Arrays.stream(castToDoubleArray).average().orElseThrow();
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        int sum = 0;
        for (int i: arr) {
            if (i > n){
                sum += 1;
            }
        }
        return sum;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        boolean var = false;
        for (int i: arr) {
            if (i == n) {
                var = true;
                break;
            }
        }
        return var;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        int indexNumber = -1;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == n){
                indexNumber = i;
            }
        }
        return indexNumber;
    }

    
}
