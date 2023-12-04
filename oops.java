import javax.swing.DefaultBoundedRangeModel;

public class oops {
    public static void main(String args[]){
        Pen p1 = new Pen(); // a constructor is called p1
        p1.setColor("Red");  // Calling the function.
        System.out.println(p1.getColor());

        BankAccount myAcc= new BankAccount();
        myAcc.username="Debb";
        System.out.println(myAcc.username);
        myAcc.setPassw("shfsjfhs");
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassw(String pwd){
        password=pwd;
    }
}
class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
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
