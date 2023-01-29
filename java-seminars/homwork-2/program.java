
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program {
    public static void main(String[] args) {
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String line = str.substring(1, str.length()-1);
        String faza1 = splitString(line, ",");
        String faza2 = splitString(faza1, ":");
        String faza3 = faza2.replace("\"\"", " ");
        String faza4 = faza3.replace("\"", "");
        String[] fh = faza4.split(" ");
        String name = fh[1];
        String country = fh[3];
        String city = fh[5];

        System.out.println(createSQL(name,country,city));


    }
    public static String readFile(String fileName){
        String str = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            str = br.readLine();
            br.close();
        } catch (IOException ex){
            System.out.println("Something wrong!");
        }
        return str;
    }
    public static String splitString ( String array, String value) {
        StringBuilder sb = new StringBuilder();
        String[] arr = array.split(value);
        for (String word: arr) {
            sb.append(word);
        }
        return sb.toString();
    }
    static String createSQL(String name, String country, String city){
        StringBuilder result = new StringBuilder();

        result.append("SELECT * FROM students WHERE name = \"");
        result.append(name);

        result.append("\" AND country = \"");
        result.append(country);

        result.append("\" AND city = \"");
        result.append(city);
        result.append("\";");

        return result.toString();
    }
}