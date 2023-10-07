import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        System.out.println("Insert your sentence: ");
        String s1 = insert.nextLine();
        System.out.println("Reversed: "+ Reverse(s1));


    }

    public static String Reverse(String s1) {
        char[] arr = s1.toCharArray();
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i];
        }
        return result;

    }
}
