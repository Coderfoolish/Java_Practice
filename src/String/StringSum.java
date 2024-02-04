package String;

import java.util.Scanner;
//tinh tong cac chu so co trong chuoi ( bao gom chu so va chu cai )
public class StringSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int tong = 0;
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x))
                tong += x - '0' ;
        }
        System.out.println(tong);
    }
}
