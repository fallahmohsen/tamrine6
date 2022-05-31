package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class LinkedList {
    private static Scanner scanner = new Scanner(System.in);
    public void isnull(ArrayList<Integer> arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("ArrayList is null");
        }
    }

    public void add(ArrayList<Integer> arrayList) {
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
    public void search(ArrayList<Integer>arrayList){
        System.out.println("Enter a number to search");
        int selectedNumber = scanner.nextInt();
        for (int s:arrayList) {
            if(s==selectedNumber){
                System.out.println(s);
            }

        }
    }
}
