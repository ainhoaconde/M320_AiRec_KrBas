package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
private static boolean isRunning = true;

    public static void main(String[] args) {
        boolean cont = true;
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("|\t[1]  - Football Teams           |");
            System.out.println("|\t[2]  - Football Players         |");
            System.out.println("+-----------------------------------+");
            Scanner scanchoice = new Scanner(System.in);
            int choiceentry = scanchoice.nextInt();
            if (choiceentry == 1) {
                printTeams();
            } else if (choiceentry == 2) {
                printPlayers();
            }else{
                System.out.println("Invalid Input");
            }
            System.out.println("----------------------------------------------");
            System.out.println("Wollen Sie weitermachen  1-ja  0-nein");
            int antwort = scanchoice.nextInt();
            if (antwort == 1) {
                cont = true;
            } else {
                cont = false;
            }
        } while (cont);
    }


    public static void printTeams(){
        List<String> footballTeams = new ArrayList<>();
        footballTeams.add("FC Zürich");
        footballTeams.add("FC Basel");
        footballTeams.add("FC St. Gallen");
        footballTeams.add("FC Luzern");
        footballTeams.add("FC Thun");
        footballTeams.add("FC Sion");
        footballTeams.add("FC Lugano");
        footballTeams.add("FC Lausanne-Sport");
        footballTeams.add("FC Aarau");
        footballTeams.add("FC Vaduz");
        footballTeams.add("FC Wil");
        footballTeams.add("FC Chiasso");
        footballTeams.add("FC Schaffhausen");
        footballTeams.add("FC Winterthur");
        System.out.println(footballTeams);

    }

    public static void printPlayers(){
        List<String> footballPlayers = new ArrayList<>();
        footballPlayers.add("Yannick Brecher");
        footballPlayers.add("Xherdan Shaqiri");
        footballPlayers.add("Lionel Messi");
        footballPlayers.add("Valon Behrami");
        footballPlayers.add("Breel Embolo");
        footballPlayers.add("Haris Seferovic");
        footballPlayers.add("Josip Drmic");
        footballPlayers.add("Denis Zakaria");
        footballPlayers.add("Fabian Frei");
        footballPlayers.add("Albian Ajeti");
        footballPlayers.add("Mario Gavranovic");
        footballPlayers.add("Remo Freuler");
        footballPlayers.add("Michael Lang");
        footballPlayers.add("Admir Mehmedi");
        System.out.println(footballPlayers);



    }
}
