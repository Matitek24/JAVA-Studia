import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Tablica {
    public static void main(String[] args) {
        System.out.println("Podaj numer zadania z tablic od 1-5: ");
        Scanner input = new Scanner(System.in);
        int wybor = input.nextInt(); // Odczytanie wyboru użytkownika
        switch (wybor) {
            case 1:
                Tablica.zad1(); // Wywołanie zadania 1
                break;
            case 2:
                Tablica.zad2(); // Wywołanie zadania 2
                break;
            case 3:
                Tablica.zad3(); // Wywołanie zadania 3
                break;
            case 4:
                Tablica.zad4(); // Wywołanie zadania 4
                break;
            case 5:
                Tablica.zad5(); // Wywołanie zadania 5
                break;
            default:
                System.out.println("Podaj inne zadanie"); // Obsługa niepoprawnego wyboru
        }
    }

    // Zadanie 1 - Zliczanie parzystych elementów i ich wyświetlanie w odwrotnej kolejności
    public static void zad1(){
        int[] arr = {1, 3, 6, 8, 11, 4};

        // Zliczanie liczby parzystych elementów w arr
        int brrlen = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) { // Sprawdzenie, czy liczba jest parzysta
                brrlen++;
            }
        }
        int[] brr = new int[brrlen]; // Tworzenie tablicy o odpowiedniej długości brrlen tyle ile liczb jest parzystych

        int index = 0;
        System.out.println("\nParzyste w odwrotnej kolejności:");
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] % 2 == 0) { // Sprawdzanie, czy liczba jest parzysta
                brr[index++] = arr[j]; // Dodanie parzystej liczby do nowej tablicy
            }
        }
        // Wyświetlenie parzystych liczb w odwrotnej kolejności
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    // Zadanie 2 - Wyszukiwanie ciągów liczb rosnących lub malejących
    public static void zad2(){
        int count = 0;
        int[] arr = {1, 4, 5, 3, 2, 0, 0, 1, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Wyświetlenie elementów tablicy
        }
        // Sprawdzanie sekwencji 3 liczb rosnących lub malejących
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] <= arr[i+1]) && (arr[i+1] <= arr[i+2]) || (arr[i] >= arr[i+1]) && (arr[i+1] >= arr[i+2])) {
                count++; // Zliczanie wystąpień takiej sekwencji
                System.out.print("\n " + arr[i] + arr[i+1] + arr[i+2]); // Wyświetlanie znalezionych sekwencji
            }
        }
        System.out.println("\n Tyle razy wystąpiła taka sekwencja: " + count); // Wyświetlenie liczby znalezionych sekwencji
    }

    // Zadanie 3 - Usuwanie powtórzeń z tablicy
    public static void zad3(){
        int[] arr = {3, 4, 4, 6, 5, 1, 5, 9};
        boolean jest;
        for (int i = 0; i < arr.length; i++) {
            jest = false;
            // Sprawdzenie, czy dany element już wystąpił w tablicy
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    jest = true; // Ustawienie flagi na true, jeśli element jest powtórzony
                    break;
                }
            }
            if (!jest) { // Jeśli nie znaleziono duplikatu, wyświetlamy liczbę
                System.out.print(arr[i] + " ");
            }
        }
    }

    // Zadanie 4 - Zamiana miejscami najmniejszego i największego elementu w tablicy
    public static void zad4(){

        int[] arr = {4, 3, 1, -2, 4, -2, 2, 4, 3};
        for (int i = 0; i < arr.length; i++) {
            // Wyświetlanie elementów tablicy oddzielonych przecinkami z brakiem przecinka na koncu
            if(i < arr.length - 1){
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // Znajdowanie najmniejszego elementu i jego indeksu
        int min = arr[0], index_min = 0;
        int max = arr[0], index_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i]; // Przypisanie nowego minimum
                index_min = i; // Zapamiętanie indeksu najmniejszego elementu
            }
            if(arr[i] >= max){
                max = arr[i]; // Przypisanie nowego maksimum
                index_max = i; // Zapamiętanie indeksu największego elementu
            }
        }

        // Zamiana miejscami najmniejszego i największego elementu
        arr[index_min] = max;
        arr[index_max] = min;

        // Wyświetlanie tablicy po zamianie
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1){
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // Wyświetlanie tablicy w odwrotnej kolejności
        for (int i = arr.length - 1; i >= 0; i--) {
            if(i > 0){
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    // Zadanie 5 - Losowanie unikalnych liczb do tablicy
    public static void zad5(){
        final int SIZE = 10; // Rozmiar tablicy
        final int NUMS = 13; // Zakres losowanych liczb (od 1 do 13)
        int[] arr = new int[SIZE];
        int counter = 0; // Licznik prób
        Random rand = new Random();
        int dl = arr.length;
        for(int i = 0; i < dl; i++){
            int randomnum = rand.nextInt(NUMS) + 1; // Losowanie liczby z zakresu 1-13
            boolean uniqe = true;

            // Sprawdzanie, czy liczba już wystąpiła w tablicy
            for(int j = 0; j < i; j++){
                if(randomnum == arr[j]){
                    uniqe = false; // Jeśli liczba wystąpiła wcześniej, oznaczamy ją jako powtórzoną
                    break;
                }
            }
            if(uniqe){
                arr[i] = randomnum; // Jeśli liczba unikalna, dodajemy ją do tablicy
            } else {
                i--; // Jeśli liczba powtórzona, ponawiamy próbę
            }
            counter++; // Zwiększanie liczby prób
        }

        // Wyświetlanie informacji o wypełnianiu tablicy
        System.out.println("With SIZE=" + SIZE + " and " +
                "NUMS=" + NUMS + " the array\n has been " +
                "filled after " + counter + " trials");
        System.out.println("Array: " + Arrays.toString(arr)); // Wyświetlanie zawartości tablicy
    }

}
