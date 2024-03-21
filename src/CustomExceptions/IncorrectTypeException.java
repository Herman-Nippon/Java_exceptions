package CustomExceptions;

import java.text.ParseException;

public class IncorrectTypeException extends IllegalArgumentException {
    public IncorrectTypeException(String type, String entry) {
        super(String.format("Can't parse %s into %s", entry, type));
    }
}
