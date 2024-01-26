package Superclass_Person_and_its_subclasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Student> arr1 = new ArrayList<>();
        ArrayList<Staff> arr2 = new ArrayList<>();
        sc.nextLine();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr1.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextDouble()));
            sc.nextLine();
            sc.nextLine();
        }
        for (int i = 0; i < m; i++) {
            arr2.add(new Staff(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
            sc.nextLine();
            sc.nextLine();
        }
        arr1.sort((o1, o2) -> {
            if (o1.getFee() != o2.getFee()) {
                if (o1.getFee() < o2.getFee())
                    return -1;
                return 1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });
        arr2.sort((o1, o2) -> {
            if(o1.getPay() != o2.getPay()){
                if(o1.getPay() > o2.getPay())
                    return -1 ;
                return 1 ;
            }else {
                return o1.getName().compareTo(o2.getName()) ;
            }
        });
        for(Student temp : arr1){
            System.out.println("List Student :" +temp);
        }
        for(Staff temp : arr2){
            System.out.println("List Staff :"+temp);
        }
    }
}
