package inheritance.multilevelInheritance;

public class TestMultilevelInheritance {

    public static void main(String[] args) {

        Father father=new Father();

        System.out.println("Calling father class info..");
        father.getNameOfClass1();
        father.getNameOfClass2();




        System.out.println("Calling father class info..");
        Child child=new Child();
        child.getNameOfClass1();
        child.getNameOfClass2();
        child.getNameOfClass3();
        child.x1();


    }
}
