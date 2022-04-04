package ExceptionHandling.overridding;

import java.io.IOException;

public class Base {
    public void message() throws IOException {}
    public void message1() throws IOException {}
    public void message2() throws  RuntimeException{}
    public void message3() throws  Exception{}
    public void message4() throws  ArithmeticException{}
}
