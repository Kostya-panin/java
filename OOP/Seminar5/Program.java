package Java.Homework.OOP.Seminar5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        System.setErr(new PrintStream(new File("calclog.txt")));
        Presenter pdiv = new Presenter(new ActionModel(), new View());
        pdiv.buttonClick();

    }
}
