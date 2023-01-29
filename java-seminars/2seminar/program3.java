import java.io.*;

public class program3 {
    public static void main(String[] args) throws IOException {

    }

    public void fillFile(String text, String line) {
        FileWriter fw = null;
        try {
            File file = new File("file.txt");
            fw = new FileWriter(file, true);
            fw.append(System.lineSeparator());
            String st = "TEST ";
            fw.append(repeatStr(st));
            fw.append(System.lineSeparator());
            fw.close();

        } catch (Exception e) {

        } finally {
            if (fw != null) {

            }

        }
    }

    public static String repeatStr(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            result.append(text);

        }
        return result.toString();
    }}

    // try(FileWriter fileWriter = new FileWriter("file.txt")){
    //     fileWriter.append("TEST ".repeat(100));
    // }catch(IOException ex){
    //     System.out.println("Не удалось открыть файл");
    // }