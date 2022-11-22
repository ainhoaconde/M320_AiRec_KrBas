# Erarbeitung der Begriffen

#### **Encapsulation:**
Encapsulation => Datenkapselung

Datenverkapselung ist definiert als die Zusammenfassung von Daten in einer einzigen Einheit.
Es ist der Prozess, der den Code und die Daten, die er bearbeitet, miteinander verbindet.
Man kann die Encapsulation auch als einen Schutzschild ansehen 
der den Zugriff auf die Daten durch den Code ausserhalb dieses Schildes verunmöglicht. Das heisst man verhindert das man Daten oder Informationen von aussen zugreiffen kann. 

**Zugriffsarten**
*public (+) :* Zugriff auf alle Objekte
*privat (-) :* Nur für Objekte der eigenen Klasse zugreifbar
*protected (#) :* Zugänglich nur für Objekte der eigenen Klasse von Klassen, die von dieser Klasse abgeleitet sind. 
*package (~) :* Erlaubt den Zugriff für alle Elemente innerhalb des eigenen Pakets

**Vorteile und Nachteile**
  **+ :**  Da die Implementierung einer -Klasse anderen Klassen nicht bekannt ist, kann die Implementierung geändert werden , ohne die Interaktion der anderen Klassen zu unterbrechen.

  **- :** Zusätzlicher Programmieraufwand für das Erstellen von Funktionen
  ***

#### **Information Hiding:**
Es gibt einen Uterschied zwischen Daten Verbergen und Verbergen von Infomation. Dieses Konzept wurde zum erstenmal im Jahr 1972 von David Parnas eingeführt. Dieses Konzept dient dazu um Informationen vom Benutzer zu isolieren. 
***

#### **Getter & Setter:**
Getter und Setter sind Methoden, mit denen die Daten schützen und den Code sicherer gestalten kann. Getter und Setter ermöglichen dem Programmierer das praktische Setzen und Abrufen von Werte für einen bestimmten Datentyp. 

*Getter:* Getter gibt den Rückgabewert zurück (Accessors), d.h. den Wert des Datentyps int, String, double, float, etc. Zur Vereinfachung des Programms beginnt Getter mit dem Wort "get", gefolgt von dem Variablennamen.

*Setter:* Setter hingegen dient zum Setzen oder Aktualisieren des Wertes (Mutatoren). Er setzt den entsprechenden Wert für jede Variable, die in den Programmen einer Klasse verwendet wird, und beginnt mit dem Wort "set", gefolgt vom Variablennamen.
#####Beispiel:
In einer andere Klasse in diesem Beispiel "SoccerClub".
```
public class SoccerClub {
  private String clubName; // private = restricted access

  // Getter
  public String getclubName() {
    return ;
  }

  // Setter
  public void setclubName(String lubName) {
    this.clubName = clubName;
  }
}
```
In der Main Klasse würde es dan Folgendermasse ausehen.
```
public class Main {
  public static void main(String[] args) {
    SoccerClub myObj = new SoccerClub();
    myObj.setclubName("Real Madirid");
    System.out.println(myObj.getclubName());
  }

}
```
Der Output wäre Real Madrid
***

#### **Delegation:**
Delegation => Delegierung 

Mit der Delegation ist das Ziel: 
+ Das Reduzierung der Abhängigkeit der Methoden von ihrer Klasse
+ Komponenten, die sich einheitlich verhalten, wobei man sich darüber im Klaren ist, dass sich diese Situation in Zukunft ändern kann.
+ Wenn man die Funktionalität einer anderen Klasse nutzen müssen, diese aber nicht ändern wollen, verwenden Sie die Delegation statt der Vererbung.

#####Beispiel:

Zuerst müssen man ein Interface kreieren.

```
interface Player {
    public void createPlayer();
}
```
Nachdem dem der Spielr erfolgreich erstellt wurde erstellt man eine Klasse um ein Spieler zu kreieren.

```
class FootballTeams implements Player {
  //createPlayer is from the interface
    public void createPlayer() {
        System.out.println("Player was created");
    }
}
```
Man kann eine weitere Klasse erstellen. 

```
class BestPlayerOfTheWorld implements Player {
    public void createPlayer() {
        System.out.println(" best player was created");
    }
}
```
PlayerCreate stellt eine Implementierung von TravelBooking bereit. 
```
class PlayerCreate implements Player {

    Player P;

    public PlayerCreate(Player P) {
        this.P = P;
    }

    // Delegation --- Here create player responsibility 
    // is delegated to other class using polymorphism

    public void createPlayer() {
        P.createPlayer();
    }
}
```
Zu nächst wird die **Main** Klasse erstellt um das ganze zusammenzufügen.

```
public class Main {

    public static void main(String[] args) {
     // Here PlayerCreate class is internally 
     // delegating Teams Player responsibility to other class
         PlayerCreate player = new PlayerCreate(new FootballTeams ());
         player.FootballTeams();

         player = new PlayerCreate(new BestPlayerOfTheWorld());
         player.createPlayer();
    }
}
```
