package controller;

import model.DataParser;
import view.View;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataParser parser = new DataParser();

        View.greeting();
        while (true) {
            View.printMainMenu();
            String line = scanner.nextLine();
            if (line.equals("exit")) break;
            parser.parseData(line);
        }
        View.farewell();
    }
}
