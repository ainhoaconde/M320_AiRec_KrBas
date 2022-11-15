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