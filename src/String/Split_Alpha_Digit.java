package String;

import java.util.Scanner;

public class Split_Alpha_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x))
                System.out.print(x);
        }
        System.out.println();
        for (char x : s.toCharArray()) {
            if (Character.isAlphabetic(x))
                System.out.print(x);
        }
    }
}
