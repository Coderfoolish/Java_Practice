package String;

import java.util.Arrays;
import java.util.Scanner;

public class SortWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        Arrays.sort(arr);
        for (String x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
