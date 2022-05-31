package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class LinkedList {
    public void isnull(ArrayList<Integer> arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("ArrayList is null");
        }
    }

    public void add(ArrayList<Integer> arrayList) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("enter number :");
            int selectedNumber = scanner.nextInt();
            int selectedNumber1 = scanner.nextInt();
            arrayList.add(selectedNumber);
            arrayList.add(selectedNumber1);
            System.out.println("try again?");
            System.out.println("1.yes");
            System.out.println("2.no");
            int selectedNumber3 = scanner.nextInt();
            if (selectedNumber3 == 2) {
                flag = false;
            }
        }
    }

    public void remove(ArrayList<Integer> arrayList) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("enter number of index to remove:");
            arrayList.remove(scanner.nextInt());
            System.out.println("try again?");
            System.out.println("1.yes");
            System.out.println("2.no");
            int selectedNumber = scanner.nextInt();
            if (selectedNumber == 2) {
                flag = false;
            }
        }
    }
}
