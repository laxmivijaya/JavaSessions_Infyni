package interfacePkg;

public class Square implements Shape, Shape1 {
    @Override
    public void drawShape() {
        System.out.println("**Square shape");
    }

    @Override
    public void drawShape1() {

    }
}
