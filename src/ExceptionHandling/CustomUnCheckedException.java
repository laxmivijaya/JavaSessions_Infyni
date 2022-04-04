package ExceptionHandling;

public class CustomUnCheckedException extends RuntimeException{

    private String errorMessage;

    public CustomUnCheckedException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
