import java.util.Scanner;

public class Tablice_2d {
    public static void main(String[] args) {

        System.out.println("Podaj numer zadania z tablid 2d: ");
        Scanner input = new Scanner(System.in);
        int wybor = input.nextInt();
        switch (wybor) {
            case 1:
                Tablice_2d.zad1();
                break;
            case 2:
                Tablice_2d.zad2();
                break;
            case 3:
                Tablice_2d.zad3();
                break;
            case 4:
                Tablice_2d.zad4();
                break;
            case 5:
                Tablice_2d.zad1_2();
                break;
            case 6:
                Tablice_2d.zad2_2();
                break;
            case 7:
                Tablice_2d.zad3_2();
                break;
            case 8:
                Tablice_2d.zad4_2();
                break;
        }


    }
        public static void zad1(){
            int[][] arr = {
                    {1, 2},
                    {4, 5},
                    {6, 7},
                    {10, 13},
                    {2, 5},
            };

            int minx = arr[0][0];
            int miny = arr[0][1];
            int maxx = arr[0][0];
            int maxy = arr[0][1];

            for(int i = 0 ; i < arr.length ; i++) {
                if(arr[i][0] < minx) minx = arr[i][0];
                if(arr[i][0] > maxx) maxx = arr[i][0];
                if(arr[i][1] < miny) miny = arr[i][1];
                if(arr[i][1] > maxy) maxy = arr[i][1];
            }

            double srx = (minx + maxx) / 2.0;
            double sry = (miny + maxy) / 2.0;

            double wys = maxx - minx;
            double szer = maxy - miny;

            System.out.println("srodek prostokąta: " + srx + " " + sry);
            System.out.println("Wysokosc:" + wys);
            System.out.println("Szerokosc:" + szer);


        }
        public static void zad2(){
            int[][] tab = {
                    {1 , 0 , 0 , 0 , 0} ,
                    {0 , 1 , 0 , 0} ,
                    {0 , 0 , 1}
            } ;

            int[] tabpom = new int[tab[0].length + tab[1].length + tab[2].length];

            int index = 0;
            for(int i = 0 ; i < tab.length ; i++) {
                for (int j = 0 ; j < tab[i].length ; j++) {
                    tabpom[index] = tab[i][j];
                    index++;
                }
            }

            for(int i = 0 ; i < tabpom.length ; i++) {
                System.out.print(tabpom[i] + " ");
            }

        }
       public static void zad3(){
           int[] tab1 = new int[(int) (Math.random() * 15 + 1)];
           int[] tab2 = new int[(int) (Math.random() * 15 + 1)];
           int[] tab3 = new int[(int) (Math.random() * 15 + 1)];

           for(int i = 0 ; i < tab1.length ; i++) {
               tab1[i] = (int) (Math.random() * 15 + 1);
               System.out.print(tab1[i] + " ");
           }
           System.out.println();
           for(int i = 0 ; i < tab2.length ; i++) {
               tab2[i] = (int) (Math.random() * 15 + 1);
               System.out.print(tab2[i] + " ");
           }
           System.out.println();
           for(int i = 0 ; i < tab3.length ; i++) {
               tab3[i] = (int) (Math.random() * 15 + 1);
               System.out.print(tab3[i] + " ");
           }

           System.out.println("\n _______________________");

           int[][] tab2d = new int[3][];

           tab2d[0] = new int[tab1.length];
           tab2d[1] = new int[tab2.length];
           tab2d[2] = new int[tab3.length];


           for (int i = 0; i < tab1.length; i++) {
               tab2d[0][i] = tab1[i];
           }
           for (int i = 0; i < tab2.length; i++) {
               tab2d[1][i] = tab2[i];
           }
           for (int i = 0; i < tab3.length; i++) {
               tab2d[2][i] = tab3[i];
           }



           System.out.println("Tablica 2D");
           for (int i = 0; i < tab2d.length; i++) {
               for (int j = 0; j < tab2d[i].length; j++) {
                   System.out.print(tab2d[i][j] + " ");
               }
               System.out.println();
           }
       }
       public static void zad4() {
           float[][] tab = new float[7][7];

           for(int i = 0 ; i < tab.length ; i++) {
               for(int j = 0 ; j < tab[i].length ; j++) {
                   tab[i][j] = (float) (Math.random() * 10);
               }
           }

           for(int i = 0 ; i < tab.length ; i++) {
               for (int j = 0; j < tab[i].length; j++) {
                   System.out.print(tab[i][j] + "\t ");
               }
               System.out.println();
           }
           float wynik = 0;
           for(int i = 0 ; i < tab.length ; i++) {
              wynik += tab[i][i];
           }
           System.out.println("lewa przekatna suma wartosci: " + wynik);
            float wynik2 = 0;
           for(int i = 0  ; i < tab.length ; i++) {
              wynik2 += tab[i][tab.length-i-1];
           }
           System.out.println("prawa przekatna suma wartosci: " + wynik2);

       }
       public static void zad1_2(){
        int[][] tab = {
                {1 , 4, 10, 9, 4} ,
                {3 , 2, 13, 1, 4} ,
                {21 , 1, 3, 2, 4} ,
                {23 , 2, 5, 9, 5} ,
                {3 , 45, 3, 0, 5} ,
        };
        int suma = 0;
        for(int i = 0 ; i < tab.length ; i++) {
                suma += tab[i][tab[i].length-1];
        }
           System.out.println("suma: " + suma);
       }
       public static void zad2_2(){
           int[][] arr = {  {1, 3, 2},
                   {3, 4, 8},
                   {2, 6, 8},
                   {1, 8, 5} };

           int index = 0, pom = 0;
           int sumwiersz = 0, sumkolumn = 0;

           for(int i = 0 ; i < arr.length ; i++) {
               for(int j = 0 ; j < arr[i].length ; j++) {
                   sumwiersz += arr[i][j];
                   if (sumwiersz > pom) {
                       index = i;
                       pom = sumwiersz;
                   }
               }
               sumwiersz = 0;
           }
           System.out.println("index najwiekszego wiersza: " + index);

           int index2 = 0;
           int liczbakolumn = arr[0].length;
           for(int j = 0 ; j < liczbakolumn ; j++) {
               for(int i = 0 ; i < arr.length ; i++) {
                   sumkolumn += arr[i][j];
                   if(sumkolumn > pom){
                       index2 = j;
                       pom = sumkolumn;
                   }
               }
               sumkolumn = 0;
           }

           System.out.println("index najwiekszej kolumny: " + index2);
       }
       public static void zad3_2(){
           // Tablica dwuwymiarowa (nieregularna)
           int[][] arr = {
                   {1, 3, 2, 5},
                   {3, 4, 8, 3},
                   {2, 6, 8},
                   {1, 8, 5, 6, 2},
                   {2, 2}
           };

           System.out.println("Tablica przed zamianą:");
           for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                   System.out.print(arr[i][j] + " ");
               }
               System.out.println();
           }
           System.out.println("===============");

           int index1 = 2, index2 = 3;

           int[] tabpom = arr[index1];
           arr[index1] = arr[index2];
           arr[index2] = tabpom;


           System.out.println("\n==============");
           System.out.println("Tablica po zamianie:");
           for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                   System.out.print(arr[i][j] + " ");
               }
               System.out.println();
           }
       }
       public static void zad4_2(){
           String[][] arr =
                   {
                           {"Kenya",  "Nairobi"},
                           {"Rwanda", "Kigali"},
                           {"Gambia", "Banjul"},
                           {"Ghana",  "Accra"},
                           {"Niger",  "Niamey"},
                           {"Zambia", "Lusaka"}
                   };
           Scanner sc = new Scanner(System.in);
           System.out.println("Podaj kraj: ");
           String kraj = sc.nextLine();

           for(int i = 0 ; i < arr.length ; i++) {
               if(arr[i][0].equals(kraj)) {
                   System.out.println("Stolica " + arr[i][0] + " jest: " + arr[i][1]);
               }
               else {
                   System.out.println("Nie ma takiego panstwa w naszej bazie");
               }
           }

       }

    }
