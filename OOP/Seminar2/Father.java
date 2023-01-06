package Java.Homework.OOP.Seminar2;

public class Father extends Parents implements Imovement{
    String eyecolor;
    public Father(String name,String surname,Integer DateOfBirth,Integer HumanId, String gender,String eyecolor){
        super(name,surname,DateOfBirth,HumanId,gender);
        this.eyecolor=eyecolor;
    }
    @Override
    public String move() {
        return "Папа ездит на машине";
        
    }
}
