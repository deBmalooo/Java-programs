public class constructor {
    public static void main(String args[]){
        Student s1 = new Student("debb");
        System.out.println(s1.name);
        Student s2 =new Student(567);
        System.out.println(s2.roll);
    }
}

class Student{
    String name;
    int roll;

    Student(String name){
        this.name=name;
    }
    Student(int r){
        this.roll=r;
    }
}