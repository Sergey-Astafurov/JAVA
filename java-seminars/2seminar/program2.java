import java.util.Scanner;

public class program2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String lines = getString("Text");
        System.out.println(StringCrop(lines));

    }

    public static StringBuilder StringCrop(String text) {
        StringBuilder line = new StringBuilder();
        int cout = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                cout += 1;

            } else if (text.charAt(i) != text.charAt(i + 1)) {
                cout += 1;
                line.append(cout);
                line.append(text.charAt(i));
                cout = 0;

            }
            if (i == text.length() - 2 && text.charAt(i - 2) != text.charAt(i - 1)) {
                line.append(text.charAt(i));

            }else if(i == text.length() - 2 && text.charAt(i - 2) == text.charAt(i - 1)){
                cout++;
                line.append(cout);
                line.append(text.charAt(i));
            }
        }
        return line;

    }

    public static String getString(String text) {
        System.out.print(text);
        return sc.nextLine();
    }
}
