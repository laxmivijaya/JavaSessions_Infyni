package interfacePkg;

import java.sql.SQLDataException;

public class Rectangle implements Shape, Shape1 {

    @Override
    public void drawShape()  {
        System.out.println("**Rectangle shape");

        try {
            int a = 5 / 0;
        }
        catch(Exception e){
        }
    }

    @Override
    public void drawShape1() {

    }


    public void display(){
        System.out.println("*****************");
    }

}
