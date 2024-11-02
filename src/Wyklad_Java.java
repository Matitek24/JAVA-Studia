import java.util.Scanner;


public class Wyklad_Java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj numer zadania do wykonania: ");
        int funkcja = in.nextInt();

        Runnable[] zadania = {
                null,
                Wyklad_Java::ppj_wyklad_1,
                Wyklad_Java::ppj_wyklad_2,
        };
        for (int i = 0; i < zadania.length; i++) {
            if(funkcja == i) {
                zadania[i].run();
                return;
            }
        }
        System.out.println("Podaj inne zadanie");
    }

    public static void ppj_wyklad_1() {
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.print("Fizz ");
            }
            else if(i % 5 == 0){
                System.out.print("Buzz ");
            }
            else if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz ");
            }
            else{
                System.out.print(i + " ");
            }
        }
    }
    public static void ppj_wyklad_2() {
        Scanner sc_liczba = new Scanner(System.in);
        System.out.print("Podaj numer: ");
        int lb = sc_liczba.nextInt();
        int odwr = 0;

        while (lb != 0) {
            int pom = lb % 10; // Pobieramy ostatnią cyfrę

            // Sprawdzamy, czy odwrócona liczba przekroczy limit 32-bitowy
            if (odwr > (Integer.MAX_VALUE - pom) / 10) {
                System.out.println("Liczba przekracza zakres 32 bitów");
                return;
            }

            // Odwracamy liczbę
            odwr = odwr * 10 + pom;
            lb /= 10; // Usuwamy ostatnią cyfrę
        }

        System.out.println("Odwrócona liczba: " + odwr);
    }

}
