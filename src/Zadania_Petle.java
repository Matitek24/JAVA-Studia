import java.util.Scanner;

public class Zadania_Petle {

    enum DzieńTygodnia {
        PONIEDZIAŁEK,
        WTOREK,
        ŚRODA,
        CZWARTEK,
        PIĄTEK,
        SOBOTA,
        NIEDZIELA
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj zadanie ktore chcesz: ");
        int funkcja = in.nextInt();

        switch (funkcja) {
            case 1:
                Zadania_Petle.ppj_1();
                break;
            case 2:
                Zadania_Petle.ppj_2();
                break;
            case 3:
                Zadania_Petle.ppj_3();
                break;
            case 4:
                Zadania_Petle.ppj_4();
                break;
            case 5:
                Zadania_Petle.ppj_5();
                break;
            case 6:
                Zadania_Petle.ppj_6();
                break;
            case 7:
                Zadania_Petle.ppj_7();
                break;
            case 8:
                Zadania_Petle.ppj_8();
                break;
            case 9:
                Zadania_Petle.ppj_9();
                break;
            case 10:
                Zadania_Petle.nauka();
                break;
            default:
                System.out.println("Podaj inne zadanie");
        }
    }

    // Zadania Ćwiczenia PPJ

    public static void ppj_1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj s studenta: " );
        String s = in.nextLine();
        System.out.print("Hej " + s);
        System.out.println();
    }
    public static void ppj_2(){
        double a = -3.444;
        double x = 0;
        if (a >= 0) {
            x = 1.701;
        };
        if (a < 0){
            x = 2D*3.14f;
        };
        System.out.println(x);
    }
    public static void ppj_3() {
        int zmInt = 4;
        double zmDouble = -1.0;
        if (zmInt > 0) {
            if (zmDouble > 0) {
                System.out.println("Here i am");
            }
            else{
                System.out.println("Here i don't am");
            }
        }
        else{
            System.out.println("No Actually i am here");
        }
    }
    public static void ppj_4() {
        boolean doesSignificantWork = true;
        boolean makesBreakthrough = false;
        boolean nobelPrizedCandidate = doesSignificantWork && makesBreakthrough;
        System.out.println(doesSignificantWork);
        System.out.println(makesBreakthrough);
        System.out.println(nobelPrizedCandidate);
    }
    public static void ppj_5() {
        int a = 3;
        int b = 2;
        int c = 1;
        System.out.println((a==b && b==c ? "a i b i c Takie same" :
                        (a==c ? "a i c takie same":
                        (b==c ? " b i c takie same ":
                                (a==b ? "a i b  takie same ": "wszystkie rozne")))));
    }
    public static void ppj_6() {
    int a = 2;
    int b = 4;
        System.out.println(((!(a < b) && !(a > b) ? "tak ": "nie")));
    }
    public static void ppj_7() {
        double a = 0.34d;
        double nieskonczonosc_prawa = Double.POSITIVE_INFINITY;
        double nieskonczonosc_lewa = Double.NEGATIVE_INFINITY;
        System.out.println(
                (a >= 0 && a <= 1 ? "Nalezy do C":
                        (a >= nieskonczonosc_lewa && a < 1 ? "Nalezy do B" :
                                (a < nieskonczonosc_prawa && a >= 0   ? "Nalezy do A" : " Nie nalezy do zadnego przedzialu")))
        );
    }
    public static void ppj_8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = sc.nextInt();
        boolean n_a = (liczba >-15 && liczba <= -10) || (liczba > -5 && liczba < 0) || (liczba > 5 && liczba < 10);
        boolean n_b = (liczba <= -13) || (liczba > -8 && liczba < -3 );
        boolean n_c = liczba >= -4;

        System.out.println((n_a && n_b && n_c ? "Nalezy do czesci wspolnej" : "Nie nalezy"));
    }
    public static void ppj_9() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
       int rok = sc.nextInt();
       boolean first = rok % 4 == 0 && rok % 100 != 0;
       boolean second = rok % 400 == 0;
        System.out.println((first || second ? "Przestepny ": "Normalny "));
    }
    public static void nauka(){
        DzieńTygodnia dzisiaj = DzieńTygodnia.WTOREK;

        // Użycie enum w instrukcji switch
        switch (dzisiaj) {
            case PONIEDZIAŁEK:
                System.out.println("Dziś jest poniedziałek.");
                break;
            case WTOREK:
                System.out.println("Dziś jest wtorek.");
                break;
            case ŚRODA:
                System.out.println("Dziś jest środa.");
                break;
            case CZWARTEK:
                System.out.println("Dziś jest czwartek.");
                break;
            case PIĄTEK:
                System.out.println("Dziś jest piątek.");
                break;
            case SOBOTA:
                System.out.println("Dziś jest sobota.");
                break;
            case NIEDZIELA:
                System.out.println("Dziś jest niedziela.");
                break;
            default:
                System.out.println("Nieprawidłowy dzień.");
        }
    }
}
