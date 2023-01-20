package Java.Homework.OOP.Seminar5;
import java.util.Date;


public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        System.err.println(new Date()+" Калькулятор запущен!!!!");
        float a = view.getValue("a: ");
        System.err.println(new Date()+" Пользователем введен первый операнд:"+a);
        float b = view.getValue("b: ");
        System.err.println(new Date()+" Пользователем введен второй операнд:"+b);
        model.setX(a);
        model.setY(b);
        int c = view.getAction("Выберите действие (1-Сумма, 2-Деление, 3-Умножение, 4-Вычитание): ");
        System.err.println(new Date()+" Пользователем выбрано действие");
    
        switch (c) {
            case (1):
                float sumresult = model.sumresult();
                System.err.println(new Date()+" Выполнено действие сложение:");
                view.print(sumresult, "Sum: ");
                System.err.println(new Date()+" Пользователь получил результат:"+sumresult);
                break;
            case (2):
                float divresult = model.divresult();
                System.err.println(new Date()+" Выполнено действие деление:");
                view.print(divresult, "Div: ");
                System.err.println(new Date()+" Пользователь получил результат:"+divresult);
                break;
            case (3):
                float multresult = model.multresult();
                System.err.println(new Date()+" Выполнено действие умножение:");
                view.print(multresult, "mult: ");
                System.err.println(new Date()+" Пользователь получил результат:"+multresult);
                break;
            case (4):
                float subresult = model.subresult();
                System.err.println(new Date()+" Выполнено действие вычитание:");
                view.print(subresult, "sub: ");
                System.err.println(new Date()+" Пользователь получил результат:"+subresult);
                break;
            default:
                break;
        }
        
    }
}
