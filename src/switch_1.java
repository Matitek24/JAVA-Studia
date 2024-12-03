import java.util.Scanner;

public class switch_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer zadania");
        int zad = sc.nextInt();
        Runnable[] zadania = {
                null,
                switch_1::zad1,
                switch_1::zad2,
                switch_1::zad3,
                switch_1::zad4,
                switch_1::zad5,
                switch_1::zad6,
                null,
                switch_1::zad8,
                switch_1::zad9,
        };
        for (int i = 0; i < zadania.length; i++) {
            if (zad == i) {
                zadania[i].run();
                return;
            }
        }
    }

    public static void zad1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = sc.nextInt();
        boolean n_a = (liczba > -15 && liczba <= -10) || (liczba > -5 && liczba < 0) || (liczba > 5 && liczba < 10);
        boolean n_b = (liczba <= -13) || (liczba > -8 && liczba < -3);
        boolean n_c = liczba >= -4;

        System.out.println((n_a && n_b && n_c ? "Nalezy do czesci wspolnej" : "Nie nalezy"));
    }

    public static void zad2() {
        int a = 2;
        int b = 4;
        System.out.println((a==b ? "tak " : "nie"));
    }


    public static void zad3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj miesiąc: ");
        int msc = sc.nextInt();
        System.out.print("Podaj rok: ");
        int rok = sc.nextInt();
        if (msc > 1 || msc < 12) {
            int[] dniWMiesiacach = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
                dniWMiesiacach[1] = 29;
            }
            System.out.println("Miesiąc " + msc + " w roku " + rok + " ma " + dniWMiesiacach[msc - 1] + " dni.");
        }
    }

    public static void zad4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj literke: ");
        char literka = sc.next().charAt(0);
        boolean jestsam = false;
        char[] sam = {
                'a', 'ą', 'e', 'ę', 'i', 'o', 'ó', 'u', 'y'
        };
        for (int i = 0; i < sam.length; i++) {
            if(sam[i] == literka){
                jestsam = true;
                break;
            }
            else{
                jestsam = false;
            }
        }
        if(jestsam){
            System.out.println("Jest samogloska");
        }
        else{
            System.out.println("Nie jest samogloska");
        }
    }
    public static void zad5() {
        Scanner sc = new Scanner(System.in);
        double liczba = sc.nextDouble();
        double liczba2 = sc.nextDouble();
        double liczbazaok = Math.round(liczba * 100.0) / 100.0;
        double liczbazaok2 = Math.round(liczba2 * 100.0) / 100.0;
        if(liczbazaok == liczbazaok2){
            System.out.println("Liczba jest taka sama");
        }
        else{
            System.out.println("Liczba nie jest taka sama");
        }
    }
    public static void zad6() {
        Scanner sc = new Scanner(System.in);
        int kat1 = sc.nextInt();
        int kat2 = sc.nextInt();
        int kat3 = sc.nextInt();
        if(kat1 + kat2 + kat3 == 180){
            System.out.println("Moze byc trójkątem");
            if(kat1 < 90 && kat2 < 90 && kat3 < 90){
                System.out.println("Trojkat jest ostrokątny");
            }
            else {
                System.out.println("Trojkat nie jest ostrokątny");
            }
        }
        else{
            System.out.println("Nie moze byc trojkatem");
        }
    }
    public static void zad8() {
        Scanner sc = new Scanner(System.in);

    }
    public static void zad9() {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " jest parzyste");
            }
        }


    }

}