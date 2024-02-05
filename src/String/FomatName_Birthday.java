package String;

import java.util.Scanner;

public class FomatName_Birthday {
    public static String fomatName(String s) {
        StringBuilder res = new StringBuilder();
        String[] arr = s.split("\\s+");
        for (String x : arr) {
            res.append(Character.toUpperCase(x.charAt(0)));
            for (int i = 1; i < x.length(); i++) {
                res.append(Character.toLowerCase(x.charAt(i)));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print(fomatName(name)+ "\n");
        String ngaysinh = sc.nextLine();
        StringBuilder sb = new StringBuilder(ngaysinh);
        if (sb.charAt(1) == '/') sb.insert(0, '0');
        if (sb.charAt(4) == '/') sb.insert(3, '0');
        System.out.print(sb);
    }
}
