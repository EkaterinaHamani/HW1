import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(taskFive(5, 5));
        taskSix(0);
        System.out.println(taskSeven(0));
        taskEight(5, "Hello everybody\n");
        System.out.println(taskNine(4));
        taskTen();
        taskEleven();
        taskTwelwe();
        taskThirteen();
        taskFourteen(5, 7);
    }

    //1
    public static void printThreeWords() {
        System.out.println("Задание 1");
        System.out.println("Orange\nBanana\nApple");
    }

    //2
    public static void checkSumSign() {
        System.out.println("Задание 2");
        int a = 5;
        int b = -6;
        int с = a + b;
        if (с >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //3
    public static void printColor() {
        System.out.println("Задание 3");
        int value = -78;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //4
    public static void compareNumbers() {
        System.out.println("Задание 4");
        int a = 8;
        int b = 19;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //5
    static boolean taskFive(int a, int b) {
        System.out.println("Задание 5");
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    //6
    public static void taskSix(int a) {
        System.out.println("Задание 6");
        if (a < 0) System.out.println("Число отрицательное");
        else System.out.println("Число положительное");
    }

    //7
    public static boolean taskSeven(int a) {
        System.out.println("Задание 7");
        return a < 0;
    }

    //8
    public static void taskEight(int i, String str) {
        System.out.println("Задание 8");
        System.out.println(str.repeat(i));
    }

    //9
    public static boolean taskNine(int year) {
        System.out.println("Задание 9");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) return true;
        else return false;
    }

    //10
    public static void taskTen() {
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
    public static void taskEleven() {
        System.out.println("Задание 11");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    //12
    public static void taskTwelwe() {
        System.out.println("\nЗадание 12");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    //13
    public static void taskThirteen() {
        System.out.println("\nЗадание 13");
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
    public static void taskFourteen(int len, int initialValue) {
        System.out.println("Задание 14");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}
