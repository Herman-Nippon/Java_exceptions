package model;

import java.io.FileWriter;
import java.io.IOException;

public class DataParser {
    private Data data;
    public void ParseData(String input) {
        this.data = new Data(input.split(" "));
        writeDataToFile();
    }

    private void writeDataToFile() {
        try (FileWriter fw = new FileWriter(data.surname + ".txt", true)) {
            String formattedData = String.format("%s %s %s %s %s %s%n",
                    data.surname, data.name, data.patronymic,
                    data.birthDate, data.telephoneNumber, data.gender);
            fw.write(formattedData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
