package school.lesson1;

import static java.lang.System.out;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
                   out.println("Orange" + '\n'  + "Banana" + '\n' + "Apple");
    }
    public static void checkSumSign(){
        int a = -2;
        int b = 1;
        int c  = a + b;
        if ( c >= 0) out.println("Сумма положительная");
        else out.println("Сумма отрицательная");
    }
    public static void  printColor() {
        int value = -1;
        if ( value <= 0) out.println("Красный");
        else if (value > 0 && value <= 100)  System.out.println("Желтый");
        else System.out.println("Зеленый");
    }
    private static void compareNumbers() {
        int a = 1;
        int b = 5;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}
