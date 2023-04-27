//******************************************************************
//  Activity 29
//  Name: Ben Keys
//  Data Structures Date: 03/27/2023
//******************************************************************
//  A demonstration of generics.
//******************************************************************

import java.util.ArrayList;

public class GenericMethods {
    public <E> void printArrayList(ArrayList<E> arrayList) {
        for (E element : arrayList) {
            System.out.printf("%s ", element);
        }
    }
}
