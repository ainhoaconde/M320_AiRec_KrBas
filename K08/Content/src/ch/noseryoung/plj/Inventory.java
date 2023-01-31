package ch.noseryoung.plj;

import java.util.*;


public class Inventory {

    ArrayList<Item> items = new ArrayList<>();

    public void createItem(String name, int price) {
        items.add(new Item(name, price));
    }

    public void getItems() {
        System.out.println("**********************************************");
        System.out.println("                   Items");
        System.out.println("**********************************************");
        Collections.sort(items);
        for (Item item : items) {
            System.out.println("Name: " + item.getName());
            System.out.println("Price: " + item.getPrice());
            System.out.println("----------------------------------------------");
        }

    }

   /* void insertionSort()
    {

        for (int i = 1; i < items.size(); i++) {
            Item key = items.get(i);
            int j = i - 1;

            while (j >= 0 && items.get(j).getPrice() > key.getPrice()) {
                items.set(j + 1, items.get(j));
                j--;
            }
            items.set(j + 1, key);
        }

        for (Item item : items) {
            System.out.println("Name: " + item.getName());
            System.out.println("Price: " + item.getPrice());
        }
    }*/


}


