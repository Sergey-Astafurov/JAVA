import java.util.*;

public class program {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = getNumber("Введи четное число");
        char c1 = getChar("Char1");
        char c2 = getChar("Char2");
        System.out.println(showString(N, c1, c2));


    }

    public static Integer getNumber(String text){
        System.out.print(text);
        return sc.nextInt();
    }
    public static char getChar(String text){
        System.out.print(text);
        return sc.next().charAt(0);
    }
    public static StringBuilder showString(int N, char c1, char c2){
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if(i % 2 != 0){
               line.append(c1);
            }
            else{
                line.append(c2);
            }
        }
        return line;
    }
}
