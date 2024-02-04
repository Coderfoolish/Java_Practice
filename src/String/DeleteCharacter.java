package String;

import java.util.Scanner;

public class DeleteCharacter {
    public static void main(String[] args) {
        //Cach 1
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for (char x : s.toCharArray()) {
            if (!(x == 't' || x == 'a' || x == 'n'))
                res.append(x);
        }
        if (res.isEmpty())
            System.out.println("EMPTY");
        else {
            System.out.println(res);
        }
        //Cach 2
        /*
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == 't' || c == 'a' || c == 'n') {
                sb.deleteCharAt(i);
                --i;
            }
        }
        if (sb.length() == 0 ) {
            System.out.print("EMPTY");
        } else {
            System.out.print(sb);
        }
         */
    }
}
