package Java.Seminars.Seminar1;

public class Program {
    public static void main(String[] args) {
        
        //Human human1 = new Human("kostya", "panin", 1990,980);
        //Human human2 = new Human("Vyacheslav", "panin", 1990,965);
        //Human human3 = new Human("Svetlana", "panina", 1990,786);
        Human human4= new Female("Natasha", "Panina", 1995,789);
        //Human human5= new Female("Sonya", "Panina", 2000,790);
        Human human6= new Male("Aleksey", "Panin", 2000,791);
        Human human7= new Female("Anton", "Panin", 2000,791);
        FamilyRelations relation1 = new FamilyRelations(human6, human4);
        relation1.addRelation(human7, human8);
        System.out.println(relation1.getAllsons(human4));


        
        
        //System.out.println(parentChildren.keySet());

      
        //Human human2 = new Human("kostya", "panin", 1990);
        //System.out.println(human2.getInfo());
       
        //Human human3 = new Human("kostya", "panin", 1990);
        //System.out.println(human3.getInfo());
       
        

       //System.out.println(human1.getName());
       //Male male1=new Male("sasha", "lyadov", 1990, 888);
       //Male male2=new Male();
       //System.out.println(male2.getName());


        //System.out.println(human1.getSurname());
    }
   
}

