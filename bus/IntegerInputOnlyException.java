package bus;

public class IntegerInputOnlyException extends NumberFormatException {
    public IntegerInputOnlyException(String message) {
        super(message);
    }

    public IntegerInputOnlyException(int input) {
        String inputString = String.valueOf(input);
        if (!inputString.matches("^[0-9]+$")) {
            throw new NumberFormatException("Your input is in the wrong format: " + inputString);
        }
    }
}