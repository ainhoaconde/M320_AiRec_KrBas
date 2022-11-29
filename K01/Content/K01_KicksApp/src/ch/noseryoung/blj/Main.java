package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
// In der Klasse main.java arbeiten sie mit try-catch, um fehlerhafte eingaben abzufangen. z.B. kannein Benutzer bei einer Zahlen-Eingabe einen Text eingeben, was einen Fehler wirft. Wenn einBenutzer einen fehlerhaften Wert eingibt, soll die Eingabe wiederholt werden, bis sie korrekt ist.Erstellen sie dazu eine neue Methode, die sie wiederverwenden können. Also z.B. soll jedeZahleneingabe, die gleiche Methode verwenden. Die Wiederholung wird in dieser neuen Methodeerstellt.

    public static void main(String[] args) {
        int antwort;
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
            } else {
                System.out.println("Invalid Input");
            }
            System.out.println("----------------------------------------------");
            System.out.println("Wollen Sie weitermachen  1-ja  0-nein");
            antwort = scanchoice.nextInt();
        } while (antwort == 1);
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

    public static void printPlayers() {
        List<String> footballPlayers = new ArrayList<>();
        footballPlayers.add("Yannick Brecher");
        footballPlayers.add("Xherdan Shaqiri");
        footballPlayers.add("Lionel Messi");
        footballPlayers.add("Valon Behrami");
        footballPlayers.add("Breel Embolo");
        footballPlayers.add("Haris Seferovic");
        footballPlayers.add("Granit Xhaka");
        footballPlayers.add("Blerim Dzemaili");

    }
}
