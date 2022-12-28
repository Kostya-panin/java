package Java.Seminars.Seminar1;

public class Human {
    protected String name;
    protected String surname;
    protected Integer DateOfBirth;
    protected Integer HumanId;


    public Human(String name,String surname,Integer DateOfBirth,Integer HumanId) {
        this.name=name;
        this.surname=surname;
        this.HumanId=HumanId;
        this.DateOfBirth=DateOfBirth;
    }

    public Human() {
        this.name=null;
        this.surname=null;
        this.DateOfBirth=null;
    }

    public String getInfo() {
        return String.format("Имя: %s  Фамилия: %s  Дата рождения: %d ID: %d",
                this.name, this.surname, this.DateOfBirth,this.HumanId);
    }

    public String greetings(){
        String greet = "Привет! Я человек!!";
        return greet ;
    }

    public void setName(String name){
        this.name=name;
 
   }
   public Integer getHumanid(){
    return this.HumanId;
   }
   @Override
   public String toString() {
       return getInfo();
   }
}
