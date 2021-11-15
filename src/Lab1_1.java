import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1_1 {

    public static void main(String[] args) {
	try {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.print("Введите число c: ");
        int c = in.nextInt();
        System.out.print("Введите число d: ");
        int d = in.nextInt();
        if (a <= b && a <= c && a <= d) {
            System.out.println("Наименьшее число: " + a);
        }
        else if (b <= a && b <= c && b<= d) {
            System.out.println("Наименьшее число: " + b);
        }
        else if (c <= a && c <= b && c<= d) {
            System.out.println("Наименьшее число: " + c);
        }
        else if (d <= a && d <= b && d<= c) {
            System.out.println("Наименьшее число: " +d);
		in.close();
        }
    } catch (InputMismatchException e) {
        System.out.println("Ошибка.Введите целое число");
    }
    }
}
// <= написано с целью учета случаев, когда несколько чисел или все равны
