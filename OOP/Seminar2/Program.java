package Java.Homework.OOP.Seminar2;

public class Program {
    public static void main(String[] args) {
        Mother Natalia = new Mother( "Natalia", "Panina", 1990, 3, "female", "red");
        Father Konstantin = new Father( "Natalia", "Panina", 1990, 4, "female", "blue");
        Child Aleksey=new Child("Aleksey", "Panin", 1990, 1, "male", 15,Natalia,Konstantin);


        System.out.println(Aleksey.getInfo());
        System.out.println(Aleksey.geteyecolor());
        System.out.println(Aleksey.gethairColor());
        System.out.println(Aleksey.gethairColor());
        System.out.println(Aleksey.getmovement());
        
    }
}
