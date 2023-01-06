package Java.Homework.OOP.Seminar2;

public class Child extends Parents implements IFather,IMother,Imovement{

    protected Integer schoolnumber;
    private String chhaircol;
    private String cheyecol;
    public Mother mother;
    public Father father;
    public Child(String name,String surname,Integer DateOfBirth,Integer HumanId, String gender,Integer Schoolnumber,Mother mother,Father father){
        super(name,surname,DateOfBirth,HumanId,gender);
        this.schoolnumber=schoolnumber;
        hairColor(mother);
        eyecolor(father);
    }

    public String geteyecolor(){
        return this.cheyecol;
    }

    public String gethairColor(){
        return this.chhaircol;
    }
    public String getmovement(){
        return move();
    }



    @Override
    public void hairColor(Mother mother) {
        //this.chc=IMother.HC;
        this.chhaircol=mother.hairColor;
        
    }

    @Override
    public void eyecolor(Father father) {
        //this.cht=IFather.HT;
        this.cheyecol=father.eyecolor;
    }

    @Override
    public String move() {
        return "Ребенок ездит на велосипеде";
    }

}
