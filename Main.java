import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Properties properties = new Properties(";", true);
        CsvParser csv = new CsvParser("src/test.txt", properties);

        csv.readAll();
        List<String> line = new ArrayList<>();
        Collections.addAll(line, "I", "O");
        csv.setHeader("3;4");
        csv.addRaw(line, 1);
        csv.toFile("src/output.txt");
    }



}
