package Java.Seminars.Seminar1;

public class Malechild extends Male{
    private Integer schoolnumber;

    public Malechild(String name,String surname,Integer DateOfBirth,Integer HumanId,Integer schoolnumber){
        super(name,surname,DateOfBirth,HumanId);
        this.gender="male";
    }

    public Malechild(){
        super();
        this.gender="male";
    }

    public String getGender(){
        return this.gender;
    }

    public String getName(){
        return super.name;
    }

    @Override
    public String greetings(){
    String greet = "Привет! Я ребенок человека мужского пола!!";
        return greet ;
    }
}
