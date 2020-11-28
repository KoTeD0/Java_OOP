package labs;
import java.util.Scanner;

    public class Palindrome {

        public static boolean palindrome(String s) {
            boolean fl = true;
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr[s.length() - i - 1]) {
                    fl = false;
                }
            }
            return fl;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String s = in.nextLine();
            if (palindrome(s)) {
                System.out.print("Это палиндром!");
            } else {
                System.out.print("Это не палиндром.");
            }
        }
    }
