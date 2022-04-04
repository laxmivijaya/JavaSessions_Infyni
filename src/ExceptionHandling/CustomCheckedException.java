package ExceptionHandling;

public class CustomCheckedException extends Exception{

    private String errorMessage;

    public CustomCheckedException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
