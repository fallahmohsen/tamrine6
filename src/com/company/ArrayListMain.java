package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        ClearArrayList(arrayList, arrayList1);
        for (int s : arrayList1
        ) {
            System.out.println(s);
        }
    }

    public static void ClearArrayList(ArrayList arrayList, ArrayList arrayList1) {
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
}

