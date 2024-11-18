import java.util.Scanner;

public class Algorytmy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "1. Check if number is a Prime number\n" +
                "2. Check if number is a narcissistic number\n" +
                "3. Provide Xs number of fibonacci sequence.\n " +
                        " Choose algoritm: " );
        int num = input.nextInt();
        switch (num) {
            case 1:
                Algorytmy.Prime();
                break;
            case 2:
                Algorytmy.narcissistic();
                break;
            case 3:
                Algorytmy.fibonnaci();
                break;

            default:
                System.out.println("Podaj inne zadanie");
        }
    }
    public static void Prime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Give Number: ");
        int x = input.nextInt();
        if(x<2){
            System.out.println("Is not Prime Number");
        }
        else if(x==2){
            System.out.println("Prime Number");
        } else if (x % 2 == 0) {
            System.out.println("Is not Prime Number");
        } else {
            for(int i =3; i <= Math.sqrt(x); i+= 2){
                if(x % i == 0){
                    System.out.println("Is not Prime Number");
                    return;
                }
            }
            System.out.println("Prime Number");
        }
    }
    public static void narcissistic(){
        Scanner input = new Scanner(System.in);
        System.out.println("Give Number: ");
        int x = input.nextInt();
        int temp = x;
        int l = 0;
        int wynik = 0;
        while(temp > 0){
            temp /= 10;
            l++;
        }
        temp = x;
        for(int i = 0; i < l; i++){
            int pom = temp % 10;
            wynik += Math.pow(pom, l);
            temp /= 10;
        }
        if(wynik == x){
            System.out.println("Is Narcissistic Number");
        }
        else{
            System.out.println("Is Not Narcissistic Number");
        }
    }
    public static void fibonnaci(){
        Scanner input = new Scanner(System.in);
        System.out.println("Give Index of Fibonacci sequence: ");
        int index = input.nextInt();
        if(index<2){
            System.out.println("Is not Fibonacci");
        }
        else {
            int a = 0;
            int b = 1;
            int c = 0;

            for (int i = 2; i <= index; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Is Fibonacci: " + c);
        }
    }
}
