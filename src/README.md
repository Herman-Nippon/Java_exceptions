## Final project for the Exceptions course in Geekbrains.

Made by: Герман Пузиков


There are 4 main parts of this project:
* controller
* custom exceptions
* model
* view

1. Controller:
    * `Application` class

      Starting point of the application as well as the class that contains the "application loop".
   
2. Custom exceptions
    * `WrongAmountOfEntriesException` class 
      * Inherits the `RuntimeException` class. It is invoked when the amount of fields the user has provided is not the same as the expected amount.

    * `IncorrectTypeException` class 
      * Inherits the `IllegalArgumenException` class. It is invoked when application can't parse one of the fields of user input.
3. Model
    * `Data` class 
      * Fields:
        1. `amountOfEntries` -- the predetermined amount of entries for the correct application functioning.
        2. `surname`, `name`, `patronymic` -- person's name
        3. `birthDate` -- date of birth
        4. `telephoneNumber` -- number
        5. `gender` -- male/female
      * `Data(String[] inputArray)` -- constructor:
        * Takes an array of strings and parses each of them in the correct category. Throws different exceptions in different cases.
    * `DataParser` class
      * Fields:
        1. `data` -- a `Data` class object.
      * Methods:
        * `parseData`
          * creates a `Data` object and invokes `writeDataToFile`.
        * `writeDataToFile`
          * writes information from `date` field into a `.txt` file.
4. View
   * `View` class
     * contains `greeting`, `printMainMenu` and `farewell` static methods. Is used for the console output.