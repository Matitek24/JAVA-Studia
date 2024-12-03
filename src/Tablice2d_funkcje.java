public class Tablice2d_funkcje {
    public static void main(String[] args) {

//
//        System.out.println(" ======== 1 ZADANIE =========");
//        int[][] tab={
//                {1, 0, 0, 0, 0},
//                {0, 1, 0, 0},
//                {0, 0, 1}
//                };
//        int[] tab2 = new int[tab[0].length + tab[1].length + tab[2].length];
//
//        for (int i = 0; i < tab.length; i++) {
//            for (int j = 0; j < tab[i].length; j++) {
//                System.out.print(tab[i][j] + " ");
//            }
//        }
//        int index = 0;
//        for (int i = 0; i < tab.length; i++) {
//            for (int j = 0; j < tab[i].length; j++) {
//                tab2[index] = tab[i][j];
//                index++;
//            }
//        }
//        System.out.println();
//
//        for (int i = 0; i < tab2.length; i++) {
//            System.out.print(tab2[i] + " ");
//        }
//        System.out.println();
//        System.out.println(" ======== 2 ZADANIE =========");
//        int los = (int) (Math.random() * 11);
//        int los2 = (int) (Math.random() * 11);
//        int[][] arr = new int[los][los2];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (int) (Math.random() * 11);
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("-------");
//        for (int i = 0; i < arr.length; i++) {
//            int[] ref = new int[arr[i].length];
//            int count = 0;
//
//            for (int j = 0; j < arr[i].length; j++) {
//                boolean found = false;
//                for (int k = 0; k < count; k++) {
//                    if(ref[k] == arr[i][j]) {
//                        found = true;
//                        break;
//                    }
//                }
//                if(!found) {
//                    ref[count++] = arr[i][j];
//                }
//            }
//
//            for (int j = 0; j < count; j++) {
//                System.out.print(ref[j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println(" ======== 3 ZADANIE =========");
//        show(5);
//        System.out.println(" ======== 4 ZADANIE =========");
//        int wrt = 10;
//        modifyValue(wrt);
//        System.out.println(" ======== 5 ZADANIE =========");
//        int val = findmax(10,5,7);
//        System.out.println(val);
//        System.out.println(" ======== 6 ZADANIE =========");
//        int[] first = new int[(int) (Math.random() * 10)];
//        int[] second = new int[(int) (Math.random() * 10)];
//        for (int i = 0; i < first.length; i++) {
//            first[i] = (int) (Math.random() * 10);
//        }
//        for (int i = 0; i < second.length; i++) {
//            second[i] = (int) (Math.random() * 10);
//        }
//
//        for (int i = 0; i < first.length; i++) {
//            System.out.print(first[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < second.length; i++) {
//            System.out.print(second[i] + " ");
//        }
//        System.out.println();
//        int[] res = funtab(first, second, 2);
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i] + " ");
//        }
        System.out.println("======== Zadanie Pilkarskie");
        String[][] arr =
                {
                        {"Germany",  "2", "Scotland", "1"},
                        {"Poland", "2", "Germany",    "0"},
                        {"Germany",  "1", "Ireland",  "1"},
                        {"Poland",   "2", "Scotland", "2"},
                        {"Scotland", "1", "Ireland",  "0"},
                        {"Ireland",  "1", "Poland",   "1"},
                        {"Ireland",  "1", "Scotland", "1"},
                        {"Germany",  "3", "Poland",   "1"},
                        {"Scotland", "2", "Germany",  "3"},
                        {"Ireland",  "1", "Germany",  "0"},
                        {"Scotland", "2", "Poland",   "2"},
                        {"Poland",   "2", "Ireland",  "1"}
                };

                int[] punkty = new int[4];

                for (int i = 0; i < arr.length; i++) {

                    String team1 = arr[i][0];
                    String team2 = arr[i][2];
                    int score1 = Integer.parseInt(arr[i][1]);
                    int score2 = Integer.parseInt(arr[i][3]);

                    int index1 = FindTeamIndex(team1);
                    int index2 = FindTeamIndex(team2);

                    if(score1 > score2) {
                        punkty[index1] += 3;
                    }
                    else if(score1 < score2) {
                        punkty[index2] += 3;
                    }
                    else {
                        punkty[index1] += 1;
                        punkty[index2] += 1;
                    }
                }

        System.out.println("Punkty drużyn:");
        System.out.println("Germany: " + punkty[0]);
        System.out.println("Ireland: " + punkty[1]);
        System.out.println("Poland: " + punkty[2]);
        System.out.println("Scotland: " + punkty[3]);
    }

    public static int FindTeamIndex(String team) {
        switch (team) {
            case "Germany":
                return 0;
            case "Ireland":
                return 1;
            case "Poland":
                return 2;
            case "Scotland":
                return 3;
            default:
                return -1;
        }
    }


    public static int[] funtab(int[] a, int[] b, int par) {
        // Jeśli tablice mają tę samą długość, zwracamy pustą tablicę
        if (a.length == b.length) {
            return new int[0];
        }

        int[] result;

        if (par < 0) {
            // Suma elementów na tych samych indeksach (uwzględniamy tylko wspólne elementy)
            int minLength = Math.min(a.length, b.length);
            result = new int[minLength];
            for (int i = 0; i < minLength; i++) {
                result[i] = a[i] + b[i];
            }
        } else if (par > 0) {
            // Elementy, które nie mają "pary" indeksowej
            if (a.length > b.length) {
                result = new int[a.length - b.length];
                for (int i = 0; i < result.length; i++) {
                    result[i] = a[b.length + i];
                }
            } else {
                result = new int[b.length - a.length];
                for (int i = 0; i < result.length; i++) {
                    result[i] = b[a.length + i];
                }
            }
        } else {
            result = new int[0];
        }

        return result;
    }

    public static void show(int a){
        System.out.println(a);
    }
    public static void modifyValue(int a){
        System.out.println(a);
        a *= 5;
        System.out.println(a);
    }
    public static int findmax(int a, int b, int c){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }



}
