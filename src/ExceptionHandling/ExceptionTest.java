package ExceptionHandling;

public class ExceptionTest {

    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        try {
            int a = 1;
            int b = 0;
            Integer as=null;
            int k =as*3;
            stopProgram();
            int c = a / b;
            System.out.println("c::" + c);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException exception) {
            System.out.println("Exception occurred::" + exception.getLocalizedMessage());
        } catch (RuntimeException | InterruptedException exception) {
            System.out.println("RuntimeException occurred::" + exception.getLocalizedMessage());
        } finally {
            System.out.println("Finally block runs..");
        }
        System.out.println("Programs run fine...");
    }

    private static void stopProgram() throws InterruptedException {
        Thread.sleep(5000);
    }


}
