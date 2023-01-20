package Java.Homework.OOP.Seminar5;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public float getValue(String title) {
        System.out.printf("%s", title);
        return in.nextFloat();
    }

    public int getAction(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void print(float data, String title) {
        System.out.printf("%s %f\n", title, data);
    }
}
