package BraveQ;

import java.util.Scanner;

public class MainBraveQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = Integer.parseInt(sc.nextLine().substring(8));
        int blood = Integer.parseInt(sc.nextLine().substring(8));
        String tmp = sc.nextLine();
        boolean alive = tmp.equals("ALIVE");
        NhanVat nv = new NhanVat(power, blood, alive);
        int even = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < even; i++) {
            String s = sc.nextLine();
            if (s.equals("pea")) {
                nv.pea();
            } else if (s.equals("mushroom")) {
                nv.mushroom();
            } else if (s.charAt(0) == 's') {
                int power1 = Integer.parseInt(s.substring(8));
                nv.solider(power1);
            } else {
                int power1 = Integer.parseInt(s.substring(6));
                nv.Witch(power1);
            }
            System.out.println(nv);
        }
    }
}
