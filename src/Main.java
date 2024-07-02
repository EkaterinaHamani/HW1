import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(Five(5,5));
        Six(0);
        System.out.println(Seven(0));
        Eight(5, "Hello everybody");
        System.out.println(Nine(400));
        Ten();
        Eleven();
        System.out.println("");
        Twelwe();
        System.out.println("");
        Thirteen();
        Fourteen(5, 7);
    }
    //1
    public static void printThreeWords(){
        System.out.println("Задание 1");
        String a = "Orange";
        String b = "Banana";
        String c = "Apple";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    //2
    public static void checkSumSign(){
        System.out.println("Задание 2");
        int a = 5;
        int b = 6;
        int с = a + b;
        if (с >= 0) {
            System.out.println("Сумма положительная");}
        else if (с <= 0)
        {System.out.println("Сумма отрицательная");}
    }
    //3
    public static void printColor(){
        System.out.println("Задание 3");
        int value = -78;
        if (value <= 0)  {
            System.out.println("Красный");
        }
        if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");}
    }
    //4
    public static void compareNumbers(){
        System.out.println("Задание 4");
            int a = 8;
            int b = 19;
            if (a >= b)  {
                System.out.println("a >= b");
            }
            if (a < b) {
                System.out.println("a < b");}
        }
    //5
    static boolean Five(int a, int b) {
        System.out.println("Задание 5");
            int sum = a + b;
            if (sum > 9 && sum < 21) return true;
            else return false;
        }
    //6
    public static void Six(int a) {
        System.out.println("Задание 6");
            if (a < 0) System.out.println("Число отрицательное");
            else System.out.println("Число положительное");
        }
    //7
    public static boolean Seven(int a) {
        System.out.println("Задание 7");
        if (a < 0) return true;
            else return false;
        }
    //8
    public static void Eight(int i, String str) {
        System.out.println("Задание 8");
        String result = "";
            for( int u = 0; u < i;u++) {
                result = str;
                System.out.println(result);
            } }
    //9
        public static boolean Nine (int year) {
            System.out.println("Задание 9");
            if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) return true;
            else return false;
        }
    //10
    public static void Ten() {
        System.out.println("Задание 10");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0)
                    arr[i]++;
                else
                    arr[i]--;
            }
            System.out.println(Arrays.toString(arr));
        }
    //11
    public static void Eleven() {
        System.out.println("Задание 11");
        int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
                System.out.print(arr[i]+ " ");
            }
        }
    //12
    public static void Twelwe() {
        System.out.println("Задание 12");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] = arr[i] * 2;
                }
                System.out.print(arr[i]+ " ");
            }
        }
    //13
        public static void Thirteen() {
        System.out.println("Задание 13");
        int[][] arr = new int[3][3];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                    if (i == j || i == x) arr[i][j] = 1;
                    else arr[i][j] = 0;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    //14
        public static void Fourteen(int len, int initialValue) {
        System.out.println("Задание 14");
        int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
            }
        }}




