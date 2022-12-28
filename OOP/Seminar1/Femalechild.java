package Java.Seminars.Seminar1;

public class Femalechild extends Female {
    private Integer schoolnumber;
    public Femalechild(String name,String surname,Integer DateOfBirth,Integer HumanId,Integer schoolnumber){
        super(name,surname,DateOfBirth,HumanId);
        this.gender="female";
        this.schoolnumber=schoolnumber;
    }
    @Override
    public String greetings(){
    String greet = "Привет! Я ребенок человека женского пола!!";
        return greet ;
    }
}
