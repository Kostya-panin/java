package Java.Homework.OOP.Seminar5;

public class ActionModel extends CalcModel {

   

    @Override
    public void setX(float value) {
        super.x=value;
        
    }

    @Override
    public void setY(float value) {
        super.y=value;
        
    }

    @Override
    public float sumresult() {
        return x+y;
    }

    @Override
    public float divresult() {
        return x/y;
    }

    @Override
    public float multresult() {
        return x*y;
    }

    @Override
    public float subresult() {
        return x-y;
    }
    
}
