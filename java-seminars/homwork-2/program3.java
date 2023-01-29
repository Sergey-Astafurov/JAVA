import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class program3 {
    public static void main(String[] args) throws IOException {
        String str = readFile("text3.txt");
        String pars = parsString(str);
        String stringText = getResultArray(pars);
        System.out.println(stringText);


    }
    public static String readFile(String name) {
        String str = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(name));
            str = br.readLine();
            br.close();
        } catch (IOException ex){
            System.out.println("Something wrong!");
        }
        return str;

    }


    public static String parsString(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.substring(1, str.length()-1);
        String[] strArr = str.split(", ");

        for (String el : strArr){
            sb.append(String.join(",", parsStr(el)));
            sb.append(",");
        }
        return sb.toString();
    }
    static String[] parsStr(String str){
        int index = 0;
        str = str.substring(1, str.length()-1);
        String[] strArr = str.split(",");
        int length = strArr.length;
        String[] sqlName = new String[length];
        for (String el : strArr){
            int ind = el.indexOf(':');
            sqlName[index] = el.substring(ind+2, el.length()-1);
            index++;
        }
        return sqlName;
    }
    static String getResultArray(String str){
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(",");
        for (int i = 0; i <arr.length ; i+=3) {
            sb.append("Студент ");
            sb.append(arr[i]);
            sb.append(" получил ");
            sb.append(arr[i+1]);
            sb.append(" по предмету ");
            sb.append(arr[i+2]);
            sb.append(".");
            sb.append("\n");
        }
        return sb.toString();
    }
}
