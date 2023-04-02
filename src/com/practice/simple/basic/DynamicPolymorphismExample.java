package src.com.practice.simple.basic;

class Parent{
    public void parentMethod(){
        System.out.println("Parent Method.");
    }

//    public void childMethod(){
//        System.out.println("Parent child Method.");
//    }
}
class Child extends Parent{
    public void childMethod(){
        System.out.println("Child Method.");
    }
}
public class DynamicPolymorphismExample {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.parentMethod();
        Child c = new Child();
        c.childMethod();

        Parent p1 = new Child();
        // Must have method in Parent class also.
//        p1.childMethod();
    }
}
