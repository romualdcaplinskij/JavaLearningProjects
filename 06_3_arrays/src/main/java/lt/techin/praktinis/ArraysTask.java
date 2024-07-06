package lt.techin.praktinis;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        System.out.println("Generate random array in given size: " + Arrays.toString(generateRandomArray(10, 5, 15)));

        System.out.println("Remove array element with index n:" + Arrays.toString(removeElementAndReturnNewArray(arr, 3)));

//        int[] arrWithRemovedElement = removeElementAndReturnNewArray(arr, 1);
//        System.out.println(Arrays.toString(arr));

        System.out.println("Add number X before array index k: " + Arrays.toString(insertElementAndReturnNewArray(arr, 2, 99)));

        System.out.println(Arrays.toString(arr) + " to reversed array copy " + Arrays.toString(reverseArray(arr)));

        System.out.print(Arrays.toString(arr) + " to reversed array without copy: ");
        reverseInPlace(arr);


    }

    // Parašykite metodą, kuris sukuria nustatyto dydžio sveikųjų skaičių masyvą
    // ir užpildo jį atsitiktinai sugeneruotais skaičiais iš nurodyto intervalo.
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }
        return array;
    }


    //Parašykite metodą, kuris pašalintų masyvo arr[n] k-tąjį elementą (su indeksu k),
    //surašant reikiamus elementus į naują masyvą b[n-1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] removeElementAndReturnNewArray(int[] arr, int k) {

        if (k < 0 || k >= arr.length) return null;
        int[] arr_new = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != k) {
                arr_new[j] = arr[i];
                j++;
            }
        }
        return arr_new;

//        int[] arr_new = null;
//        try {
//            arr_new = new int[arr.length - 1];
//            int j = 0;
//            for (int i = 0; i < arr.length; i++) {
//                if (i != k) {
//                    arr_new[j] = arr[i];
//                    j++;
//                }
//            }
//        } catch (NegativeArraySizeException e) {
//            System.out.println("Array is less than 0 size");
//            return null;
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Array is out of bounds!");
//            return null;
//        }
//        return arr_new;
    }

    //Parašykite metodą, kuris įterptų į masyvą arr[n] prieš k-tąjį elementą reikšmę x,
    //surašant reikiamus elementus į naują masyvą b[n+1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] insertElementAndReturnNewArray(int[] arr, int k, int x) {
        if (k < 0 || k >= arr.length) return null;
        int[] arr_new = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                arr_new[i] = arr[i];
            } else if (i == k ){
                arr_new[i] = x;
                arr_new[i+1] = arr[i];
            } else {
                arr_new[i+1] = arr[i];
            }
        }
        return arr_new;
    }

    //Parašykite metodą, kuris grąžintų duoto masyvo apverstą kopija.
    public static int[] reverseArray(int[] arr) {
        int[] new_arr = new int[arr.length];
        int j = arr.length;
        for (int k : arr) {
            new_arr[j - 1] = k;
            j--;
        }
        return new_arr;
    }

    //Parašykite metodą, kuris apverstu duotą masyvą (nekuriant naujo masyvo)
    public static void reverseInPlace(int[] arr) {

        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i -1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }


}
