import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Properties properties = new Properties(";", false);
        CsvParser csv = new CsvParser("src/test.txt", properties);

        List<List<String>> test = csv.readAll();

        csv.printAll();
        csv.toFile("src/output.txt");
        List<String> line = new ArrayList<>();
        Collections.addAll(line, "I", "O", "P");
        csv.addColumn(line);
        csv.printAll();
    }



}
