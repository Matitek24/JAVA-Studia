import java.util.Scanner;

public class Funkcje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbe do wyswietlenia: ");
        int liczba = input.nextInt();
        show(liczba);

        System.out.println("ZADANIE 7");

        int wrt = 5;
        System.out.println("Przed wywołaniem modifyValue: " + wrt);
        modifyValue(wrt);
        System.out.println("Po wywołaniu modifyValue: " + wrt);

        System.out.println("ZADANIE 8");

        int maxval = findMax(1,3,2);
        System.out.println("najwieksza wartosc z podanych: " + maxval);
    }


    public static void show(int liczba){
        System.out.println("Zwrócenie liczby: " + liczba);
    }


    public static void modifyValue(int i) {
        System.out.println("Pierwotna wartość zmiennej: " + i);
        i = i * 5;
        System.out.println("Zmodyfikowana wartość zmiennej: " + i);
    }

    public static int findMax(int i, int j, int z) {
        int max = i;
        if(z > j && z > i) {
            max = z;
        }
        if(j > i && j > z){
            max = j;
        }
        return max;
    }


}