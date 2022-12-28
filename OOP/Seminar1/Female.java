package Java.Seminars.Seminar1;
public class Female extends Human {
    protected String gender;
    public Female(String name,String surname,Integer DateOfBirth,Integer HumanId){
        super(name,surname,DateOfBirth,HumanId);
        this.gender="female";
    }
    public String getGender(){
        return this.gender;
    }

    public String getName(){
        return super.name;
    }

    @Override
    public String greetings(){
    String greet = "Привет! Я человек женского пола!!";
        return greet ;
    }
}

