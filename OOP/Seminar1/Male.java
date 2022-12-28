package Java.Seminars.Seminar1;

public class Male extends Human {
    protected String gender;

    public Male(String name,String surname,Integer DateOfBirth,Integer HumanId){
        super(name,surname,DateOfBirth,HumanId);
        this.gender="male";
    }

    public Male(){
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
    String greet = "Привет! Я человек мужского пола!!";
        return greet ;
    }
}
