package Customer_Invoice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Invoice> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] cusID = sc.nextLine().split("\\s+");
            String[] name = sc.nextLine().split("\\s+");
            String[] dis = sc.nextLine().split("\\s+");
            String[] idInv = sc.nextLine().split("\\s+");
            String[] amount = sc.nextLine().split("\\s+");

            StringBuilder fullnameBuilder = new StringBuilder();
            for (int j = 3; j < name.length; j++) {
                fullnameBuilder.append(name[j]).append(" ");
            }
            String fullname = fullnameBuilder.toString();
            fullname = fullname.substring(0, fullname.length() - 1);
            Customer tmp = new Customer(Integer.parseInt(cusID[cusID.length - 1]), fullname, Integer.parseInt(dis[dis.length - 1]));
            Invoice reuslt = new Invoice(tmp, Integer.parseInt(idInv[idInv.length - 1]), Double.parseDouble(amount[amount.length - 1]));
            reuslt.setAmount();
            arr.add(reuslt);
            arr.sort((o1, o2) -> {
                if (o1.getAmount() == o2.getAmount()) {
                    if (o1.getCustomers().getId() < o2.getCustomers().getId())
                        return -1;
                    return 1;
                } else if (o1.getAmount() > o2.getAmount()) return -1;
                else return 1;
            });
            for (Invoice x : arr)
                System.out.print(x);
        }

    }
}
