package view;

public class View {
    public static void greeting() {
        System.out.println("""
                Hello. This is an final project for the exceptions module in GeekBrains.
                ________________________________________________________________________
                
                """);
    }

    public static void printMainMenu() {
        System.out.print(
                """
                
                To close the program, enter "exit".
                Please, enter the following data, split by spaces:
                
                Surname, Name, Patronymic, Date of birth (dd.mm.yyyy), Telephone number (+7(xxx)xxx-xx-xx), Gender (m/f)
                (entries must match the examples!)
                """);
    }

    public static void farewell() {
        System.out.println("Thank you for your time!");
    }
}
