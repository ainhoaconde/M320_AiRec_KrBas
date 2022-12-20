# Erarbeitung von Begriffe
***

### Vererbung
***
Um Programmcode zu speichern, aber auch Programmcode wiederzuverwenden, wurde das Konzept der Vererbung geschaffen.Eine bereits bestehende Klasse kann einfach bestellt werdenAttribute und -Methoden können erweitert werden, ohne bestehenden Code zu ändern oder zu kopieren.
### Abstrakte Klass
***
Wird in Java eine Klasse mit dem Schlüsselwort **abstract** deklariert, gilt sie als eine abstrakt Klasse. Abstrakte Klassen können nicht instanziiert werden. In einer abstrakte Klasse befinden sich absrakte Methoden sowie auch "normale" Methoden. Oft werden  abstrakte Klassen als Superklassen ein, die abstrakte Methoden enthalten, welche erst später von abgeleiteten Klassen implementiert werden.
### Interface
***
Im Deutschen bedeutet Interface Schnittstelle. In einem Java Programm wird ein Interface auch als eine Schnittstelle benützt und zwar als Schnittstelle über die ein Objekt auf verschiedene Methoden zugreifen kann, die für mehrere Objekte gelten können.
Ein Java Interface ist eine Art Klasse , die nur aus Konstanten und abstrakten Methoden besteht

### Interface vs. Abstrakte Klass
***
- Interfaces sind quasi ein Codevertrag, der durch eine bestimmte Klasse umgesetzt werden muss.
- Abstrakte Klassen sind ähnlich wie normale Klassen, nur dass sie abstrakte Methoden enthalten können, d. h. Methoden ohne Körper. Abstrakte Klassen können **nicht instanziiert** werden.

| Interface   |    Abstrakte Klass      |
|----------|:-------------:|
|Kann nur statische Endvariablen haben. Eine Interface kann niemals ihren Zustand selbst verändern. |  Kann jede Art von Instanz- oder statischen Variablen haben, veränderlich oder unveränderlich. |
|Eine Klasse kann mehrere Interfaces implementieren. |    Eine Klasse kan nur eine Abstrakte Klasse implementieren  |  
| Kann erweitert werden oder implementiert | Kann nur erweitert werden | 
| Kann kein Konstruktor beinhalten | Kann Konstruktor beinhalten |  
### Polymorophismus
Bedeutung vom Begriff: 
- Poly = verschiedene, viele
- Morphs = Formen, Gestalten
  
Wir sprechen von dynamischem Polymorphismus, wenn wir auch Objekte von Unterklassen, also Spezialisierungen, von dieser auf eine Referenzvariable einer Klasse übertragen können.
```<name of the language>
FussballSpieler = new Spieler("Cristano Ronaldo", "lionel Messi");
```
#### overiding 
Unterklassen können ihre eigenen Methoden haben, um ihr eigenes spezifisches Verhalten zu implementieren.Man kann diese Spezialisierung auch fortsetzen, indem wir Unterklassen dazu bringen, geerbte Methoden zu überschreiben. 
#### overloading
Das Aufladen (overloading ) von Funktionen hat nichts mit Vererbung zu tun. Man kann dies auch in prozeduralen Sprachen implementieren, wo z.B. mehrere Funktionen mit demselben Namen geschrieben werden.
Beim Überladen (overloading ) gibt es mehrere Methoden mit demselben Namen und demselben Rückgabetyp. Der Unterschied liegt lediglich in der Anzahl und den Typen der Parameter.
Auch wenn die Methoden unterschiedliche Rückgabetypen haben, spricht man von Überladen (overloading ).
***