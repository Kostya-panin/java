package Homework.OOP.EndWork;
import java.util.UUID;
public class Toy{
    UUID ToyID = UUID.randomUUID();;
    String NameToy;
    int frequency=50;
    public Toy(String NameToy,int frequency){
       this.NameToy=NameToy;
       this.ToyID=ToyID; 
       this.frequency=frequency;
    }
}
    