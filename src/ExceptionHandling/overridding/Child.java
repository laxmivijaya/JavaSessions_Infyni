package ExceptionHandling.overridding;

import java.io.IOException;

public class Child extends Base{

    public void message()   throws IOException {}
    public void message1()  {}
    public void message2()  {}
    public void message3() throws  Exception{}
    public void message4() throws  RuntimeException{}
}
