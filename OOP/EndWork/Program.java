package Homework.OOP.EndWork;

public class Program {
    public static void main(String[] args){
        //Создадим игрушки для автомата для розыгрыша игрушек
        Toy toy1 = new Toy("bear",50);
        Toy toy2 = new Toy("shrek",50);
        Toy toy3 = new Toy("rabbit",50);
        Toy toy4 = new Toy("tigr",50);
        //Создадим автомат для розыгрыша игрушек
        VendingMachine machine = new VendingMachine();
        //Добавим игрушки в автомат для розыгрыша игрушек
        machine.AddToy(toy1);
        machine.AddToy(toy2);
        machine.AddToy(toy3);
        machine.AddToy(toy4);
        //Выведем количество игрушек в автомате
        System.out.println(machine.GetNumberToys());
        //Получим все игрушки что находятся в автомате
        System.out.println("Все игрущки в автомате:");
        machine.GetToys();
        //Изменим вес определенной игрушки в автомате
        machine.SetfrequencyToys(toy2, 15);
        //Запустим розыгрыш игрушек получим призовую игрушку и запишем ее в файл
        System.out.println("Призовая игрушка:");
        machine.GetToy(machine.ChoiceOfPrizeToys());
        //Получим все игрушки что находятся в автомате
        System.out.println("Все игрущки в автомате:");
        machine.GetToys();
    }
}
