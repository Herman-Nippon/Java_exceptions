package model;

import CustomExceptions.IncorrectTypeException;
import CustomExceptions.WrongAmountOfEntriesException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    private final int amountOfEntries = 6;

    public String surname;
    public String name;
    public String patronymic;
    public String birthDate;
    public String telephoneNumber;
    public String gender;


    public Data(String[] inputArray) {
        if (inputArray.length != amountOfEntries) throw new WrongAmountOfEntriesException(amountOfEntries, inputArray.length);

        this.surname = inputArray[0];
        this.name = inputArray[1];
        this.patronymic = inputArray[2];

        boolean correctDate = inputArray[3].matches("^(0[1-9]|[1-2][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}$");
        if (correctDate) {
            this.birthDate = inputArray[3];
        } else {
            throw new IncorrectTypeException("Date", inputArray[3]);
        }

        boolean correctNumber = inputArray[4].matches("\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}");
        if (correctNumber) {
            this.telephoneNumber = inputArray[4];
        } else {
            throw new IncorrectTypeException("Telephone number", inputArray[4]);
        }

        boolean correctGender = inputArray[5].matches("[mf]");
        if (correctGender) {
            this.gender = inputArray[5];
        } else {
            throw new IncorrectTypeException("Gender", inputArray[5]);
        }
    }
}
