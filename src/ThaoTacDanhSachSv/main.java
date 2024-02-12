package ThaoTacDanhSachSv;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLine()));
            sc.nextLine();
            sc.nextLine() ;
        }
        arr.sort((o1, o2) -> {
            if (o1.getMssv() != o2.getMssv()) {
                if (o1.getMssv() >= o2.getMssv())
                    return -1;
                return 1;
            }
            else{
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
