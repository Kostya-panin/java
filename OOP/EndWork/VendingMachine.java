package Homework.OOP.EndWork;
import java.util.ArrayList;
import java.util.UUID;
import java.io.*;
public class VendingMachine {
    int NumberToys;
    int frequency;
    ArrayList<Toy> toys = new ArrayList<Toy>();
    public VendingMachine(){
        this.NumberToys=toys.size();
    }
    public void GetToys(){
        for (Toy toy : toys) {
            System.out.println("Имя игрушки: "+toy.NameToy);
            System.out.println("Вероятность выпадения игрушки: "+toy.frequency);
            System.out.println("Идентификатор игрушки: "+toy.ToyID);
            System.out.println(" ");
        }
    }
        public void GetToy(Toy toy){
                System.out.println("Имя игрушки: "+toy.NameToy);
                System.out.println("Вероятность выпадения игрушки: "+toy.frequency);
                System.out.println("Идентификатор игрушки: "+toy.ToyID);
                System.out.println(" ");
    }
    public void AddToy(Toy toy){
        toys.add(toy);
    }
    public int GetNumberToys(){
       return toys.size();
    }
    public void SetfrequencyToys(Toy toy,int frequencyToys){
        toy.frequency=frequencyToys;
    }
    public Toy ChoiceOfPrizeToys(){
        int n = (int)Math.floor(Math.random() * toys.size());
        Toy prizetoy=toys.get(n);
        File newFile = new File("PrizeToys.txt");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }  
        try(FileWriter writer = new FileWriter("PrizeToys.txt", true))
        {
            String text = "Имя игрушки: "+prizetoy.NameToy+'\n'+"ID игрушки: "+prizetoy.ToyID+'\n'+'\n';
            writer.write(text);
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
        toys.remove(n);
        return prizetoy;
    }
}




