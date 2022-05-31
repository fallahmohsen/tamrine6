package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
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
}

