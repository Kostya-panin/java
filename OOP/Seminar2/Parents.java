package Java.Homework.OOP.Seminar2;

abstract class Parents {

    protected String name;
    protected String surname;
    protected Integer DateOfBirth;
    protected Integer HumanId;
    protected String gender;

    public Parents(String name,String surname,Integer DateOfBirth,Integer HumanId,String gender) {
        this.name=name;
        this.surname=surname;
        this.HumanId=HumanId;
        this.DateOfBirth=DateOfBirth;
        this.gender=gender;
    }

    public String getInfo() {
        return String.format("Имя: %s  Фамилия: %s  Дата рождения: %d ID: %d",
                this.name, this.surname, this.DateOfBirth,this.HumanId);
    }
}
