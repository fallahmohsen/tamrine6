package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListMain {
    private   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        selectedAbility(arrayList,arrayList1);


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
        for (Object s : arrayList1
        ) {
            System.out.println(s);
        }
    }
    public static void selectedAbility(ArrayList<Integer>arrayList,ArrayList<Integer>arrayList1){

        while (true) {
            System.out.println("enter number:");
            System.out.println("1.add");
            System.out.println("2.remove");
            System.out.println("3.search");
            System.out.println("4.Show corrected numbers ");
            System.out.println("5.exit");

            int selectedNumber = scanner.nextInt();
            if(selectedNumber==5){
                break;
            }
            switch (selectedNumber) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    clearArrayList(arrayList,arrayList1);
            }
        }

    }
}

