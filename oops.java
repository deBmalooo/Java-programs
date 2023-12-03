public class oops {
    public static void main(String args[]){
        Pen p1 = new Pen(); // a constructor is called p1
        p1.setColor("Red");
    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;

    void calcAverage(int phy,int chem,int maths){
        percentage = (phy + chem + maths )/3;
    }
}
