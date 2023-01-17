public class Main {
    public static void main(String[] args) {
        Person coach = new Coach("John", "Doe", 25);
        Person player = new Player(2,"Jane", "Doe", 24);


        Team t1 = new Team("Barca", "Trophy 1");
        Team t2 = new Team("Real", "Trophy 2");

        Match m1 = new Play( "krish", "goldball", "Bernabeu");
        System.out.println("Match 1");
        System.out.println("-------");
        m1.addMatch("Barca", "Real", 2, 1);
        System.out.println("-------");
        System.out.println("Tema 1 details");
        System.out.println("-------");
        System.out.println(t1.name);
        System.out.println(t1.trophys);
        System.out.println("-------");
        System.out.println("Tema players");
        System.out.println("-------");
        coach.showDetails();
        player.showDetails();
        System.out.println("-------");
        System.out.println("tema 2 details");
        System.out.println("-------");
        System.out.println(t2.name);
        System.out.println(t2.trophys);
        System.out.println("-------");
        System.out.println("Tema players");
        System.out.println("-------");


    }
}