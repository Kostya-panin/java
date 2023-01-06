package Java.Homework.OOP.Seminar2;

public class Mother extends Parents implements Imovement {
    String hairColor;
    public Mother(String name,String surname,Integer DateOfBirth,Integer HumanId, String gender, String hairColor){
        super(name,surname,DateOfBirth,HumanId,gender);
        this.hairColor=hairColor;

    }
    @Override
    public String move() {
        return "Мама ездит на метро";
    }
}
