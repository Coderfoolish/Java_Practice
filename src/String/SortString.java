package String;

import java.util.Arrays;
import java.util.Scanner;

//xap sep sau khi tu dong thoi` bo di so 0 vo nghia~
public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr); //sort duoc luon ca chu cai
        int index = 0;
        while (index < arr.length - 1 && arr[index] == '0') {
            ++index;
        }
        for (int i = index; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
