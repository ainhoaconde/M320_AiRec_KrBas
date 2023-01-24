package ch.noseryoung.plj;

import java.util.ArrayList;
import java.util.Comparator;


public class Inventory {

    ArrayList<Item> items = new ArrayList<>();

    public void createItem(String name, double price) {
        items.add(new Item(name, price));
    }

    public void getItems() {
        System.out.println("**********************************************");
        System.out.println("                   Items");
        System.out.println("**********************************************");
        items.sort(Comparator.comparing(Item::getPrice));
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Name: " + items.get(i).getName());
            System.out.println("Price: " + items.get(i).getPrice());
            System.out.println("----------------------------------------------");
        }

    }

    void bubblesort() {
        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < items.size() - 1; j++) {
                if (items.get(j).getPrice() > items.get(j + 1).getPrice()) {
                    Item temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);
                    System.out.println("Sortiert");
                    System.out.println("Name: " + items.get(i).getName());
                    System.out.println("Price: " + items.get(i).getPrice());
                }
            }
        }
    }

    }


