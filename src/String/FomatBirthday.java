package String;

import java.util.Scanner;

public class FomatBirthday {
    public static void main(String[] args) {
        //cach1
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("/");
        String temp = String.format("%02d", Integer.parseInt(arr[0])) + "/";
        temp += String.format("%02d", Integer.parseInt(arr[1])) + "/" + arr[2];
        System.out.println(temp);
        //cach2
        /*
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3,"0") ;
        System.out.println(sb);
         */
    }
}
