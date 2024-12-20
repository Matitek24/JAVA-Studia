import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        System.out.println("Podaj numer obrazka: ");
        Scanner input = new Scanner(System.in);
        int wybor = input.nextInt();
        switch (wybor) {
            case 1:
                Shape.draw();
                break;
            case 2:
                Shape.draw2();
                break;
            case 3:
                Shape.draw3();
                break;
            case 4:
                Shape.draw4();
                break;
            case 5:
                Shape.draw5();
                break;
            case 6:
                Shape.draw6();
                break;
            default:
                System.out.println("Podaj inne zadanie");
        }
    }
    public static void draw() {
        int height = 4;
        for (int i = 0; i < height; i++) {
            for (int z = 0; z < height - i; z++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void draw2() {
        int height = 4;
        for (int i = 0; i < height; i++) {
            for (int z = 0; z < height - i; z++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = height - 2; i >= 0; i--) {
            for (int z = 0; z < height - i; z++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void draw3() {
        int height = 4;
        for (int i = height - 1; i >= 1; i--) {
            for (int z = 0; z < height - i; z++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < height; i++) {
            for (int z = 0; z < height - i; z++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void draw4() {
        int height = 5;
        int width = 6;

        for (int i = 0; i < height; i++) {
            if(i == 0 || i == height -1 ) {
                for (int z = 0; z < width ; z++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            else{
                System.out.print("#");
            for (int z = 0; z < width - 2 ; z++) {
                System.out.print(" ");
            }
                System.out.println("#");
            }
        }
    }
    public static void draw5() {
        int height = 6;
        int width = 6;

        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) { // Pierwszy i ostatni wiersz
                for (int z = 0; z < width; z++) {
                    System.out.print("#");
                }
                System.out.println();
            } else { // Środkowe wiersze z przekątną
                System.out.print("#"); // Lewa krawędź prostokąta
                for (int z = 0; z < width - 2; z++) {
                    if (z == i - 1) {  // Warunek dla przekątnej
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("#"); // Prawa krawędź prostokąta
            }
        }
    }
    public static void draw6() {
        int height = 6;
        int width = 6;

        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) { // Pierwszy i ostatni wiersz
                for (int z = 0; z < width; z++) {
                    System.out.print("#");
                }
                System.out.println();
            } else { // Środkowe wiersze z przekątnymi
                System.out.print("#"); // Lewa krawędź prostokąta
                for (int z = 0; z < width - 2; z++) {
                    if (z == i - 1 || z == (width - 2 - i)) { // Warunki dla obu przekątnych
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("#"); // Prawa krawędź prostokąta
            }
        }
    }
}
