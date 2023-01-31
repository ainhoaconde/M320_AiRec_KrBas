package ch.noseryoung.plj;

import java.util.Scanner;

public class Menu {
    Inventory inv = new Inventory();
    boolean cont = true;
    public void menu() {
        inv.getItems();
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("|\t[1]  - Item hinzufügen          |");
            System.out.println("|\t[2]  - Items anzeigen           |");
            System.out.println("|\t[3]  - Exit                     |");
            System.out.println("+-----------------------------------+");
            Scanner scanchoice = new Scanner(System.in);
            int choiceentry = scanchoice.nextInt();
            if (choiceentry == 1) {
                inv.createItem("Brot", 1);
                inv.createItem("Käse", 3);
                inv.createItem("Schokolade", 2);
                // inv.createItem("Kaffee", 3);
                // inv.createItem("Bier", 2);


            } else if (choiceentry == 2) {
                inv.getItems();
            }else if (choiceentry == 3) {
                cont = false;
            }
            System.out.println("----------------------------------------------");
            System.out.println("Wollen Sie weitermachen  1-ja  0-nein");
            int antwort = scanchoice.nextInt();
            if (antwort == 1) {
                cont = true;
            } else {
                writeToFile();
                cont = false;
            }
        } while (cont);
    }
    private void writeToFile() {
        System.out.println("Write to file");
    }}