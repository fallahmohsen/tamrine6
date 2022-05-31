package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain {
    private   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        selectedAbility(arrayList);

        clearArrayList(arrayList, arrayList1);
        for (int s : arrayList1
        ) {
            System.out.println(s);
        }
    }

    public static void clearArrayList(ArrayList arrayList, ArrayList arrayList1) {
        if (arrayList.size() % 2 != 0) {
            int result = arrayList.size();
            result--;
            arrayList.remove(result);
        }
        for (int i = 0; i < arrayList.size(); i += 2) {
            if (arrayList.size() == 0) {
                break;
            }
            if ((int) arrayList.get(i) < (int) arrayList.get(i + 1)) {
                arrayList1.add(arrayList.get(i));
                arrayList1.add(arrayList.get(i + 1));
            }
        }
    }
    public static void selectedAbility(ArrayList<Integer>arrayList){
        LinkedList linkedList = new LinkedList();
        while (true) {
            System.out.println("enter number:");
            System.out.println("1.add");
            System.out.println("2.remove");
            System.out.println("3.search");
            System.out.println("4.exit");
            int selectedNumber = scanner.nextInt();
            if(selectedNumber==4){
                break;
            }
            switch (selectedNumber) {
                case 1:
                    linkedList.add(arrayList);
                    break;
                case 2:
                    linkedList.remove(arrayList);
                    break;
                case 3:
                    linkedList.search(arrayList);
                    break;
            }
        }

    }
}

