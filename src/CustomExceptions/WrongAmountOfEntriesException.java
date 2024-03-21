package CustomExceptions;

public class WrongAmountOfEntriesException extends RuntimeException {
    public WrongAmountOfEntriesException(int defaultEntriesNumber, int entriesNumber) {
        super(String.format("You have entered wrong amount of arguments. Expected %d, got %d.", defaultEntriesNumber, entriesNumber));
    }
}
